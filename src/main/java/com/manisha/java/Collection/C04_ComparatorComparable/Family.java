package com.manisha.java.Collection.C04_ComparatorComparable;

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