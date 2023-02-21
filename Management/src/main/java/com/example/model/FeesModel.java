package com.example.model;

import java.util.Date;

public class FeesModel {
	private Long id;
	private String courseName;
	private int fees;
	private Date date;

	public FeesModel() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "FeesModel [id=" + id + ", courseName=" + courseName + ", fees=" + fees + ", date=" + date + "]";
	}

}
