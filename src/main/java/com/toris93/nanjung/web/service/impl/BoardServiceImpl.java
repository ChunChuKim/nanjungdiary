package com.toris93.nanjung.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.toris93.nanjung.web.dao.BoardMapper;
import com.toris93.nanjung.web.domain.BoardVO;
import com.toris93.nanjung.web.domain.FileVO;
import com.toris93.nanjung.web.service.BoardService;

@Service("com.toris93.nanjung.web.service.BoardService")
public class BoardServiceImpl implements BoardService{
 
    @Resource(name="com.toris93.nanjung.web.dao.BoardMapper")
    BoardMapper mBoardMapper;
    
    public List<BoardVO> boardListService(){
        
        return mBoardMapper.boardList();
    }
    
    public BoardVO boardDetailService(int bno){
        
        return mBoardMapper.boardDetail(bno);
    }
    
    public int boardInsertService(BoardVO board){
        
        return mBoardMapper.boardInsert(board);
    }
    
    public int fileInsertService(FileVO file){
        return mBoardMapper.fileInsert(file);
    }

    public FileVO fileDetailService(int bno){
        
        return mBoardMapper.fileDetail(bno);
    }


    public int boardUpdateService(BoardVO board){
        
        return mBoardMapper.boardUpdate(board);
    }
    
    public int boardDeleteService(int bno){
        
        return mBoardMapper.boardDelete(bno);
    }
}


