package com.vynga.insurance.mymedicare.dao;

import com.vynga.insurance.mymedicare.entity.InsuranceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<InsuranceEntity,Integer> {
}
