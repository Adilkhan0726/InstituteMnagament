package com.example.model;

public class StudentModel {

	private Long id;
	private String name;
	private String lastName;
	private String CourseName;
	private String address;
	private int pincode;
	private String fatherName;

	public StudentModel() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", lastName=" + lastName + ", CourseName=" + CourseName
				+ ", address=" + address + ", pincode=" + pincode + ", fatherName=" + fatherName + "]";
	}

}
