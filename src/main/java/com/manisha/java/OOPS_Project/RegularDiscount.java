package com.manisha.java.OOPS_Project;

public class RegularDiscount implements Discount{
    @Override
    public double apply(double amt) {
        return amt * 0.75; //25%
    }
}
