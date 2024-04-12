package com.manisha.java.fundamental.exercise.whileAndDoWhile;

import com.manisha.java.util.NumberUtil;
import com.manisha.java.util.Print;

public class Exercise6_HasSharedDigit {

    public static boolean hasSharedDigit (int number1, int number2)
    {
       boolean result = false;

       boolean number1_valid = NumberUtil.IsValidateRange(10,99, number1);
       boolean number2_valid = NumberUtil.IsValidateRange(10,99, number2);

       if(number1_valid && number2_valid)
       {
           int number1_digit1 = number1/10;
           int number1_digit2 = number1%10;
           int number2_digit1 = number2/10;
           int number2_digit2 = number2%10;

           // sharing check
            if(         number1_digit1 == number2_digit1
                    ||  number1_digit1 == number2_digit2
                    ||  number1_digit2 == number2_digit1
                    ||  number1_digit2 == number2_digit2
            ){
                result = true;
            }
       }
       Print.print("hasSharedDigit : " + result, "", "");
       return result;
    }

    public static void main(String[]args){
        hasSharedDigit(12, 23);
        hasSharedDigit(9, 99);
        hasSharedDigit(15, 55);
        hasSharedDigit(99, 88);
    }
}
/*
19/10 = 1.9 = 1
19%10 = 1.9 = 9
 */

