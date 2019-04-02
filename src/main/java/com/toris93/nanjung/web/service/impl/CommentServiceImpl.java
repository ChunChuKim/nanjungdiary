package com.toris93.nanjung.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toris93.nanjung.web.dao.CommentMapper;
import com.toris93.nanjung.web.domain.CommentVO;
import com.toris93.nanjung.web.service.CommentService;

@Service("com.toris93.nanjung.web.service.CommentService")
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentMapper mCommentMapper;

	@Override
	public List<CommentVO> commentListService(int bno) {

		return mCommentMapper.commentList(bno);
	}

	@Override
	public int commentInsertService(CommentVO comment) {

		return mCommentMapper.commentInsert(comment);
	}

	@Override
	public int commentUpdateService(CommentVO comment) {

		return mCommentMapper.commentUpdate(comment);
	}

	@Override
	public int commentDeleteService(int cno) {

		return mCommentMapper.commentDelete(cno);
	}
}