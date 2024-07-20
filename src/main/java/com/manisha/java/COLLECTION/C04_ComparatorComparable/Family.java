package com.manisha.java.COLLECTION.C04_ComparatorComparable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Family implements Comparable<Family>{
    String name;
    int age;

    @Override
    public int compareTo(Family o) {
        return Integer.compare(this.age, o.age);
    }
}
//Method to override: compareTo()
//Comparable--class that implements Comparable needs to override the compareTo method.

//It is an interfaces in Java used for sorting collections.
//creates only one , comparable
// Less flexible, suitable for a single, natural sort order.