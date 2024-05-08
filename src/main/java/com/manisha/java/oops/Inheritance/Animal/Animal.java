package com.manisha.java.oops.Inheritance.Animal;

import com.manisha.java.util.Print;

public class Animal {
    //attributes----------
    protected String type;
    private String size;
    private double weight;
    //constructors----
    public Animal(String type, double weight){}
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
    //----------------------------Main-------------------------->
    public static void main(String[]args){

    Animal animal = new Animal("Tiger", "Huge", 400);
    doAnimalStuff(animal,"slow");
    Print.print(animal);
    Print.print("********");

    // Dog 'new' instances---->

    Dog husky = new Dog(); //no parameter() of Dog Class
    doAnimalStuff(husky, "fast");
    Print.print(husky);
    Print.print("********");

    Dog pug = new Dog("Pug", 40);//(2 parameter) of Dog Class
    doAnimalStuff(pug, "slow");
    Print.print(pug);
    Print.print("********");

    Dog retriever = new Dog("Labrador Retriever", 80, "Swimmer", "Floppy");
    doAnimalStuff(retriever, "slow");
    Print.print(retriever);
    Print.print("********");

    Dog yorkie = new Dog("Yorkie", 15, "Straight", "Curled");
    doAnimalStuff(yorkie, "fast");
    Print.print(yorkie);
    Print.print("********");
   }
}

