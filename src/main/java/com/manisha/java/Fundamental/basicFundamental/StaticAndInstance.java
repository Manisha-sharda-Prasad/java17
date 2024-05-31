package com.manisha.java.Fundamental.basicFundamental;

import com.manisha.java.util.Print;

class Student{
    // intance variable/property
    String name; //1
    int age; //2

    // static variable/property
    static String country="india"; //3
}
// [country - india]
//  memory is assocaiate with class/template

// ========================
public class StaticAndInstance {
    public static void main(String... args){
        //creating instances of Student class

        Student s1 = new Student();// [0,null]
        Print.info(s1.age, s1.name,Student.country );

        s1.age=12;
        s1.name="manisha";
        Print.info(s1.age, s1.name, Student.country );
        // [12,manisha]

        Student s2 = new Student(); // [0,null]
        Print.info(s2.age, s2.name, Student.country );

        s2.age=14;
        s2.name="lekhraj";
        Print.info(s2.age, s2.name, Student.country );
        // [14,Lekhraj]
    }
}
