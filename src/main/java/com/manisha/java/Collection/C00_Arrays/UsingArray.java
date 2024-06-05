package com.manisha.java.Collection.C00_Arrays;

import com.manisha.java.util.Print;
import java.util.Arrays;
import java.util.Random;
public class UsingArray {
    private static int[] getRandomArray(int len){

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0 ; i < len ; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
    //---------------------------MAIN-------------------------
    public static void main(String[]args){
        int[] firstArray = getRandomArray(10);
        Print.print(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        Print.print(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        Print.print(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        Print.print(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        Print.print(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        Print.print(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        Print.print(Arrays.toString(thirdArray));
        Print.print(Arrays.toString(fourthArray));

        int[] smallArray = Arrays.copyOf(thirdArray, 5);
        Print.print(Arrays.toString(smallArray));

        int[] largeArray = Arrays.copyOf(thirdArray, 15);
        Print.print(Arrays.toString(largeArray));

        String[] sArray = {"Able", "Jane", "Mark", "Tom", "David"};
        Arrays.sort(sArray);
        Print.print(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray,"Tom") >= 0){
            Print.print("Found Tom in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        if (Arrays.equals(s1,s2)){
            Print.print("Arrays are equal");
        }else{
            Print.print("Arrays are not equal");
        }

    }
}
//"Random"--> class in java.util.library.'.
//Random is static class...making instance named 'random'.
//random.nextInt
//setting new array & size, same as the method's argument.
//return random int value till 100("exclusive upper bound") - max int value).

//util methods-->Arrays.sort(ascending order), Arrays.fill(0,0) , Arrays.copyOf().
//For "Primitives" the 'Values' get copied, For "Objects" the object 'Reference' gets copied.
//[Copy], [partial Copy], [copy with Additional elements]

//using Intervals--Arrays.binarySearch(Splits into two), works with Arrays.sort().
//"Searching Sequentially/linear search"--Stopping through each element ,split smaller sections

//Arrays.equals(takes 2 array for comparison ).//returns t/f