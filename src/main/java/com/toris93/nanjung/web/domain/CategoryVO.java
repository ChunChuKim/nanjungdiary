package com.toris93.nanjung.web.domain;

public class CategoryVO {

	private static String categoryId;
	private static String categoryName;
	public static String getCategoryId() {
		return categoryId;
	}
	public static void setCategoryId(String categoryId) {
		CategoryVO.categoryId = categoryId;
	}
	public static String getCategoryName() {
		return categoryName;
	}
	public static void setCategoryName(String categoryName) {
		CategoryVO.categoryName = categoryName;
	}
	
	
}
