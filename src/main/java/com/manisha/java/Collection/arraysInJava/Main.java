package com.manisha.java.Collection.arraysInJava;

import com.manisha.java.util.Print;

import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        int [] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        Print.print(myDoubleArray[2]);

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        Print.print("First = " + firstTen[0], firstTen[5]);

        int arrayLength = firstTen.length;
        Print.print("Length of array = " + arrayLength);
        Print.print("Last element = " + firstTen[arrayLength -1]);

        //traditional for-loop----
        int[] newArray;
        newArray = new int[]{5, 4, 3, 2, 1};
        for (int i = 0; i < newArray.length; i++){
            Print.print(newArray[i] + " ");
        }
        //assigning each element in a loop----
        int[] arr;
        arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr.length - i; //current index subtracted from length of arr.
            Print.print(arr[i] + " ");
        }
        Print.print("****************");
        //enhanced for ( declaration : collection){}---
        for (int element : arr){
            Print.print(element + " ");
        }
        Print.print("****************");

        //java.Util.Arrays-(built in functionality)----
        //Arrays.toString----(elements printed in a single string)
        Print.print(Arrays.toString(arr));

        //Assigning Array to an Object variable----
        //integer array reference to an Obj reference---
        Object objectVar = newArray;
        if (objectVar instanceof int[]){
            Print.print("ObjectVar is really an int Array");
        }
        //assign any Object Reference of any TYPE----
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = 2024;
        Print.print(objectArray);
    }
}
