package com.vynga.insurance.mymedicare.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="dependents")
public class DependentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id ;
    private String dname;
    @Transient
    private int subid;
    private LocalDate dob;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public SubscriberEntity getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(SubscriberEntity subscriber) {
        this.subscriber = subscriber;
    }


 @JsonBackReference
 @ManyToOne(fetch = FetchType.LAZY, optional = false)
 @JoinColumn(name = "subscriber_id")
    private SubscriberEntity subscriber;
    public DependentEntity() {
    }










}