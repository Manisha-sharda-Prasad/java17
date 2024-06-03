package com.manisha.java.Collection.Arrays;

import com.manisha.java.util.Print;

import java.util.Scanner;

public class MinimumElChallenge {
    private static int readInteger(){
        Scanner scan = new Scanner(System.in);

        Print.print("Enter count : ");
        int count = scan.nextInt();
        return count;
    }
    private static int[] readElements(int count){
        Scanner scan = new Scanner(System.in);

        int[] array = new int[count];
        for (int i = 0 ; i < array.length; i++) {
        Print.print("Enter a number as per count : ");
        int number = scan.nextInt();
        array[i] = number;
        }
        return array;
    }
    private static int findMin(int[] array){
        int cmv = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i ++){
            if(array[i] < cmv){
                cmv = array[i];
            }
        }
        return cmv;
    }
    public static void main(String[]args){
        //Call readInteger to get the number of elements to read--
        int count = readInteger();

        //Call readElements with the count to get the array of elements--
        int[] elements = readElements(count);

        //Call findMin with the array to find the minimum value--
        int minValue = findMin(elements);

        //Displaying minimum value--
        System.out.println("The minimum value from the numbers you entered is : " + minValue);
    }
}
// Create a Scanner object to read input from System.in
// int count = scanner.nextInt()-->