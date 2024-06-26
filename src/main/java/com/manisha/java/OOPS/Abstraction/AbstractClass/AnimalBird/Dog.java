package com.manisha.java.OOPS.Abstraction.AbstractClass.AnimalBird;

import com.manisha.java.util.Print;

public class Dog extends Mammal{
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }
    @Override
    protected void move(String speed) {
        if (speed == "slow"){Print.print( getExplicitType() + " walking");}
        else {Print.print(getExplicitType() + " running");}
    }
    @Override
    protected void makeNoise() {
        if(type == "Wolf"){
            Print.print("Howling!!");
        }else{Print.print("Woof");}
    }

    @Override
    public void shedHair() {
        Print.print(getExplicitType() + " sheds in summer.");
    }
}
