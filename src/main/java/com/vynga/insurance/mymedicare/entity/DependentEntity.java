package com.vynga.insurance.mymedicare.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.annotation.Generated;
import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class DependentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int dip ;
    private String dname;
    private LocalDate dob;
/*
   @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "eid", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE )
    @JsonIgnore
    private SubscriberEntity subscriberEntity;
*/
    public DependentEntity() {
    }



    public int getDip() {
        return dip;
    }

    public String getDname() {
        return dname;
    }

    public LocalDate getDob() {
        return dob;
    }
/*
    public SubscriberEntity getSubscriberEntity() {
        return subscriberEntity;
    }

    public void setSubscriberEntity(SubscriberEntity subscriberEntity) {
        this.subscriberEntity = subscriberEntity;
    }
*/
    public void setDip(int dip) {
        this.dip = dip;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }




}