package com.vynga.insurance.mymedicare.util;

import com.vynga.insurance.mymedicare.entity.InsuranceEntity;
import com.vynga.insurance.mymedicare.model.InsuranceModel;
import org.mapstruct.Mapper;

import javax.swing.*;

@Mapper(componentModel = "spring")

public interface InsuranceMapper {
    public InsuranceEntity  toInsuranceEntity(InsuranceModel insuranceModel);
    public InsuranceModel toInsuranceModel(InsuranceEntity insuranceEntity);



}
