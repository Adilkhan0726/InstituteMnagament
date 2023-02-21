package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.FeesData;

@Repository
public interface FeesRepository extends JpaRepository<FeesData, Long> {

}
