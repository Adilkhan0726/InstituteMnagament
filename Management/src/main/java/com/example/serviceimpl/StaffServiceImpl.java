package com.example.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.StaffsData;
import com.example.model.StaffModel;
import com.example.model.StudentModel;
import com.example.repository.StaffRepository;
import com.example.service.IStaffService;

@Service
public class StaffServiceImpl implements IStaffService {

	@Autowired
	private StaffRepository staffRepository;

	@Override
	public StaffModel create(StaffModel model) {
		StaffsData staffsData = new StaffsData();
		staffsData.setId(model.getId());
		staffsData.setName(model.getName());
		staffsData.setStaffType(model.getStaffType());
		staffsData.setAddress(model.getAddress());
		staffsData.setSalary(model.getSalary());
		staffsData.setAge(model.getAge());
		staffsData.setStaffType(model.getStaffType());
		staffRepository.save(staffsData);
		model.setId(staffsData.getId());
		return model;
	}

	@Override
	public List<StaffModel> getAllStaff() {
		
		List<StaffsData>entities=staffRepository.findAll();
		List<StaffModel>list=new ArrayList<>();
		
		for (StaffsData data : entities) {
				if(null!=data) {
					StaffModel model=new StaffModel();
					model.setName(data.getName());
					model.setId(data.getId());
					list.add(model);
				}
		}
		return list;
	}

	@Override
	public Optional<StaffsData> getById(Long id) {
		return staffRepository.findById(id);
	}

	@Override
	public StaffModel delete(Long id) {
		Optional<StaffsData>optional=staffRepository.findById(id);
		StaffModel model=null;
		if(optional.isPresent()) {
			model=new StaffModel();
			model.setId(optional.get().getId());
			model.setName(optional.get().getName());
			staffRepository.deleteById(id);
			return model;
		}
		staffRepository.deleteById(id);
		return null;
	}

	@Override
	public StaffModel update(StaffModel model, Long id) {
			Optional<StaffsData> optional=staffRepository.findById(id);
			if(optional.isPresent()) {
				StaffsData data=optional.get();
				data.setName(model.getName());
				data.setAge(model.getAge());
				data.setAddress(model.getAddress());
				staffRepository.save(data);
				model.setId(data.getId());
				return model;
			}
			return null;
	}
}
