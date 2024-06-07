package com.manisha.java.OOPS.Abstraction.Interface;

public class Main {
    public static void main(String[] args) {
        //Bird, can be referred to , by these 4 different types----
        Bird bird = new Bird();
        Animal animal = bird;

        //interfaces--
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        //executing bird methods, bird is our run time object---
        animal.move();

        flier.takeOff();
        flier.fly();
        flier.land();
        tracked.track();
    }
}
