package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.StudentData;
import com.example.model.StudentModel;
import com.example.service.IStudentService;

@RestController
@RequestMapping("api/v1/student")
public class StduentController {

	@Autowired
	private IStudentService service;

	@PostMapping()
	public StudentModel studentModel(@RequestBody StudentModel model) {
		this.service.create(model);
		System.out.println("Student Record" + model);
		return model;

	}

	@GetMapping()
	public List<StudentData> list() {
		return service.get();
	}

	@GetMapping("/{id}")
	public StudentModel getById(@PathVariable Long id) {
		return service.getById(id);
	}

	@DeleteMapping("/{id}")
	public String deleteId(@PathVariable Long id) {
		service.delete(id);
		System.out.println("delete student" + id);
		return "deleted successfully id = " + id;
	}

	@GetMapping("/getByName/{name}")
	public StudentData getByName(@PathVariable String name) {
		System.out.println("Required Studentname: " + name);
		return service.getStudentByName(name);
	}

	@GetMapping("/fName/{fatherName}")
	public StudentData findbyFName(@PathVariable String fatherName) {
		System.out.println("Required Fathername: " + fatherName);
		return service.fName(fatherName);

	}

	@GetMapping("/pincode/{pincode}")
	public StudentData getByPincode(@PathVariable int pincode) {
		System.out.println("Required pincode: " + pincode);
		return service.getByPincode(pincode);

	}

}
