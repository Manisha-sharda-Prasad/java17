package com.manisha.java.OOPS.Polymorphism.CallByReference;
public class CallByReference {

    public static void modifyReference(StringBuilder builder) {
        builder.append(" World!"); // Changes to builder inside this method affect sb

    }
    //-------------Main----------------------
    public static void main(String[] args) {
        //1st e.g--
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Before: " + sb);
        modifyReference(sb);
        System.out.println("After: " + sb);

    }
}
/*
[]
StringBuilder sb
StringBuilder builder
*/
