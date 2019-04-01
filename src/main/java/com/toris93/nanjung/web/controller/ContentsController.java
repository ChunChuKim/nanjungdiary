package com.toris93.nanjung.web.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.toris93.nanjung.web.domain.ContentsVO;
import com.toris93.nanjung.web.domain.FileVO;
import com.toris93.nanjung.web.service.ContentsService;

@Controller
public class ContentsController {

	@Resource(name = "com.toris93.nanjung.web.service.ContentsService")
	ContentsService contentsService;
	
	@RequestMapping("/list") // 게시판 리스트 화면 호출
	private String contentsList(Model model) throws Exception {

		model.addAttribute("list", contentsService.contentsListService());

		return "list"; // 생성할 jsp
	}

	@RequestMapping("/detail/{bno}")
	private String contentsDetail(@PathVariable int bno, Model model) throws Exception {

		model.addAttribute("detail", contentsService.contentsDetailService(bno));
		model.addAttribute("files", contentsService.fileDetailService(bno)); //추가

		return "detail";
	}

	@RequestMapping("/insert") // 게시글 작성폼 호출
	private String contentsInsertForm() {

		return "insert";
	}

	@RequestMapping("/insertProc")
	private String contentsInsertProc(HttpServletRequest request, @RequestPart MultipartFile files) throws Exception {

		ContentsVO contents = new ContentsVO();
		FileVO  file  = new FileVO();

		contents.setTitle(request.getParameter("subject"));
		contents.setContents(request.getParameter("content"));
		contents.setEmail(request.getParameter("writer"));

		if (files.isEmpty()) { // 업로드할 파일이 없을 시
			contentsService.contentsInsertService(contents); // 게시글 insert
		} else {

			String fileName = files.getOriginalFilename(); 
            String fileNameExtension = contentsService.getExtension(fileName).toLowerCase(); 
            File destinationFile; 
            String destinationFileName; 

			String fileUrl = "/Users/stivek/Documents/workspace-spring-tool-suite-4-4.0.0.RELEASE/demo/src/main/webapp/WEB-INF/uploadfile/";

			do { 
                destinationFileName = RandomStringUtils.randomAlphanumeric(32) + "." + fileNameExtension; 
                destinationFile = new File(fileUrl+ destinationFileName); 
            } while (destinationFile.exists()); 
            
            destinationFile.getParentFile().mkdirs(); 
            files.transferTo(destinationFile); 
            
            contentsService.contentsInsertService(contents); //게시글 insert

			file.setBno(contents.getContentId());
			file.setFileName(destinationFileName);
			file.setFileOriName(fileName);
			file.setFileUrl(fileUrl);

			contentsService.fileInsertService(file); // file insert
		}

		return "redirect:/list";
	}

	@RequestMapping("/update/{bno}") // 게시글 수정폼 호출
	private String contentsUpdateForm(@PathVariable int bno, Model model) throws Exception {

		model.addAttribute("detail", contentsService.contentsDetailService(bno));
		model.addAttribute("files", contentsService.fileDetailService(bno)); //추가

		return "update";
	}

	@RequestMapping("/updateProc")
	private String contentsUpdateProc(HttpServletRequest request) throws Exception {

		ContentsVO contents = new ContentsVO();
		contents.setTitle(request.getParameter("subject"));
		contents.setContents(request.getParameter("content"));
		contents.setContentId(Integer.parseInt(request.getParameter("bno")));

		contentsService.contentsUpdateService(contents);

		return "redirect:/detail/" + request.getParameter("bno");
	}

	@RequestMapping("/delete/{bno}")
	private String contentsDelete(@PathVariable int bno) throws Exception {

		contentsService.contentsDeleteService(bno);

		return "redirect:/list";
	}
	
	@RequestMapping("/fileDown/{bno}")
    private void fileDown(@PathVariable int bno, HttpServletRequest request, HttpServletResponse response) throws Exception{
        
        request.setCharacterEncoding("UTF-8");
        FileVO fileVO = contentsService.fileDetailService(bno);
        
        //파일 업로드된 경로 
        try{
            String fileUrl = fileVO.getFileUrl();
            fileUrl += "/";
            String savePath = fileUrl;
            String fileName = fileVO.getFileName();
            
            //실제 내보낼 파일명 
            String oriFileName = fileVO.getFileOriName();
            InputStream in = null;
            OutputStream os = null;
            File file = null;
            boolean skip = false;
            String client = "";
            
            //파일을 읽어 스트림에 담기  
            try{
                file = new File(savePath, fileName);
                in = new FileInputStream(file);
            } catch (FileNotFoundException fe) {
                skip = true;
            }
            
            client = request.getHeader("User-Agent");
            
            //파일 다운로드 헤더 지정 
            response.reset();
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Description", "JSP Generated Data");
            
            if (!skip) {
                // IE
                if (client.indexOf("MSIE") != -1) {
                    response.setHeader("Content-Disposition", "attachment; filename=\""
                            + java.net.URLEncoder.encode(oriFileName, "UTF-8").replaceAll("\\+", "\\ ") + "\"");
                    // IE 11 이상.
                } else if (client.indexOf("Trident") != -1) {
                    response.setHeader("Content-Disposition", "attachment; filename=\""
                            + java.net.URLEncoder.encode(oriFileName, "UTF-8").replaceAll("\\+", "\\ ") + "\"");
                } else {
                    // 한글 파일명 처리
                    response.setHeader("Content-Disposition",
                            "attachment; filename=\"" + new String(oriFileName.getBytes("UTF-8"), "ISO8859_1") + "\"");
                    response.setHeader("Content-Type", "application/octet-stream; charset=utf-8");
                }
                response.setHeader("Content-Length", "" + file.length());
                os = response.getOutputStream();
                byte b[] = new byte[(int) file.length()];
                int leng = 0;
                while ((leng = in.read(b)) > 0) {
                    os.write(b, 0, leng);
                }
            } else {
                response.setContentType("text/html;charset=UTF-8");
                System.out.println("<script language='javascript'>alert('파일을 찾을 수 없습니다');history.back();</script>");
            }
            in.close();
            os.close();
        } catch (Exception e) {
            System.out.println("ERROR : " + e.getMessage());
        }
        
    }
}