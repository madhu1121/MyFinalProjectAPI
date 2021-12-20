package com.example.staysinbackend.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Country {

//    @TableGenerator(name = "id_generator", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_value",
//            pkColumnValue="task_gen", initialValue=10000, allocationSize=10)
    @Column(name = "id", nullable = false, length = 3)
    @Id
    private String countryId;

    @Column(name = "name", nullable = false, length = 100)
    private String countryName;

    public Country() {

    }

    public Country(String countryId, String countryName) {
        this.countryId = countryId;
        this.countryName = countryName;
    }

    public String getCountryId() {
        return countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
