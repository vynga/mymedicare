package com.vynga.insurance.mymedicare.dao;

import com.vynga.insurance.mymedicare.entity.SubscriberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MedicareRepository extends JpaRepository<SubscriberEntity,Integer> {

}
