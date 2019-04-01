package com.toris93.nanjung.web.domain;

public class CommentVO {

	private static String commentId;
	private static String contentId;
	private static String comment;
	private static String email;
	private static String userName;
	private static String createDate;
	private static String updateDate;
	public static String getCommentId() {
		return commentId;
	}
	public static void setCommentId(String commentId) {
		CommentVO.commentId = commentId;
	}
	public static String getContentId() {
		return contentId;
	}
	public static void setContentId(String contentId) {
		CommentVO.contentId = contentId;
	}
	public static String getComment() {
		return comment;
	}
	public static void setComment(String comment) {
		CommentVO.comment = comment;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		CommentVO.email = email;
	}
	public static String getUserName() {
		return userName;
	}
	public static void setUserName(String userName) {
		CommentVO.userName = userName;
	}
	public static String getCreateDate() {
		return createDate;
	}
	public static void setCreateDate(String createDate) {
		CommentVO.createDate = createDate;
	}
	public static String getUpdateDate() {
		return updateDate;
	}
	public static void setUpdateDate(String updateDate) {
		CommentVO.updateDate = updateDate;
	}
	
	
}
