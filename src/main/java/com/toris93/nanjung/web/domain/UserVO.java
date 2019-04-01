package com.toris93.nanjung.web.domain;

public class UserVO {
	private static String idx;
	private static String email;
	private static String name;
	private static String password;
	private static String createDate;
	public static String getIdx() {
		return idx;
	}
	public static void setIdx(String idx) {
		UserVO.idx = idx;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		UserVO.email = email;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		UserVO.name = name;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		UserVO.password = password;
	}
	public static String getCreateDate() {
		return createDate;
	}
	public static void setCreateDate(String createDate) {
		UserVO.createDate = createDate;
	}
	
	
}
