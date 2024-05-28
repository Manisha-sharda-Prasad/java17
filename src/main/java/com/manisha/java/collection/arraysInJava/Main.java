package com.manisha.java.collection.arraysInJava;

import com.manisha.java.util.Print;

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

        int[] newArray;
        //newArray = {5,4,3,2,1};//not allowed
        newArray = new int[]{5, 4, 3, 2, 1};
        for (int i = 0; i < newArray.length; i++){
            Print.print(newArray[i] + " ");
        }

    }
}
