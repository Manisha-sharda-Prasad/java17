package com.manisha.java.COLLECTION.C04_ComparatorComparable;

import com.manisha.java.util.Print;
import lombok.*;

import java.util.ArrayList;
import java.util.Collections;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {
    String name;
    int age;
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();

        person.add(new Person("Eleven", 20));
        person.add(new Person("Jim Hopper", 45));
        person.add(new Person("Bobby", 35));

        Collections.sort(person, new PersonComparator());
        Print.print("Sorting by name : " + person);
    }
}
//new PersonNameComparator()-- creates an instance of PersonNameComparator c,
// which implements the Comparator<Person> interface.