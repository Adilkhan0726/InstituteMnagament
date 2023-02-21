package com.example.model;

import com.example.staffenumtype.StaffType;

public class StaffModel {
	private Long id;
	private StaffType staffType;
	private String name;
	private Long age;
	private String address;
	private int salary;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public StaffType getStaffType() {
		return staffType;
	}
	public void setStaffType(StaffType staffType) {
		this.staffType = staffType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "StaffModel [id=" + id + ", staffType=" + staffType + ", name=" + name + ", age=" + age + ", address="
				+ address + ", salary=" + salary + "]";
	}

	

}
