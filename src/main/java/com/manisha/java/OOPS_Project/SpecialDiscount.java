package com.manisha.java.OOPS_Project;

public class SpecialDiscount implements Discount{
    @Override
    public double apply(double amt) {
        return amt * 0.50;
    }
}
