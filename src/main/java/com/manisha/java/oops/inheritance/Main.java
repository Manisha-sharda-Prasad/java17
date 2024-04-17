package com.manisha.java.oops.inheritance;
//using Car class--
//setter -

import com.manisha.java.util.Print;

public class Main {
    public static void main(String[] args){
        Car carNew = new Car();
        Print.print("make = " + carNew.getMake());
        Print.print("model = " + carNew.getModel());
        Print.print("color = " + carNew.getColor());
        carNew.describeCar();
    }
}
