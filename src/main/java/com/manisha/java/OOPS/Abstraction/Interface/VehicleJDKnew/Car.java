package com.manisha.java.OOPS.Abstraction.Interface.VehicleJDKnew;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving the car...");
    }
    @Override
    public void start() {
        Vehicle.super.start();
    }


    //-----------------MAIN-------------------
    public static void main(String[] args) {
        Car car = new Car();
        car.drive(); // overridden method
        car.start(); // default method
        Vehicle.service(); //static method, accessing with Interface.

    }
}
//can not call Parent Static method in any class that implements interface---
//     static void stop(){
//        Vehicle.super.stop();
//    }