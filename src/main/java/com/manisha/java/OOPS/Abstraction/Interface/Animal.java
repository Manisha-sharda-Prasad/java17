package com.manisha.java.OOPS.Abstraction.Interface;

interface FlightEnabled{
    void takeOff();
    void land();
    void fly();
}
interface Trackable{
    void track();
}

public abstract class Animal {
    public abstract void move();

}
//1.we don't have to declare interface type abstract, coz this modifier is implicitly declared for all interfaces.
//2.also we don't have to declare any method abstract.
//3."public abstract void takeOff()"--- /unnecessary to declare
//"void fly()"--- /preferred declaration.

//4.All members on interface are implicitly public
//.public modifier is indeed redundant for interface methods and fields
//.By default, all methods in an interface are public and abstract, and all fields are public, static, and final.
//.You don't need to specify these modifiers.
//method to protected on an interface is a compiler error.