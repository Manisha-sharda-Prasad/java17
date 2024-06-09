package com.manisha.java.OOPS.Abstraction.Interface.AnimalInterface;

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

//        flier.takeOff();
//        flier.fly();
//        flier.land();
//        tracked.track();

        inFlight(flier);
        inFlight(new Jet());

        //Interface var = new implemented Truck---
        Trackable truck = new Truck();
        truck.track();
    }

    public static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        flier.land();

        if (flier instanceof Trackable tracked){
            tracked.track();
        }
    }
}
//1.Animal--> Bird(extends and implements).
//Animal Interface --> FlightEnabled, Trackable.
//2.FlightEnabled,Trackable--> (implementing) Birds, Jet, Truck.
//3.Trackable--> (implementing) Truck

//4.Interfaces:
//FlightEnabled has methods takeOff, fly, and land.
//Trackable has the method track.

//5.flier.track/ track() method not in FlightEnabled.
//Checks if the flier object also implements 'Trackable' using the instanceof pattern matching.
