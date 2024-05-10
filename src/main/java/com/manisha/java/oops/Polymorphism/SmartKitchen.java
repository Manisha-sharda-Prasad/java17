package com.manisha.java.oops.Polymorphism;

import com.manisha.java.util.Print;
//3 appliances(used diff class for each--not extending/making instance) of smart kitchen---
//using classes as attributes-------
public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private Dishwasher dishwasher;
    public  SmartKitchen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishwasher = new Dishwasher();
    }
    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }
    public Refrigerator getIceBox() {
        return iceBox;
    }
    public Dishwasher getDishwasher() {
        return dishwasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishFlag){

    }
}
class CoffeeMaker{
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if(hasWorkToDo){
            Print.print("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}
class Refrigerator{
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        if(hasWorkToDo){
            Print.print("Ordering food ");
            hasWorkToDo = false;
        }
    }
}
class Dishwasher{
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes(){
        if(hasWorkToDo){
            Print.print("Washing dishes ");
            hasWorkToDo = false;
        }
    }
}

//    public boolean addWater(){
//        return true;
//    }
//    public boolean pourMilk(){
//        return true;
//    }
//    public boolean loadDishwasher(){
//        return true;
//    }
//
//
//    public void doKitchenWork(){}
//
//  ;


