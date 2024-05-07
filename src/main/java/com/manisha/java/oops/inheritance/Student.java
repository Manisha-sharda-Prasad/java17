package com.manisha.java.oops.inheritance;

import com.manisha.java.util.Print;

// INBUILT :: PARENT OF ALL
/*
    public class Object{
        String toString() {
            // return heap address
        }
    }
 */

public class Student  { // extend Object

    private String id; //id()
    private String name ;
    private String dateOfBirth;
    private String classList;
    private static int countryCode; // common copy in heap

    // ==========boiler plate code==============start

    // 1. All arg const
    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

   // 2. to string
    @Override
    public String toString() {
        // old :: from parent
        // return memory address from heap

        //new ::
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    // 3. setter and getter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
    // ==========boiler plate code==============end

    //-------------------------Main----------------------------->
    public static void main(String[]args){
        int code = Student.countryCode;

        for (int i = 1 ; i <= 5 ; i++) {
            Student student = new Student("12300" + i, getNameByIndex(i) , "" , "" );
            Print.print(student);
            Print.print(student.getName());
            Print.print(student.getId());
            Print.print("******************************************* \n");

        }
    //using StudentRecord (java-16)----(remove boiler plate code)
    StudentRecord studentRecord = new StudentRecord("12300" , "Mani" , "4/12/1995" , "Java");
        Print.print(studentRecord);
        //no-(prefix)get-....
        Print.print(studentRecord.name());
        Print.print(studentRecord.dateOfBirth());
    }
    static String  getNameByIndex(int i){
        return switch (i){
            case 1 -> "Lekhraj";
            case 2 -> "manisha";
            case 3 -> "Lekhraj3";
            case 4 -> "Lekhraj4";
            case 5 -> "Lekhraj5";
            default -> "unknown";
        };
    }
}
