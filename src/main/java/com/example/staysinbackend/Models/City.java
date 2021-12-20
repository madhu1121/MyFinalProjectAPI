package com.example.staysinbackend.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class City {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int cityId;

    @Column(name = "name", nullable = false, length = 100)
    private String cityName;

    @Column(name = "state_id", nullable = false, length = 3)
    private String stateId;

    @Column(name = "country_id", nullable = false, length = 3)
    private String countryId;

    public City(String cityName, String stateId, String countryId) {
        this.cityName = cityName;
        this.stateId = stateId;
        this.countryId = countryId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }
}
