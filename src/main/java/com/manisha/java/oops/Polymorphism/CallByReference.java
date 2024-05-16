package com.manisha.java.oops.Polymorphism;



public class CallByReference {

    public static void modifyReference(StringBuilder builder) {
        builder.append(" World!"); // Changes to builder inside this method affect sb
    }
    public static void main(String[] args) {
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
