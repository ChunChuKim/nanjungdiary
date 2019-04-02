package com.toris93.nanjung.web.service;

import java.util.List;

import com.toris93.nanjung.web.domain.CommentVO;

public interface CommentService {

	public List<CommentVO> commentListService(int bno);

	public int commentInsertService(CommentVO comment);

	public int commentUpdateService(CommentVO comment);

	public int commentDeleteService(int cno);
	
}
