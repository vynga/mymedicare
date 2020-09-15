package com.vynga.insurance.mymedicare.controller;

import com.vynga.insurance.mymedicare.entity.DependentEntity;
import com.vynga.insurance.mymedicare.model.DependentModel;
import com.vynga.insurance.mymedicare.service.DependentService;
import com.vynga.insurance.mymedicare.util.SubscriberNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


/**
 *Controller for Creating,Reading,Udating and Deleting Health Dependent details
 * like
 * name,dob,enroleid
 *
 */

@RestController
public class DependentController {
@Autowired
    private DependentService dependentService;
    @PostMapping("/dependent")
    public ResponseEntity<DependentEntity> CreateDependent(@RequestBody DependentModel dependentModel)
    {
        DependentEntity dependentEntity=dependentService.CreateDependent(dependentModel);
        return  new ResponseEntity<DependentEntity>(dependentEntity, HttpStatus.CREATED);
    }

    @GetMapping("/dependents")

    public List<DependentEntity> getAllDependents()
    {
        return dependentService.getAllDependents();
    }


    @GetMapping("/dependent/{id}")
    public DependentEntity getDependentById(@PathVariable("id") Integer id)
    {
        Optional<DependentEntity> optional=dependentService.getDependentById(id);
        if(!optional.isPresent())
        {
            throw new SubscriberNotFoundException("id-" + id);
        }

        return optional.get();
    }
    @PutMapping("/dependent/{id}")

    public void updateDependentById(@RequestBody DependentModel dependentModel,@PathVariable("id") Integer id)
    {
        dependentService.updateDependentById(dependentModel,id);
    }
    @DeleteMapping("/dependent/{id}")
    public void deleteDependentById(@PathVariable("id")  Integer id)
    {
        dependentService.deleteDependentById(id);
    }
}
