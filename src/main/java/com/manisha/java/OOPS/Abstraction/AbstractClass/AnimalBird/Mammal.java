package com.manisha.java.OOPS.Abstraction.AbstractClass.AnimalBird;
import com.manisha.java.util.Print;

public abstract class Mammal extends Animal{
    public Mammal(String type, String size, double weight) {
    super(type, size, weight);
    }
     @Override
     protected void move(String speed) {
        Print.print(getExplicitType() + " ");
        Print.print(speed.equals("slow")? "walks" : "runs");
     }
     @Override
     protected void makeNoise() {
    }
    public abstract void shedHair();
}
