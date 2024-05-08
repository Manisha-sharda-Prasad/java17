package com.manisha.java.oops.Inheritance.Car;
//using Car class--
//setter -

import com.manisha.java.util.Print;
//made new ''instance'' of 'Car' class--as carNew-------
public class CarMain {
    public static void main(String[] args){
        Car carNew = new Car();
        Print.print(carNew);

        carNew.setMake("Porsche");
        carNew.setModel("Camry");
        carNew.setDoors(2);
        carNew.setConvertible(true);
        carNew.setColor("Black");

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("Red");


       /* Print.print("make = " + carNew.getMake());
        Print.print("model = " + carNew.getModel());
        Print.print("color = " + carNew.getColor());
        Print.print("Doors = " + carNew.getDoors());
        Print.print("Convertible = " + carNew.isConvertible());*/
        carNew.describeCar();
        targa.describeCar();

    }
}
