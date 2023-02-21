package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.StaffsData;
import com.example.model.StaffModel;
import com.example.service.IStaffService;

@RestController
@RequestMapping("/api/v1/staff")
public class StaffController {

	@Autowired
	private IStaffService service;

	@PostMapping()
	public StaffModel staffModel(@RequestBody StaffModel model) {
		System.out.println(model);
		return service.create(model);
	}

	@GetMapping()
	public List<StaffModel> list() {
		return service.getAllStaff();
	}

	@GetMapping("/{id}")
	public Optional<StaffsData> getById(@PathVariable Long id) {
		return service.getById(id);

	}

	@DeleteMapping("/{id}")
	public StaffModel deleteById(@PathVariable Long id) {
		return service.delete(id);
	}

	@PutMapping("/{id}")
	public ResponseEntity<StaffModel> update(@PathVariable("id") Long id, @RequestBody StaffModel model) {
		StaffModel data = service.update(model, id);
		return new ResponseEntity<StaffModel>(data, HttpStatus.OK);

	}

}
