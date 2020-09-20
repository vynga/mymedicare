package com.vynga.insurance.mymedicare.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="insurances")
public class InsuranceEntity {
    @Id
    @GeneratedValue
    private int id;
    private String insuranceName;
    @Transient
    private int subid;





    @JsonIgnore
    @ManyToMany(mappedBy = "insuranceEntityHashSet")
    private Set<SubscriberEntity> subscriberEntitySet=new HashSet<>();

    public InsuranceEntity(int id, String insuranceName, Set<SubscriberEntity> subscriberEntitySet) {
        this.id = id;
        this.insuranceName = insuranceName;
        this.subscriberEntitySet = subscriberEntitySet;
    }

    public InsuranceEntity() {
    }

    public int getId() {
        return id;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public Set<SubscriberEntity> getSubscriberEntitySet() {
        return subscriberEntitySet;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public void setSubscriberEntitySet(Set<SubscriberEntity> subscriberEntitySet) {
        this.subscriberEntitySet = subscriberEntitySet;
    }

    @Override
    public String toString() {
        return "InsuranceEntity{" +
                "id=" + id +
                ", insuranceName='" + insuranceName + '\'' +
                ", subscriberEntitySet=" + subscriberEntitySet +
                '}';
    }
}
