package com.vynga.insurance.mymedicare.model;

import com.vynga.insurance.mymedicare.entity.SubscriberEntity;

import java.util.Set;

public class InsuranceModel {
    private  int id;
    private String insuranceName;
    private Set<SubscriberEntity> subscriberEntitySet;

    public InsuranceModel() {
    }

    public InsuranceModel(int id, String insurancename, Set<SubscriberEntity> subscriberEntitySet) {
        this.id = id;
        this.insuranceName = insurancename;
        this.subscriberEntitySet = subscriberEntitySet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Set<SubscriberEntity> getSubscriberEntitySet() {
        return subscriberEntitySet;
    }

    public void setSubscriberEntitySet(Set<SubscriberEntity> subscriberEntitySet) {
        this.subscriberEntitySet = subscriberEntitySet;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    @Override
    public String toString() {
        return "InsuranceModel{" +
                "id=" + id +
                ", insurancename='" + insuranceName + '\'' +
                ", subscriberEntitySet=" + subscriberEntitySet +
                '}';
    }
}
