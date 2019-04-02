package com.toris93.nanjung.web.service;

import java.util.List;

import com.toris93.nanjung.web.domain.BoardVO;
import com.toris93.nanjung.web.domain.FileVO;

public interface BoardService {
 
    
    public List<BoardVO> boardListService();
    
    public BoardVO boardDetailService(int bno);
    
    public int boardInsertService(BoardVO board);
    
    public int fileInsertService(FileVO file);

    public FileVO fileDetailService(int bno);


    public int boardUpdateService(BoardVO board);
    
    public int boardDeleteService(int bno);
}


