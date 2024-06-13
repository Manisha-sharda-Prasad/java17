package com.manisha.java.OOPSProject;

public class RegularDiscount implements Discount{
    @Override
    public double apply(double amt) {
        return amt * 0.75; //25%
    }
}
