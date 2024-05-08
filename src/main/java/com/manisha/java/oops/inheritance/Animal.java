package com.manisha.java.oops.inheritance;

import com.manisha.java.util.Print;

public class Animal {
    //attributes-----
    private String type;
    private String size;
    private double weight;
    //constructors----
    public Animal(){}
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    //toString-------
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
    //my methods------
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
    //----------------------------Main-------------------------->

   public static void main(String[]args){

    Animal animal = new Animal("Tiger", "Huge", 400);

    doAnimalStuff(animal,"slow");
    Print.print(animal);

    Dog dog = new Dog();
    doAnimalStuff(dog, "fast");
    Print.print(dog);
   }
}

