package com.manisha.java.oops.inheritance;

import com.manisha.java.util.Print;
//getter and setter---
//menu-code-generate-select-getter--
public class Car {
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    private  String make = "Audi";
    private  String  model = "Model X";
    private  String color = "Gray";
    private int doors = 4;
    private boolean convertible = true;

    public void describeCar(){
        Print.print(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "convertible" : " "));
    }

}
