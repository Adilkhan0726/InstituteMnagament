package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.FeesData;
import com.example.model.FeesModel;
import com.example.repository.FeesRepository;
import com.example.service.IFeesService;

@Service
public class FeesImpl implements IFeesService {
	
	@Autowired
	private FeesRepository repository;

	@Override
	public FeesModel create(FeesModel model) {
		FeesData data = modelToEntity(model);
		repository.save(data);
		return model;
	}
	@Override
	public List<FeesData> getFeesDetails() {
		return (List<FeesData>)repository.findAll();
	}
	private FeesData modelToEntity(FeesModel model) {
		FeesData data = new FeesData();
		data.setId(model.getId());
		data.setCourseName(model.getCourseName());
		data.setDate(model.getDate());
		data.setFees(model.getFees());
		return data;

	}



}
