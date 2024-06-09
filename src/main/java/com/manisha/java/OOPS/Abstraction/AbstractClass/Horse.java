package com.manisha.java.OOPS.Abstraction.AbstractClass;

import com.manisha.java.util.Print;

public class Horse extends Mammal{
    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }
    @Override //implementing parent 'Mammal' abstract method--
    public void shedHair() {
        Print.print(getExplicitType() + " sheds in spring.");
    }

}
