package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.StaffsData;



@Repository
public interface StaffRepository extends JpaRepository<StaffsData, Long> {
	
}
