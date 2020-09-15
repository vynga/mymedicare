package com.vynga.insurance.mymedicare.dao;

import com.vynga.insurance.mymedicare.entity.DependentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DependentRepository  extends JpaRepository<DependentEntity,Integer> {
}
