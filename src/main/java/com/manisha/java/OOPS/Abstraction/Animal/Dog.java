package com.manisha.java.OOPS.Abstraction.Animal;

import com.manisha.java.util.Print;

public class Dog extends Animal{
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }
    @Override
    protected void move(String speed) {
        if (speed == "slow"){Print.print( type + " walking");}
        else {Print.print(type + " running");}
    }
    @Override
    protected void makeNoise() {
        if(type == "Wolf"){
            Print.print("Howling!!");
        }else{Print.print("Woof");}
    }
}
