package com.vynga.insurance.mymedicare.entity;

import com.sun.istack.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity()
@Table(name = "Subscriber")

public class SubscriberEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private LocalDate dob;
    private  boolean activationStatus=true;
    private String phone;

    public SubscriberEntity() {
    }



    public SubscriberEntity(int id, String name, LocalDate dob, boolean activationStatus, String phone) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.activationStatus = activationStatus;

        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "SubscriberEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", activationStatus=" + activationStatus +
                ", phone=" + phone +
                '}';
    }
}
