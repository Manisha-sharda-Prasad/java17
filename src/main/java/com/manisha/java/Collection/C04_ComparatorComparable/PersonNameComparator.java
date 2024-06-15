package com.manisha.java.Collection.C04_ComparatorComparable;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }

}
//Comparator-- to sort the same list of Person objects by their name.
//Used to define ordering for objects.allows sorting objects in different ways.
//class implementing Comparator needs to override the compare method.
//Method to override: compare()