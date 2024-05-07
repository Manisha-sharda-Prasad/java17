package com.manisha.java.oops.inheritance;

public record StudentRecord(String id, String name, String dateOfBirth, String classList) {
    //using StudentRecord (java-16)----(removes boiler plate code)
    // all (args) constructor
    //no-(prefix)get-....
    //no-setter
    //immutable  --> final prop
}
