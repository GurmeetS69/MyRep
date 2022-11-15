package com.app.demo.entity;

import javax.persistence.*;

@Entity
public class person {
    @Id
    private Integer personId;
    private String personName;
    private String personCity;

    public person(Integer personId, String personName, String personCity) {

        this.personId = personId;
        this.personName = personName;
        this.personCity = personCity;
    }

    public person() {
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonCity() {
        return personCity;
    }

    public void setPersonCity(String personCity) {
        this.personCity = personCity;
    }
}
