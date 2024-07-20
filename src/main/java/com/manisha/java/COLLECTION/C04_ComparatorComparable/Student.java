package com.manisha.java.COLLECTION.C04_ComparatorComparable;

import com.manisha.java.util.Print;
import lombok.*;

import java.util.ArrayList;
import java.util.Collections;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Student {
    private String name;
    private int totalScore;
    private long classLevel;

    public static void main(String[] args) {
        ArrayList <Student> students = new ArrayList<>();

        students.add(new Student("Heer",98,5));
        students.add(new Student("Alana",80,5));

        Collections.sort(students,new StudentComparator());
        Print.print("Sorting by name : " + students);

        for (Student s : students) {
            Print.print(s);
        }
    }
}
