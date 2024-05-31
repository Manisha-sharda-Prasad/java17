package com.manisha.java.OOPS.Inheritance;

import com.manisha.java.util.Print;

public class Main extends Object{
    public static void main(String[]args){
        StudentsDetail mani = new StudentsDetail("Mani", 18);
        Print.print(mani);

        PrimarySchoolStudent jimin = new PrimarySchoolStudent("Jimin", 20, "Namjoon");
        Print.print(jimin);

    }
}
// can only  make one class public----
class StudentsDetail {
    private String name;
    private  int age;

    public StudentsDetail(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    @Override
//    public String toString() {
//        return super.toString();
//    }
    @Override
    public String toString() {
        return name + " is " + age ;
//                "Students{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}
class PrimarySchoolStudent extends StudentsDetail{
    private String parentName;
    PrimarySchoolStudent(String name, int age, String parentName){
        super(name,age);
        this.parentName = parentName;
    }
    @Override
    public String toString() {
        return parentName + "'s kid, "+ super.toString();
    }
}
