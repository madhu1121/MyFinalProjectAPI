package com.example.staysinbackend.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class State {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int stateId;

    @Column(name = "name", nullable = false, length = 100)
    private String stateName;

    @Column(name = "country_id", nullable = false, length = 3)
    private String countryId;

    public State(String stateName, String countryId) {
        this.stateName = stateName;
        this.countryId = countryId;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }
}
