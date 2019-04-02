package com.toris93.nanjung.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.toris93.nanjung.web.domain.CommentVO;

@Repository("com.example.demo.board.mapper.CommentMapper")
@Mapper
public interface CommentMapper {

	// 댓글 개수
    public int commentCount(int bno);
 
    // 댓글 목록
    public List<CommentVO> commentList(int bno);
 
    // 댓글 작성
    public int commentInsert(CommentVO comment);
    
    // 댓글 수정
    public int commentUpdate(CommentVO comment);
 
    // 댓글 삭제
    public int commentDelete(int cno);


}
