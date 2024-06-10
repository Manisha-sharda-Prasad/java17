package com.manisha.java.OOPS.Abstraction.Interface.VehicleJDKnew;

public class Car implements Vehicle{
    @Override
    public void drive() {
    }
    @Override
    public void start() {
        Vehicle.super.start();
    }

    //-----------------MAIN-------------------
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.start();
        car.
    }
}
