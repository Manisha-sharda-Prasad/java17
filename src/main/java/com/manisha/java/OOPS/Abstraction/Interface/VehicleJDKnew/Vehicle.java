package com.manisha.java.OOPS.Abstraction.Interface.VehicleJDKnew;

import com.manisha.java.util.Print;

public interface Vehicle {

    //empty body void method----
    void drive();

    //default method (Introduced in JDK 8)----
    //calling Private & Static method in default method of same interface--
    default void start(){
        Print.print("Start driving car!!");
        checkFuel();
        stop();
    }
    //calling private method in static method----
    static void stop(){
        Print.print("Stop driving the car!!");
        changeBattery();
    }

    //static method (Introduced in JDK 8)----
    static void service(){
        Print.print("Car service is due !!");

    }

    //private method (Introduced in JDK 9)----
    private void checkFuel(){
        Print.print("Checking fuel in car!!");
    }

    //private Static method----
    private static void changeBattery(){
        Print.print("Changing battery of the car!!");
    }
}
//Default method--- allow interfaces to evolve without breaking existing implementations.
//Static  method---belong to the "interface itself" rather than any instance of the class that implements the interface.
//Private methods---"not accessible outside" the interface, used to share code between "Default and Static method".