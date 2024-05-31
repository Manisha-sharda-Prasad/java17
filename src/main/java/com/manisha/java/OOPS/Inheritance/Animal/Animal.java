package com.manisha.java.OOPS.Inheritance.Animal;

import com.manisha.java.util.Print;

public class Animal {
    //attributes----------
    protected String type;
    private String size;
    private double weight;
    //constructors----

    //public Animal(){}
    //public Animal(String type, double weight){}
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    //toString-----------
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
    //my methods----------
    public void move(String speed){
        Print.print("moves = " + speed);
    }
    public void makeNoise(){
        Print.print(type + " make some noise");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
    }
}

