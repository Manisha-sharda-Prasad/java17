package com.manisha.java.OOPS.Inheritance.Exercise;

import com.manisha.java.util.Print;

public class Exercise2_Person {
    private String firstName;
    private String lastName;
    private int age;

    //Getter-Setter---------------------->

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        Print.print("Age = " + age );
        this.age = age;
    }
    //other methods------------------------>
    public boolean isTeen() {
        if ((age > 12) && (age < 20)) {
            Print.print("Is a teen! ");
            return true;
        }
        else{
           Print.print("Not a teen! ");
            return false;
        }
    }
     public String getFullName(){
         Print.print("Full name = " + (firstName+ lastName));
         return (firstName + lastName);
     }
     //---------------------------Main-------------------------------
     public static void main(String[]args){
        Exercise2_Person person = new Exercise2_Person();
        person.setFirstName("Manisha");
        person.setLastName(" Prasad");
        person.setAge(15);

       boolean isTeen = person.isTeen();
        String fullName = person.getFullName();
     }
}