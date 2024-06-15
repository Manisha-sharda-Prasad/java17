package com.manisha.java.Collection.C04_ComparatorComparable;

import com.manisha.java.util.Print;

import java.util.ArrayList;
import java.util.Collections;

public class FamilyComparable {
    public static void main(String[] args) {
        ArrayList<Family> family = new ArrayList<>();
        family.add(new Family("Manisha", 29));
        family.add(new Family("Lekhraj", 31));
        family.add(new Family("Arush", 6));
        family.add(new Family("Tanu", 10));

        Collections.sort(family);

        Print.print(family);
    }
}
//Comparable--class that implements Comparable needs to override the compareTo method.