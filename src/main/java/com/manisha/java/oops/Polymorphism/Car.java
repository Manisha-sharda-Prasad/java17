package com.manisha.java.oops.Polymorphism;

import com.manisha.java.util.Print;

public class Car {
    String description;
    public Car( ){}
    public Car(String description) {
        // bts  :: String description = desc;
        this.description = description;
    }
    public void startEngine(){
        Print.print("Car -> startEngine ");
    };
    protected void runEngine(){
        Print.print("Car -> runEngine ");
    };
    public void drive(){
        Print.print("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    };
}
class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders ;

    public GasPoweredCar(String description) {
        super(description);
    }
    public GasPoweredCar(String description, int a) {
        super(description);
    }
    public GasPoweredCar(String desc, double avgKmPerLitre, int cylinders) {
        // super();
        // bts :: String desc = new String("2022 Blue Ferrari 296 GTS");

        // Notes - this, super + this(...), super(...)
        // super(desc); // calls parent class constructor with matching signature.
        this(desc); // calls another constructor in same class with matching signature
        this.avgKmPerLitre = avgKmPerLitre; // this.<member of current class>
        this.cylinders = cylinders;
        super.description = desc; // super.<non-private member of Parent class>
    }
    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }
    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average : %.2f %n", avgKmPerLitre);
    }
}
class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }
    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n ", batterySize);
    }
    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.printf("BEV -> usage under the average: %.2f %n ", avgKmPerCharge);
    }
}
class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }
    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", batterySize);
    }
    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLitre);
    }
}