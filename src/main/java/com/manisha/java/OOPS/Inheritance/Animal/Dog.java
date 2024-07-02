package com.manisha.java.OOPS.Inheritance.Animal;

import com.manisha.java.util.Print;
import lombok.Setter;

@Setter
//public Dog(){
// super("", "", 10);
// super();
public class Dog extends Animal {
    //Implicit Constructor----(super class)
    private String tailShape;
    private String earShape;

    //super() --calling super(parent) constructor----
    public Dog() {super("Husky", "Big", 50);}

    //this() --calling this(current) constructor----
    public Dog(String type, double weight) {
        this("Pug", 70, "Perky", "Curled");
    }

    //this. --calling (current obj) --(this.properties)----
    public Dog(String type, double weight, String tailShape, String earShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.tailShape = tailShape;
        this.earShape = earShape;
    }
    //string concat(+) and super toString(+)-------
    @Override
    public String toString() {
        return "Dog{" +
                "tailShape='" + tailShape + '\'' +
                ", earShape='" + earShape + '\'' +
                "} " + super.toString();
    }
    //same method name-->will override super class(Animal)-----
    public void makeNoise(){
    }
    @Override
    public void move(String speed) {
        super.move(speed);
        //Print.print("Dogs walk, run and wag their tail");
        if(speed == "slow") {
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        Print.print();
    }
    private void bark(){
        Print.print("Woof");
    }
    private void run(){
        Print.print("Dog Running");
    }
    private void walk(){
        Print.print("Dog Walking");
    }
    private void wagTail(){
        Print.print("Dog Wagging tail");
    }

}
