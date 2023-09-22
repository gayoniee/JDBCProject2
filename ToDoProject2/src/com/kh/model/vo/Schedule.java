package com.kh.model.vo;

import java.sql.Date;

public class Schedule {
	
	private int scheduleId;
	private String title;
	private String detail;
	private Date deadline;
	private String clear;
	private int categoryId;
	
	public Schedule() {
		super();
	}

	
	
	public Schedule(String title, String detail, Date deadline, String clear, int categoryId) {
		this.title = title;
		this.detail = detail;
		this.deadline = deadline;
		this.clear = clear;
		this.categoryId = categoryId;
	}


	public Schedule(int scheduleId, String title, String detail, Date deadline, String clear, int categoryId) {
		super();
		this.scheduleId = scheduleId;
		this.title = title;
		this.detail = detail;
		this.deadline = deadline;
		this.clear = clear;
		this.categoryId = categoryId;
	}

	public Schedule(String title, String detail, Date deadline) {
		this.title = title;
		this.detail = detail;
		this.deadline = deadline;
	}



	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public String getClear() {
		return clear;
	}

	public void setClear(String clear) {
		this.clear = clear;
	}

	@Override
	public String toString() {
		return  title + ", " + detail + ", " + deadline + ", " + clear + ", " + categoryId;
	}
	
	
	
}
