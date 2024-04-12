package com.manisha.java.util;

import lombok.extern.slf4j.Slf4j;


public class NumberUtil
{
    //is Even or odd----------------------
    public static boolean isEven (int number){
        return number%2==0 ? true : false;
    }
    //isPrime------------------------------
    public static boolean isPrime (int number){
        boolean divisible = false;
        for(int i=2; i <= number-1; i++){
            divisible = number%i==0 ? true : false;
            if (divisible) break;
        }
        return !divisible;
    }


    // ============== Validators ==============

    //invalid whole Number------------------
    public static boolean IsValidWholeNumber(int number){
        if (number < 0) {
            Print.print("Please enter valid whole Number ! "+number+ " is negative !");
            return false;
        }
        else
            return true;
    }
    //Validate Range-------------------------
    public static boolean IsValidateRange (int start, int end, int yourNumber){
        if (yourNumber <= end && yourNumber >= start) {
            return true;
        }
        else{
            Print.print("Invalid ! Please enter Number in range of "+start+ " - "+ end);
            return false;
        }
    }

}
