package com.example.staysinbackend.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Property {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "title", nullable = false, length = 200)
    private String title;

    @Column(name = "description", nullable = false, length = 500)
    private String description;

    @Column(name = "type", nullable = false, length = 20)
    private String type;

    @Column(name = "no_of_bedrooms", nullable = false, length = 2)
    private int bedrooms;

    @Column(name = "no_of_bathrooms", nullable = false, length = 2)
    private int bathrooms;

    @Column(name = "preference", nullable = false, length = 20)
    private String preference;

    @Column(name = "place", nullable = false, length = 20)
    private String place;

    @Column(name = "areaInSqFt", nullable = false)
    private long areaInSqFt;

    @Column(name = "price", nullable = false)
    private long price;

    @Column(name = "pool", nullable = false)
    private boolean pool;

    @Column(name = "petFriendly", nullable = false)
    private boolean petFriendly;

    @Column(name = "hotTub", nullable = false)
    private boolean hotTub;

    @Column(name = "childrenPark", nullable = false)
    private boolean childrenPark;

    @Column(name = "wifi", nullable = false)
    private boolean wifi;

    @Column(name = "breakfast", nullable = false)
    private boolean breakfast;

    @Column(name = "dinner", nullable = false)
    private boolean dinner;

    @Column(name = "country", nullable = false, length = 20)
    private String country;

    @Column(name = "state", nullable = false, length = 20)
    private String state;

    @Column(name = "city", nullable = false, length = 20)
    private String city;

    @Column(name = "address", nullable = false, length = 100)
    private String address;

    @Column(name = "photoUrl", nullable = false)
    private String photoUrl;

    public Property(String title, String description, String type, int bedrooms, int bathrooms, String preference, String place, long areaInSqFt, long price, boolean pool, boolean petFriendly, boolean hotTub, boolean childrenPark, boolean wifi, boolean breakfast, boolean dinner, String country, String state, String city, String address, String photoUrl) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.preference = preference;
        this.place = place;
        this.areaInSqFt = areaInSqFt;
        this.price = price;
        this.pool = pool;
        this.petFriendly = petFriendly;
        this.hotTub = hotTub;
        this.childrenPark = childrenPark;
        this.wifi = wifi;
        this.breakfast = breakfast;
        this.dinner = dinner;
        this.country = country;
        this.state = state;
        this.city = city;
        this.address = address;
        this.photoUrl = photoUrl;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public String getPreference() {
        return preference;
    }

    public String getPlace() {
        return place;
    }

    public long getAreaInSqFt() {
        return areaInSqFt;
    }

    public long getPrice() {
        return price;
    }

    public boolean isPool() {
        return pool;
    }

    public boolean isPetFriendly() {
        return petFriendly;
    }

    public boolean isHotTub() {
        return hotTub;
    }

    public boolean isChildrenPark() {
        return childrenPark;
    }

    public boolean isWifi() {
        return wifi;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public boolean isDinner() {
        return dinner;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setAreaInSqFt(long areaInSqFt) {
        this.areaInSqFt = areaInSqFt;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public void setPetFriendly(boolean petFriendly) {
        this.petFriendly = petFriendly;
    }

    public void setHotTub(boolean hotTub) {
        this.hotTub = hotTub;
    }

    public void setChildrenPark(boolean childrenPark) {
        this.childrenPark = childrenPark;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public void setDinner(boolean dinner) {
        this.dinner = dinner;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
