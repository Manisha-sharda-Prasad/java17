package com.manisha.java.Collection.C00_Arrays;
import com.manisha.java.util.Print;
import java.util.Arrays;
import java.util.Scanner;
public class MinElementChallenge {

    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        Print.print("Enter count: ");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for(int i = 0; i < splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }
    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int element : array) {
            if(element < min){
                min = element;
            }
        }
        return min;
    }
    //----------------------------MAIN-----------------------------------
    public static void main(String[]args){
        int[] returnedArray = readIntegers();
        Print.print(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        Print.print("min = " + returnedMin);
    }
}
//Create a Scanner [object] to read input from (System.in).
//Scanner--> prompt our user, to enter a list of int, separated by comma.
//nextLine--> reading data from console, by using nextLine method from Scanner Class.

//split-- take input and split strings by using ",".
//int[]values =new int[splits.length]-->Create new integer array to store the parsed values.

//for(int i=0; i<splits.length;i++)-->Parse each split string into an integer and store it in integer array.
//values[i] = Integer.parseInt(splits[i].trim())-->Trim any leading/trailing whitespace and parse the integer.