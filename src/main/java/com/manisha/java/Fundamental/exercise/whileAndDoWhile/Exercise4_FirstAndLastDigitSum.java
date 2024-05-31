package com.manisha.java.Fundamental.exercise.whileAndDoWhile;

import com.manisha.java.util.Print;

public class Exercise4_FirstAndLastDigitSum {


    public static int sumFirstAndLastDigit (int number){
        if (number < 0)
            return -1;
        int firstDigit = 0;
        int lastDigit = 0;

        while (number > 0){
            if(lastDigit == 0){
                lastDigit = number % 10; // iteration = 1
            }
            if(number < 10){
                firstDigit = number % 10 ; // iteration = 8
            }

            Print.info( "firstDigit "+firstDigit, "lastDigit "+lastDigit );
            number = number / 10;
        }
        Print.info("SUM" ,firstDigit + lastDigit);
        return (firstDigit + lastDigit);
    }
//-----------------------------MAIN----------------------------------------//
    public static void main(String[]args){
        sumFirstAndLastDigit(12345678);
    }
}
// Run the loop for no. of digit times.
// eg : 12345 has 5 digits, so loop 5 times.
// trick ::  condition : number > 0 and last line in loop : number=number/10