package com.manisha.java.OOPS.Abstraction.Interface.VehicleJDKnew;

import com.manisha.java.util.Print;

public interface Vehicle {

    void drive();

    //default method (Introduced in JDK 8)----
    default void start(){
        Print.print("Start driving car!!");
    }

    //static method (Introduced in JDK 8)----
    static void service(){
        Print.print("Start a car service!!");
    }

    //private method (Introduced in JDK 9)----
    private void checkFuel(){
        Print.print("checking fuel in car!!");
    }
}
//Default method--- allow interfaces to evolve without breaking existing implementations.
//Static  method---belong to the interface itself rather than any instance of the class that implements the interface
//Private methods---not accessible outside the interface, used to share code between default method.