package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.FeesData;
import com.example.model.FeesModel;
import com.example.service.IFeesService;

@RestController
@RequestMapping("/api/v1/fees")
public class FeesController {
     
	@Autowired
	private IFeesService service;

	@PostMapping()
	public FeesModel getFees(@RequestBody FeesModel model) {
		System.out.println(model);
		return service.create(model);
	}
	@GetMapping()
	public List<FeesData> list() {
		return service.getFeesDetails();
	}
}
