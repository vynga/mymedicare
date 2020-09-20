package com.vynga.insurance.mymedicare.service;

import com.vynga.insurance.mymedicare.dao.MedicareRepository;
import com.vynga.insurance.mymedicare.entity.SubscriberEntity;
import com.vynga.insurance.mymedicare.model.SubscriberModel;
import com.vynga.insurance.mymedicare.util.SubscriberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class SubscriberService {

    @Autowired
    private MedicareRepository medicareRepository;
    @Autowired
    private SubscriberMapper subscriberMapper;


    @Transactional
    public SubscriberEntity CreateSubscriber(SubscriberModel subscriberModel)  throws DataAccessException
    {
        SubscriberEntity subscriberEntity ;
        subscriberEntity  = subscriberMapper.toSubscriberEntity(subscriberModel);
        subscriberEntity = medicareRepository.save(subscriberEntity);
        return subscriberEntity;

    }

    public List<SubscriberEntity> findAllSubscribers()
    {
       List<SubscriberEntity > subscriberEntity=medicareRepository.findAll();
       return  subscriberEntity;


    }
    public  Optional findSubscriberById(int id) throws DataAccessException
    {
       Optional<SubscriberEntity> optional=medicareRepository.findById(id) ;
       return  optional;
    }

    public ResponseEntity<SubscriberEntity>updateSubscriberById(int id,SubscriberModel subscriberModel)
    {
        SubscriberEntity subscriberEntity=subscriberMapper.toSubscriberEntity(subscriberModel);
        subscriberEntity.setId(id);
        subscriberEntity=medicareRepository.save(subscriberEntity);
        return  new ResponseEntity<>(subscriberEntity, HttpStatus.OK);

    }
    public void deleteSubscriber(int id)
    {
        medicareRepository.deleteById(id);


    }


}
