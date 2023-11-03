package com.keyin.dto;

import java.util.ArrayList;
import java.util.List;

public class PassengerEntity {
    private int passengerID;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private int cityId;
    private List<Integer> aircraftIds; // List to store aircraft IDs
    private List<Integer> airportIds; // List to store airport IDs

    // Default constructor
    public PassengerEntity() {
        this.aircraftIds = new ArrayList<>(); // Initialize the aircraft list
        this.airportIds = new ArrayList<>(); // Initialize the airport list
    }

    // Parameterized constructor
    public PassengerEntity(int passengerID, String firstName, String lastName, int phoneNumber, int cityId) {
        this.passengerID = passengerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.cityId = cityId;
        this.aircraftIds = new ArrayList<>(); // Initialize the aircraft list
        this.airportIds = new ArrayList<>(); // Initialize the airport list
    }



    // Getters and setters
    public int getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public List<Integer> getAirportIds() {
        return airportIds;
    }

    public void setAirportIds(List<Integer> airportIds) {
        this.airportIds = airportIds;
    }

    public List<Integer> getAircraftIds() {
        return aircraftIds;
    }

    public void setAircraftIds(List<Integer> aircraftIds) {
        this.aircraftIds = aircraftIds;
    }

    // Methods to manage the list of aircraft IDs
    public void addAircraftId(int aircraftId) {
        if (!this.aircraftIds.contains(aircraftId)) {
            this.aircraftIds.add(aircraftId);
        }
    }

    public void removeAircraftId(int aircraftId) {
        this.aircraftIds.remove(Integer.valueOf(aircraftId));
    }

    public void addAirportId(int airportId) {
        if (!this.airportIds.contains(airportId)) {
            this.airportIds.add(airportId);
        }
    }

    public void removeAirportId(int airportId) {
        this.airportIds.remove(Integer.valueOf(airportId));
    }
}