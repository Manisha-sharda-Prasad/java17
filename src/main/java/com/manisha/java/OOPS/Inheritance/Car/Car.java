package com.manisha.java.OOPS.Inheritance.Car;

//''getter and setter''--->(getter Retrieves/returns ; and setter does not retrieves/returns, it sets the value of a private field)
//goTo--> menu-code-generate-select-getter(),setter()--

import com.manisha.java.util.Print;
// lombok
//@Setter
//@Getter
//@ToString
public class Car {
    //============ PROPERTIES ============================
    private  String make = "Audi";
    private  String  model = "Model X";
    private  String color = "Gray";
    private int doors = 4;
    private boolean convertible = true;

    //============ METHODS ============================

    public void describeCar(){
        Print.print(doors + "-Door of " +
                color  + "  " +
                make + "  " +
                model + " " +
                (convertible ? "convertible" : " "));
    }

    // ================ end =================
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", convertible=" + convertible +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
