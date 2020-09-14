package com.vynga.insurance.mymedicare.model;



import com.sun.istack.Nullable;

import javax.persistence.Column;
import java.time.LocalDate;


public class SubscriberModel {

    private int id;
    private String name;
    private LocalDate dob;
    private  boolean activationStatus=true;

    private String phone ;

    public SubscriberModel() {
    }

    public SubscriberModel(int id, String name, LocalDate dob, boolean activationStatus, String phone) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.activationStatus = activationStatus;
        this.phone= phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public boolean isActivationStatus() {
        return activationStatus;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setActivationStatus(boolean activationStatus) {
        this.activationStatus = activationStatus;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "SubscriberModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", activationStatus=" + activationStatus +
                ", phone=" + phone +
                '}';
    }
}



