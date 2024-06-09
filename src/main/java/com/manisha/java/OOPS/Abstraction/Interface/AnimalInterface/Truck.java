package com.manisha.java.OOPS.Abstraction.Interface.AnimalInterface;

import com.manisha.java.util.Print;

public class Truck implements Trackable{
    @Override
    public void track() {
        Print.print(getClass().getSimpleName() + " 's coordinates recorded ");
    }
}
