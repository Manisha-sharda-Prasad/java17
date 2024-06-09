package com.manisha.java.OOPS.Abstraction.AbstractClass;

import com.manisha.java.util.Print;

public class Fish extends Animal{
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }
    @Override
    protected void move(String speed) {
        if (speed == "slow"){Print.print( getExplicitType() + " lazily swimming");}
        else {Print.print(getExplicitType() + " darting frantically");}
    }
    @Override
    protected void makeNoise() {
        if(type == "Goldfish"){
            Print.print("swish!!");
        }else{Print.print("splash");}
    }
}
