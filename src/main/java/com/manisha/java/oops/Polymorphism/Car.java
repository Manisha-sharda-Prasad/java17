package com.manisha.java.oops.Polymorphism;

public class Car {
    private String description;
    private void startEngine(){};
    private void drive(){};
    protected void runEngine(){};

    public Car(String description) {
        this.description = description;
    }
}

class GasPoweredCar extends Car{
    double avgKmPerHour;
    int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }
}
class ElectricCar extends Car{
    double avgKmPerCharge;
    int batterySize;

    public ElectricCar(String description) {
        super(description);
    }
}
class HybridCar extends Car{
    double avgKmPerLitre;
    int batterySize;
    int cylinders;

    public HybridCar(String description) {
        super(description);
    }
}