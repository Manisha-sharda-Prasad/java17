package com.manisha.java.COLLECTION.C03_HashSet;

import com.manisha.java.util.Print;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Milk");
        set.add("Banana");
        set.add("Orange");
        set.add("Bread");
        set.add("Banana"); //will not add duplicate.

        Print.print(set.size());
        Print.print(set.isEmpty());
        set.remove("Bread");

        Print.print(set);

        if (set.contains("Milk")) {
            Print.print("Set contains Milk");
        }
        // Iterating over the set--
        for(String grocery : set){
            Print.print(grocery);
        }
    }
}
/*
HashSet--
- collection implements Set interface,
- does not allow duplicate elements and,
- maintaining any order of it.
*/
