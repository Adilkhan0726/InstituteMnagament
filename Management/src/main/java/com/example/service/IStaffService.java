package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.StaffsData;
import com.example.model.StaffModel;

public interface IStaffService {

	public StaffModel create(StaffModel staffModel);

	public List<StaffModel> getAllStaff();

	public Optional<StaffsData> getById(Long id);

	public StaffModel delete(Long id);

	public StaffModel update(StaffModel model, Long id);

}
