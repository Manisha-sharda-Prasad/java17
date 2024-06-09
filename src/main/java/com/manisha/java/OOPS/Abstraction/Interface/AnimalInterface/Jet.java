package com.manisha.java.OOPS.Abstraction.Interface.AnimalInterface;

import com.manisha.java.util.Print;

public class Jet implements FlightEnabled,Trackable{
    @Override
    public void takeOff() {
        Print.print(getClass().getSimpleName() + " is taking of");
    }
    @Override
    public void land() {
        Print.print(getClass().getSimpleName() + " is landing");
    }
    @Override
    public void fly() {
        Print.print(getClass().getSimpleName() + " is flying ");
    }
    @Override
    public void track() {
        Print.print(getClass().getSimpleName() + "'s coordinates recorded ");
    }
}
