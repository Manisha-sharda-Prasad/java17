package com.manisha.java.fundamental.exercise.WhileandDoWhile;

import com.manisha.java.util.NumberUtil;
import com.manisha.java.util.Print;

public class Exercise5_GetEvenDigitSum {

    public static int getEvenDigitSum (int number)
    {
       NumberUtil.IsValidateNumber(number);

        int sum = 0;
        while (number > 0){
            int digit = number%10;

            if(NumberUtil.isEven(digit))
                sum = sum + digit;

            number = number / 10;
        }
        Print.print("Sum " , sum);
        return sum;
    }

    public static void main(String[]args){
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }
}
