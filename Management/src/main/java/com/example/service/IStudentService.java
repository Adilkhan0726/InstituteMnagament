package com.example.service;

import java.util.List;

import com.example.entity.StudentData;
import com.example.model.StudentModel;

public interface IStudentService {

	public StudentModel create(StudentModel student);

	public StudentData create(StudentData studentRecord);

	public List<StudentData> get();

	public void updateStudentRecord(StudentData studentRecord);

	public void delete(Long id);

	public StudentData getStudentByName(String name);

	public StudentModel getById(Long id);

	public StudentData fName(String fatherName);

	public StudentData getByPincode(int pincode);

}
