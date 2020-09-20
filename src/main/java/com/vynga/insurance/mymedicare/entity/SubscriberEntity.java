package com.vynga.insurance.mymedicare.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.Nullable;
import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.persistence.*;
import javax.swing.text.html.HTML;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity()
@Table(name = "subscriber")

public class SubscriberEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscriber_id")
    private int id;
    private String name;
    private LocalDate dob;
    private  boolean activationStatus=true;
    private String phone;

    @JsonManagedReference
    @OneToMany(mappedBy = "subscriber")
    List<DependentEntity> dependentEntityList;




    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "subscriber_insurance",
            joinColumns = @JoinColumn(name = "subscriber_id", referencedColumnName = "subscriber_id"),
            inverseJoinColumns = @JoinColumn(name = "insurance_id", referencedColumnName = "id"))
    private Set<InsuranceEntity> insuranceEntityHashSet;


    public Set<InsuranceEntity> getInsuranceEntityHashSet() {
        return insuranceEntityHashSet;
    }

    public void setInsuranceEntityHashSet(Set<InsuranceEntity> insuranceEntityHashSet) {
        this.insuranceEntityHashSet = insuranceEntityHashSet;
    }

    public List<DependentEntity> getDependentEntityList() {
        return dependentEntityList;
    }

    public void setDependentEntityList(List<DependentEntity> dependentEntityList) {
        this.dependentEntityList = dependentEntityList;
    }

    public SubscriberEntity() {
    }



    public SubscriberEntity(int id, String name, LocalDate dob, boolean activationStatus, String phone ) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.activationStatus = activationStatus;
        this.phone = phone;
        //this.insuranceEntityHashSet = insuranceEntities;//Stream.of(insuranceEntities).collect(Collectors.toSet());
       // this.insuranceEntityHashSet.forEach(x -> x.getSubscriberEntitySet().add(this));
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
