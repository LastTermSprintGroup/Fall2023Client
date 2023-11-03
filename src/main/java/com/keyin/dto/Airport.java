package com.keyin.dto;

import java.util.List;
public class Airport {
    private int id;
    private String name;
    private String code;
    private int cityId;
    private List<Integer> aircraftIds; // List to store aircraft IDs

//Basic Airport Constructor
    public Airport() {}

// Airport Constructor
    public Airport(int id, String name, String code, int cityId, List<Integer> aircraftIds) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.cityId = cityId;
        this.aircraftIds = aircraftIds;
    }
// Getter for Airport ID
    public int getId() {
        return id;
    }
// Setter for Airport ID
    public void setId(int id) {
        this.id = id;
    }
// Getter for Airport area code
    public String getCode() {
        return code;
    }
// Setter for Airport area code
    public void setCode(String code) {
        this.code = code;
    }
// Getter for Airport name
    public String getName() {
        return name;
    }
// Setter for Airport name
    public void setName(String name) {
        this.name = name;
    }
    // Getter for City ID
    public int getCityId() {
        return cityId;
    }

    // Setter for City ID
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    // Getter for aircraft IDs
    public List<Integer> getAircraftIds() {
        return aircraftIds;
    }

    // Setter for aircraft IDs
    public void setAircraftIds(List<Integer> aircraftIds) {
        this.aircraftIds = aircraftIds;
    }

    // Add or remove aircraft IDs as needed
    public void addAircraftId(Integer aircraftId) {
        this.aircraftIds.add(aircraftId);
    }

    public void removeAircraftId(Integer aircraftId) {
        this.aircraftIds.remove(aircraftId);
    }

}