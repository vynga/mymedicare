package com.vynga.insurance.mymedicare.controller;


import com.vynga.insurance.mymedicare.entity.InsuranceEntity;
import com.vynga.insurance.mymedicare.model.InsuranceModel;
import com.vynga.insurance.mymedicare.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InsuranceController {
    @Autowired
    private InsuranceService insuranceService;


    @PostMapping("/insuarance")
    public ResponseEntity<InsuranceEntity> CreateInsurance(@RequestBody InsuranceModel insuranceModel)
    {
        InsuranceEntity insuranceEntity = insuranceService.createInsurance(insuranceModel);
        return  new ResponseEntity<InsuranceEntity>(insuranceEntity, HttpStatus.CREATED);
    }
    @GetMapping("/insuarance")
    public List<InsuranceEntity> getAllDependents()
    {
        return insuranceService.getAllInsuarance();
    }


}
