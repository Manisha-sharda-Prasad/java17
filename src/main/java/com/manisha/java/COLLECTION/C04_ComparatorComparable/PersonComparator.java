package com.manisha.java.COLLECTION.C04_ComparatorComparable;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }

}
//Comparator-- to sort the same list of Person objects by their name.
//It is an interfaces in Java used for sorting collections.
//can create many comparators
// flexible, suitable for multiple sort orders.

//allows sorting objects in different ways.
//class implementing Comparator needs to override the compare method.
//Method to override: compare()

