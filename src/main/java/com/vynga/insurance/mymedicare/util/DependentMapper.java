package com.vynga.insurance.mymedicare.util;

import com.vynga.insurance.mymedicare.entity.DependentEntity;
import com.vynga.insurance.mymedicare.model.DependentModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DependentMapper {

    public DependentEntity toDependentEntity(DependentModel dependentModel);
    public DependentModel toDependentModel(DependentEntity dependentEntity);

}
