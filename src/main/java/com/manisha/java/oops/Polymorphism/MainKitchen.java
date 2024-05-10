package com.manisha.java.oops.Polymorphism;

public class MainKitchen {
    public static void main(String[]args){
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.getDishwasher().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getBrewMaster().setHasWorkToDo(true);

        kitchen.getDishwasher().doDishes();
        kitchen.getIceBox().orderFood();
        kitchen.getBrewMaster().brewCoffee();

    }
}
