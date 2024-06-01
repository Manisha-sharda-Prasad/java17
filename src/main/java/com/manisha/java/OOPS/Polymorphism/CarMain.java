package com.manisha.java.OOPS.Polymorphism;

import org.springframework.web.bind.annotation.GetMapping;

public class CarMain {

    //static Block
    //static {
       // System.out.println("Car main :: Static block");
        // can use only static member
    //}
    public static void main(String[]args){
        //parent new instance---
        Car car = new Car("2021 Black BMW 200 GTS");
        runRace(car);
        //subClassClass new instance---
        Car ferrari = new GasPoweredCar(new String("2022 Blue Ferrari 296 GTS"), 15.4,6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2023 Red Tesla Model 3", 568,75);
        runRace(tesla);

        Car audi = new HybridCar("2024 Grey Audi Model 11", 16, 8,7);
        runRace(audi);
    }
    //passing class Car as parameter type----
    @GetMapping
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
