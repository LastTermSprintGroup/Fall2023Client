package com.keyin.dto;

import java.util.List;
public class Aircraft {
// Private instance variables
// that represent the ID of an
// aircraft, the model of the aircraft,
// and the amount of passengers as capacity
    private int ID;
    private String model;
    private int capacity;
    private List<Integer> passengerIds;
    private List<Integer> airportIds;
// Basic aircraft constructor
    public Aircraft() {}
// Aircraft constructor that assigns all values
    public Aircraft(int ID, String model, int capacity) {
        this.ID = ID;
        this.model = model;
        this.capacity = capacity;
    }
// Getter for Aircrafts ID
    public int getID() {
        return ID;
    }
// Setter for the Aircrafts ID
    public void setID(int ID) {
        this.ID = ID;
    }
// Getter for the model of the Aircraft
    public String getModel() {
        return model;
    }
// Setter for the model of the Aircraft
    public void setModel(String model) {
        this.model = model;
    }
// Getter for the capacity of the Aircraft
    public int getCapacity() {
        return capacity;
    }
// Setter for the capacity of the Aircraft
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
// Getter for Passenger ids of aircraft
    public List<Integer> getPassengerIds() {
        return passengerIds;
    }
// Setter for passenger ids of aircraft
    public void setPassengerIds(List<Integer> passengerIds) {
        this.passengerIds = passengerIds;
    }
// Getter for airport ids
    public List<Integer> getAirportIds() {
        return airportIds;
    }
// Setter for airport ids
    public void setAirportIds(List<Integer> airportIds) {
        this.airportIds = airportIds;
    }
}
