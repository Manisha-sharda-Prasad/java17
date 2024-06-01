package com.manisha.java.Collection.arraysInJava;

import com.manisha.java.util.Print;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[]args){
        //two-dimensional array------
        int [][] array = new int [4][4];
        Print.print(Arrays.toString(array));
        Print.print("array length = " + array.length);

        for(int[] outer : array){
           Print.print(Arrays.toString(outer));
        }
       for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                array[row] [col] = (row * 10) + (col + 1); //Simple initialization with product of indices
          }
       }
        Print.print(Arrays.deepToString(array));
    }


}
//apps. that require grid-like structure,such as spreadsheets,game boards,any app. that involves rows & cols of data.
//1.Declare a 2D array with 4 rows and 4 columns. also--
//int[][] matrix = {
//        {1, 2, 3, 4},
//        {5, 6, 7, 8},
//        {9, 10, 11, 12}
//        {6, 10, 75, 38}
//};

//2.nested for loop -Initialize the 2D array with values
//3. Print the 2D array

//also use method --> Arrays.deepToString();