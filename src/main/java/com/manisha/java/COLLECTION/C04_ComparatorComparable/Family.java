package com.manisha.java.COLLECTION.C04_ComparatorComparable;

public class Family implements Comparable<Family>{
    String name;
    int age;

    public Family(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' + ", age=" + age + '}';
    }
    @Override
    public int compareTo(Family o) {
        return Integer.compare(this.age, o.age);
    }
}
//Method to override: compareTo()

//sorting in CUSTOM type

//Comparable--class that implements Comparable needs to override the compareTo method.
//It is an interfaces in Java used for sorting collections.
//creates only one  comparable
// Less flexible, suitable for a single, natural sort order.