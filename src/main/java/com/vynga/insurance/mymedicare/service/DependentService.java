package com.vynga.insurance.mymedicare.service;

import com.vynga.insurance.mymedicare.dao.DependentRepository;
import com.vynga.insurance.mymedicare.dao.MedicareRepository;
import com.vynga.insurance.mymedicare.entity.DependentEntity;
import com.vynga.insurance.mymedicare.entity.SubscriberEntity;
import com.vynga.insurance.mymedicare.model.DependentModel;
import com.vynga.insurance.mymedicare.util.DependentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DependentService {
    @Autowired
    private DependentRepository  dependentRepository;
    @Autowired
    private MedicareRepository medicareRepository;
    @Autowired
    private DependentMapper dependentMapper;
    public DependentEntity CreateDependent(DependentModel dependentModel)
    {
        DependentEntity dependentEntity=dependentMapper.toDependentEntity(dependentModel);

        if(medicareRepository.findById(dependentModel.getSubid()).isPresent()) {
            SubscriberEntity subscriber = medicareRepository.findById(dependentModel.getSubid()).get();
            dependentEntity.setSubscriber(subscriber);
            dependentEntity = dependentRepository.save(dependentEntity);
        }
       return  dependentEntity;


    }

    public List<DependentEntity> getAllDependents()
    {
     List<DependentEntity> dependentEntityList=dependentRepository.findAll();
       return dependentEntityList;

    }
    public void updateDependentById(DependentModel dependentModel,int id)
    {
        DependentEntity dependentEntity=dependentMapper.toDependentEntity(dependentModel);
        if(medicareRepository.findById(id).isPresent()) {
            dependentEntity.setSubscriber(medicareRepository.findById(id).get());
            dependentRepository.save(dependentEntity);
        }

    }
    public Optional getDependentById(int id)
    {
       Optional <DependentEntity> optional=dependentRepository.findById(id);
       return optional;

    }

    public void deleteDependentById(int id)
    {
        dependentRepository.deleteById(id);
    }

}
