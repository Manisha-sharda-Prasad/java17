package com.manisha.java.util;

public class NumberUtil {
    // Even or odd
    public static boolean isEven (int number){
        return number%2==0 ? true : false;
    }

    public static boolean isPrime (int number){
        boolean divisible = false;
        for(int i=2; i<number; i++){
            divisible = number%i==0 ? true : false;
            if (divisible) break;
        }
        return !divisible;
    }


    // ============ Validators ===========


    public static boolean IsValidateNumber (int number){
        if (number < 0) {
            Print.print("Please enter valid Number ! "+number+ " is negative !");
            return false;
        }
        else
            return true;
    }
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
