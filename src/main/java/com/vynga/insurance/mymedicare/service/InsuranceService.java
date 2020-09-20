package com.vynga.insurance.mymedicare.service;

import com.vynga.insurance.mymedicare.dao.InsuranceRepository;
import com.vynga.insurance.mymedicare.dao.MedicareRepository;
import com.vynga.insurance.mymedicare.entity.DependentEntity;
import com.vynga.insurance.mymedicare.entity.InsuranceEntity;
import com.vynga.insurance.mymedicare.entity.SubscriberEntity;
import com.vynga.insurance.mymedicare.model.InsuranceModel;
import com.vynga.insurance.mymedicare.util.InsuranceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceService {
    @Autowired
    private InsuranceRepository insuranceRepository;
    @Autowired
    private MedicareRepository medicareRepository;
    @Autowired
    private InsuranceMapper insuranceMapper;

    public InsuranceEntity createInsurance(InsuranceModel insuranceModel)
    {
        InsuranceEntity insuranceEntity=insuranceMapper.toInsuranceEntity(insuranceModel);
        insuranceEntity=insuranceRepository.save(insuranceEntity);
        return insuranceEntity;
    }

    public List<InsuranceEntity> getAllInsuarance()
    {
        List<InsuranceEntity> insuranceEntities =insuranceRepository.findAll();
        return insuranceEntities;

    }


    }


