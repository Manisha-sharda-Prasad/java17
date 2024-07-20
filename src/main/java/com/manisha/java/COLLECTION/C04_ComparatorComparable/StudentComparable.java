package com.manisha.java.COLLECTION.C04_ComparatorComparable;

import com.manisha.java.util.Print;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
public class StudentComparable implements Comparable < StudentComparable >{
    private String name;
    private int totalScore;
    private long classLevel;
    @Override
    public int compareTo(StudentComparable s) {
        return Integer.compare(this.totalScore, s.totalScore);
    }

    public static void main(String[] args) {

        ArrayList<StudentComparable> student = new ArrayList<>();

        student.add(new StudentComparable("Alisha", 90,6));
        student.add(new StudentComparable("Ree", 49,6));

        Collections.sort(student);
        Print.print(student);
    }
}



