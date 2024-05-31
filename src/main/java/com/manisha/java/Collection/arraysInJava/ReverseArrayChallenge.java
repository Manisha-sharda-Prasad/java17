package com.manisha.java.Collection.arraysInJava;

import com.manisha.java.util.Print;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallenge {
    private static int [] readInteger(){
        Scanner scan = new Scanner(System.in);

        Print.print("Enter integers using comma : ");
        String input = scan.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for(int i = 0; i < splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }
    private static int[] reverseCopy(int[] array){
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length -1;

        for (int el : array){
            reversedArray[maxIndex--] = el;
        }
        return reversedArray;
    }
    //--------------------------MAIN-----------------------------
    public static void main(String[]args){
        int[] returnArray = readInteger();
        Print.print(Arrays.toString(returnArray));

        int[] reverseCopy = reverseCopy(returnArray);
        Print.print("After reverse : " + Arrays.toString(returnArray));
        Print.print("Reverse copy : " + Arrays.toString(reverseCopy));

    }
}
//swap array elements--
//1. reverseCopy-- takes array as arg,
//2. reversedArray='new'-- creates a new array, which has same length as the one the that's passed to this method.
//3. maxIndex-- local var, position of a last element to start with.
//4. for-- loops through element using enhanced loop.
//5. populates the reversedArray, setting last element in new array, to first elem passes to this method,
//6.  and using post decrement(--) operator. decrement of maxIndex after.
//

//when index i is 0, we're swapping 1st element, array position 0 with element at position 4.
//with array position 4, 4 minus i, which is position 3