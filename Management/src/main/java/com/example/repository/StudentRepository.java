package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.StudentData;
import com.example.model.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentData, Long> {

	void save(StudentModel studentModel);

	StudentData findByName(String name);

	StudentData findByFatherName(String fatherName);

	StudentData getByPincode(int pincode);

}
