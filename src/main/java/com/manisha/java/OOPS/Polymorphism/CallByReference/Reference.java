package com.manisha.java.OOPS.Polymorphism.CallByReference;

public class Reference {
    int value;
    public static void modifyObject(Reference obj) {
        obj.value = 20; // Changes to 'obj' affect the original object
    }
    //-------------main-------------------
    public static void main(String[] args) {

        Reference obj = new Reference();
        obj.value = 10;

        modifyObject(obj);//(obj) passed by reference
        System.out.println("After method call: " + obj.value); // Output: 20
    }
}

//the "value" of "obj.value" is changed to '20'-- because obj is "passed by reference",
// and the reference allows the method to modify the -"original object"-.