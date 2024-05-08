package com.manisha.java.oops.inheritance;

import com.manisha.java.util.Print;

//public Dog(){
// super("", "", 10);
// super();
public class Dog extends Animal {
    //Implicit Constructor----(super class)
    private String tailShape;
    private String earShape;

    public Dog() {
        super("Husky", "Big", 50);
    }

    public Dog(String type, double weight) {
        this("Pug", 70, "Perky", "Curled");
    }

    public Dog(String type, double weight, String tailShape, String earShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.tailShape = tailShape;
        this.earShape = earShape;
    }
    //same method name-->will override super class(Animal)---
    public void makeNoise(){}

    //better- won't override---(both works with same method name--super, subclass )
    @Override
    public void move(String speed) {
        super.move(speed);
        Print.print("Dogs walk, run and wag their tail");
    }
    //string concat(+) and super toString(+)-------
    @Override
    public String toString() {
        return "Dog{" +
                "tailShape='" + tailShape + '\'' +
                ", earShape='" + earShape + '\'' +
                "} " + super.toString();
    }

}
