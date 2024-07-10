package com.manisha.java.COLLECTION.C00_Arrays;

import com.manisha.java.util.Print;

import java.util.Arrays;

public class ArrayReferences {
    public static void main(String...args){
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; //both variable referencing to same array in memory; same copy;

        anotherArray[0] = 1; //changed in both
        modifyArray(myIntArray); //passing ref type to method (as argument), third ref to same array;

        Print.print("change in myIntArray = " + Arrays.toString(myIntArray));
        Print.print("change in anotherArray = " + Arrays.toString(anotherArray));
    }
    private static void modifyArray(int[] array){
        array[1] = 2;
    }
}

//Reference Type vs. Value Types;
//reference types represents the address of the variable, rather than the data itself;
//change in one, will affect other variable also-- as pointing to same array in memory.
//passing ref type to method(as parameter)-- same address is copied as method