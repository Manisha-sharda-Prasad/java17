package com.manisha.java.fundamental.exercise.WhileandDoWhile;

import com.manisha.java.util.NumberUtil;
import com.manisha.java.util.Print;

import java.util.ArrayList;
import java.util.List;

public class Exercise8_PrintFactors {

    public static ArrayList<Integer> printFactors (int number)
    {
        ArrayList<Integer> listOfFactor = new ArrayList(); // [ ]

        Print.print( "\n\n #################### "+number);
       boolean number1_valid = number < 1 ? false : true;

       if( number1_valid ){
            int i=1;
            while ( i<=number){
               if(number % i == 0) {
                   listOfFactor.add(i); // [1,2,.....]
               }
               i++;
            }
       }
       else{
           Print.print("Invalid Value");
       }

       Print.print("List of factors", listOfFactor );
       return listOfFactor;
    }

    public static void main(String[]args){
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
}
/*
8 => loop 1 to 8
8%1 = 8,0 :)
8%2 = 4,0 :)
8%3   2,1  :(
...
...
8%8 = 1,0 :)
 */

