package com.example.service;

import java.util.List;

import com.example.entity.FeesData;
import com.example.model.FeesModel;

public interface IFeesService {
	public FeesModel create(FeesModel model);

	public List<FeesData> getFeesDetails();

}
