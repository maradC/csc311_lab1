package org.example;

public class Vehicle {
    protected int numberOfWheels;
    protected String color;
    protected float engineSize;
    protected String fuelType;

    //default constructor
    Vehicle(){

    }
    //overloaded constructor
    Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }
    //getters and setter are below for variables
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public float getEngineSize() {
        return engineSize;
    }
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }



}
