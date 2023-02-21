package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.StudentData;
import com.example.model.StudentModel;
import com.example.repository.StudentRepository;
import com.example.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public StudentModel create(StudentModel student) {
		StudentData studentRecord = modelToEntity(student);
		repository.save(studentRecord);
		return student;
	}

	@Override
	public List<StudentData> get() {
		return (List<StudentData>) repository.findAll();
	}

	@Override
	public void updateStudentRecord(StudentData studentRecord) {

	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public StudentModel getById(Long id) {
		Optional<StudentData> optional = repository.findById(id);
		StudentData data = optional.get();
		StudentModel model = null;
		if (optional.isPresent()) {
			model = new StudentModel();
			model.setId(id);
			model.setName(data.getName());
			model.setLastName(data.getLastName());
			model.setAddress(data.getAddress());
			model.setFatherName(data.getFatherName());
			model.setCourseName(data.getCourseName());
			model.setPincode(data.getPincode());
		} else {
			System.out.println("thid id is different!!");
		}
		return model;
	}

	@Override
	public StudentData getStudentByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public StudentData create(StudentData studentRecord) {
		StudentModel studentModel = entityToModel(studentRecord);
		repository.save(studentModel);
		return studentRecord;
	}

	@Override
	public StudentData fName(String fatherName) {
		return repository.findByFatherName(fatherName);

	}

	@Override
	public StudentData getByPincode(int pincode) {
		return repository.getByPincode(pincode);
	}

	private StudentModel entityToModel(StudentData studentRecord) {
		StudentModel studentModel = new StudentModel();
		studentModel.setId(studentRecord.getId());
		studentModel.setName(studentRecord.getName());
		studentModel.setCourseName(studentRecord.getCourseName());
		studentModel.setAddress(studentRecord.getAddress());
		studentModel.setFatherName(studentRecord.getFatherName());
		studentModel.setPincode(studentRecord.getPincode());
		return studentModel;
	}

	private StudentData modelToEntity(StudentModel Studentmodel) {
		StudentData studentRecord = new StudentData();
		studentRecord.setId(Studentmodel.getId());
		studentRecord.setName(Studentmodel.getName());
		studentRecord.setLastName(Studentmodel.getLastName());
		studentRecord.setFatherName(Studentmodel.getFatherName());
		studentRecord.setCourseName(Studentmodel.getCourseName());
		studentRecord.setAddress(Studentmodel.getAddress());
		studentRecord.setPincode(Studentmodel.getPincode());
		return studentRecord;

	}

}
