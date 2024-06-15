package com.manisha.java.Collection.C04_ComparatorComparable;

public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "PersonComparator{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

