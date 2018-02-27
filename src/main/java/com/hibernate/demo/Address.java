package com.hibernate.demo;


import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String locality;
    private  Integer homeNo;

    public Address() {

    }
    public Address(String locality, Integer homeNo) {
        this.locality = locality;
        this.homeNo = homeNo;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Integer getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(Integer homeNo) {
        this.homeNo = homeNo;
    }
}
