package com.vynga.insurance.mymedicare.model;

import com.vynga.insurance.mymedicare.entity.SubscriberEntity;

import java.time.LocalDate;


public class DependentModel {

    private  int id ;
    private String dname;
    private int subid;
    private LocalDate dob;
    private SubscriberEntity subscriber;

    public SubscriberEntity getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(SubscriberEntity subscriber) {
        this.subscriber = subscriber;
    }

    public DependentModel(int id, String dname, int subid, LocalDate dob) {
        this.id = id;
        this.dname = dname;
        this.subid = subid;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DependentModel() {
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getSubid() {
        return subid;
    }

    public void setSubid(int subid) {
        this.subid = subid;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}


