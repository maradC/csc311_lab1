package org.example;

public class Car extends Vehicle {

    private String brand;
    //default constructor
    Car(){

    }

    //overloaded constructor
    public Car(String brand, int numberOfWheels, String color, float engineSize, String fuelType) {
            super(numberOfWheels, color, engineSize, fuelType);
            this.brand = brand;

        }

    //Honk Method
    public void honk() {
        System.out.println("Honk, honk!");

    }
    // displayInfo method
    public void displayInfo() {
        System.out.println("Num of wheels: " + numberOfWheels + "\nColor: " + color + "\nEngine size: " + engineSize + "\nFuel type: " + fuelType + "\nBrand: " + brand);
    }

    //getter for brand
    public String getBrand() {
        return brand;
    }
    //setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

}
