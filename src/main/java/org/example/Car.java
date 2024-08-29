package org.example;

public class Car extends Vehicle {
    private String brand;


    public Car(String brand, int numberOfWheels, String color, float engineSize, String fuelType) {

            super(numberOfWheels, color, engineSize, fuelType);
            this.brand = brand;

        }


    public void honk() {
        System.out.println("Honk, honk!");

    }

    public void displayInfo() {
        System.out.println("Num of wheels: " + numberOfWheels + "\nColor: " + color + "\nEngine size: " + engineSize + "\nFuel type: " + fuelType + "\nBrand: " + brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
