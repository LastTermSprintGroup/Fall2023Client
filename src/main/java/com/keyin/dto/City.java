package com.keyin.dto;

public class City {
// Private instance variables that represent
// the cities id number,
// name of the city,
// what state it is in,
// and the population of said city
    private int id;
    private String name;
    private String state;
    private int population;
// Constructor for a city object
    public City() {
    }
// Getter for the cities ID number
    public int getId() {
        return id;
    }
// Getter for the cities population count
    public int getPopulation() {
        return population;
    }
// Getter for the cities name
    public String getName() {
        return name;
    }
// Getter for the state the city is in
    public String getState() {
        return state;
    }
// Setter for the cities ID number
    public void setId(int id) {
        this.id = id;
    }
// Setter for the cities name
    public void setName(String name) {
        this.name = name;
    }
// Setter for the cities state
    public void setState(String state) {
        this.state = state;
    }
// Setter for the cities population
    public void setPopulation(int population) {
        this.population = population;
    }


}
