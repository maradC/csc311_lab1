package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car = new Car("Honda",4,"grey",2,"regular");
        car.honk();
        System.out.println("Original Car: ");
        car.displayInfo();

        car.setBrand("Nissan");
        car.setColor("red");
        car.setEngineSize(6);
        car.setFuelType("premium");
        car.setNumberOfWheels(4);

        System.out.println();

        System.out.println("New Car:" );
        car.displayInfo();


    }
}