package com.example.json_views.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
public class Farmer extends User {

    @Column(name = "id_number", nullable = false)
    private String idNumber;

    @Column(name = "address", nullable = false)
    private String address;

    public Farmer() {
        super();
    }

    public Farmer(String idNumber, String address) {
        this.idNumber = idNumber;
        this.address = address;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
