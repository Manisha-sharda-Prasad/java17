package com.manisha.java.Collection.C04_ComparatorComparable;

import com.manisha.java.util.Print;

import java.util.ArrayList;
import java.util.Collections;

public class PersonMain {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();

        person.add(new Person("Eleven", 20));
        person.add(new Person("Jim Hopper", 45));
        person.add(new Person("Bobby", 35));

        Collections.sort(person, new PersonComparator());
        Print.print("Sorting by name : " + person);

    }
}
////sorting in CUSTOM type
//Sorts--list according to natural ordering of elements
//new PersonNameComparator()-- creates an instance of PersonNameComparator c, which implements the Comparator<Person> interface.