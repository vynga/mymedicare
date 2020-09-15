package com.vynga.insurance.mymedicare.model;

import javax.persistence.OneToMany;
import java.time.LocalDate;

public class DependentModel {

    private  int dip ;
    private String dname;
    private LocalDate dob;
    private int eid;

    public DependentModel() {
    }

    public DependentModel(int dip, String dname, LocalDate dob, int eid) {
        this.dip = dip;
        this.dname = dname;
        this.dob = dob;
        this.eid = eid;
    }

    public int getDip() {
        return dip;
    }

    public void setDip(int dip) {
        this.dip = dip;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "DependentModel{" +
                "dip=" + dip +
                ", dname='" + dname + '\'' +
                ", dob=" + dob +
                ", eid=" + eid +
                '}';
    }
}
