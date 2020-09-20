package com.vynga.insurance.mymedicare.controller;

import com.vynga.insurance.mymedicare.dao.InsuranceRepository;
import com.vynga.insurance.mymedicare.entity.InsuranceEntity;
import com.vynga.insurance.mymedicare.entity.SubscriberEntity;
import com.vynga.insurance.mymedicare.model.SubscriberModel;
import com.vynga.insurance.mymedicare.service.SubscriberService;
import com.vynga.insurance.mymedicare.util.SubscriberNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
public class SubscriberController {



    @Autowired
    InsuranceRepository insuranceRepository;

    /**
     *Controller for Creating,Reading,Udating and Deleting Health Enrollee details
     * like
     * name,dob,phoneno
     *
     */
    @Autowired
    private SubscriberService subscriberService;
    @PostMapping ("/subscriber")
    public ResponseEntity<SubscriberEntity> saveSubscriber(@RequestBody SubscriberModel subscriberModel)
    {

      Set<InsuranceEntity> insuranceEntityHashSet =  new HashSet<InsuranceEntity>();

     subscriberModel.getInsuranceEntityHashSet().forEach(x ->  {

        if(insuranceRepository.findById(x.getId()).isPresent()){
            InsuranceEntity insuranceEntity = insuranceRepository.findById(x.getId()).get();
            insuranceEntityHashSet.add(insuranceEntity);
        }
     }
    );
        subscriberModel.getInsuranceEntityHashSet().clear();
        subscriberModel.getInsuranceEntityHashSet().addAll(insuranceEntityHashSet);
        ResponseEntity responseEntity;
            SubscriberEntity subscriberEntity = subscriberService.CreateSubscriber(subscriberModel);
            responseEntity =  new ResponseEntity(subscriberEntity, HttpStatus.CREATED);
      return responseEntity;
    }

    @GetMapping("/subscribers")
    public List<SubscriberEntity> getAllSubscribers()
    {
    return subscriberService.findAllSubscribers();
    }

    @GetMapping("subscriber/{id}")
    public SubscriberEntity getSubscriberById(@PathVariable("id")  Integer id)
    {
       Optional<SubscriberEntity>   optional = subscriberService.findSubscriberById(id);
        if(!optional.isPresent())
        {
           throw new SubscriberNotFoundException("id-" + id);
        }

      return optional.get();
    }

    @PutMapping("/subscriber/{id}")
    public ResponseEntity<SubscriberEntity> updateSubScriber(@PathVariable("id") Integer id,@RequestBody SubscriberModel subscriberModel)
    {
        return  subscriberService.updateSubscriberById(id,subscriberModel);
    }
    @DeleteMapping("subscriber/{id}")
    public  void deleteSubscriberById(@PathVariable("id") Integer id)
    {
        subscriberService.deleteSubscriber(id);

    }


}
