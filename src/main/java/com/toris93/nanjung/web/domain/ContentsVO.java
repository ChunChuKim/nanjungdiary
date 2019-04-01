package com.toris93.nanjung.web.domain;

public class ContentsVO {
	private static int contentId;
	private static int categoryId;
	private static String title;
	private static String contents;
	private static String email;
	private static String userName;
	private static int scrapCnt;
	private static int readCnt;
	private static int likeCnt;
	private static String createDate;
	private static String updateDate;
	
	public static int getContentId() {
		return contentId;
	}
	public static void setContentId(int contentId) {
		ContentsVO.contentId = contentId;
	}
	public static int getCategoryId() {
		return categoryId;
	}
	public static void setCategoryId(int categoryId) {
		ContentsVO.categoryId = categoryId;
	}
	public static String getTitle() {
		return title;
	}
	public static void setTitle(String title) {
		ContentsVO.title = title;
	}
	public static String getContents() {
		return contents;
	}
	public static void setContents(String contents) {
		ContentsVO.contents = contents;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		ContentsVO.email = email;
	}
	public static String getUserName() {
		return userName;
	}
	public static void setUserName(String userName) {
		ContentsVO.userName = userName;
	}
	public static int getScrapCnt() {
		return scrapCnt;
	}
	public static void setScrapCnt(int scrapCnt) {
		ContentsVO.scrapCnt = scrapCnt;
	}
	public static int getReadCnt() {
		return readCnt;
	}
	public static void setReadCnt(int readCnt) {
		ContentsVO.readCnt = readCnt;
	}
	public static int getLikeCnt() {
		return likeCnt;
	}
	public static void setLikeCnt(int likeCnt) {
		ContentsVO.likeCnt = likeCnt;
	}
	public static String getCreateDate() {
		return createDate;
	}
	public static void setCreateDate(String createDate) {
		ContentsVO.createDate = createDate;
	}
	public static String getUpdateDate() {
		return updateDate;
	}
	public static void setUpdateDate(String updateDate) {
		ContentsVO.updateDate = updateDate;
	}
	
	
}
