package com.manisha.java.Collection.arraysInJava;

import com.manisha.java.util.Print;

import java.util.Arrays;
import java.util.Random;

public class ArraySortChallenge {

    private static int[] arrangeArrays(int size){
        Random randomNo = new Random();
        int[] newIntNo = new int[size];
        for(int i = 0 ; i < size; i ++){
            newIntNo[i] = randomNo.nextInt(100);
        }
        return newIntNo;
    }

    private static int[] sortIntegers(int[] array){

        Print.print(Arrays.toString(array));
        int [] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length -1 ; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1]= temp;
                    flag = true;
                    Print.print("----->" + Arrays.toString(sortedArray));
                }
            }
            Print.print("-->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
    //---------------------------MAIN-------------------------
    public static void main(String[]args){
        int[] unsortedArray = arrangeArrays(8);
        Print.print(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(new int[] {7, 30, 35, 15});
        Print.print(Arrays.toString(sortedArray));

    }

}
