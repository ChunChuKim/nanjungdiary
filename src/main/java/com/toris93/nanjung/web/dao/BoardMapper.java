package com.toris93.nanjung.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.toris93.nanjung.web.domain.BoardVO;
import com.toris93.nanjung.web.domain.FileVO;

@Repository("com.toris93.nanjung.web.dao.BoardMapper")
@Mapper
public interface BoardMapper {

	public int boardCount();
	//게시글 목록  
    public List<BoardVO> boardList();
    
    //게시글 상세
    public BoardVO boardDetail(int bno);
    
    //게시글 작성  
    public int boardInsert(BoardVO board);
    
    //게시글 수정  
    public int boardUpdate(BoardVO board);
    
    //게시글 삭제  
    public int boardDelete(int bno);
    
    public int fileInsert(FileVO file);

    //파일 상세
    public FileVO fileDetail(int bno);



}
