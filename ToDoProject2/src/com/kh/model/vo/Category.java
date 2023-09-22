package com.kh.model.vo;

public class Category {

	private int categoryId;
	private String categoryName;
	private int userNo;
	
	public Category() {
		super();
	}

	public Category(int categoryId, String categoryName, int userNo) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.userNo = userNo;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	@Override
	public String toString() {
		return categoryId + ", " + categoryName + ", " + userNo;
	}
	
	
	
}
