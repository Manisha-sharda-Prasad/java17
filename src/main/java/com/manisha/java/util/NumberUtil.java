package com.manisha.java.util;

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
    //parsing int and try & catch--------------------------------
    public static boolean IsValidWholeNumber(String number){
        try {
            int inputNum = Integer.parseInt(number);
            System.out.println(number+" can be parse into integer. ");
            return IsValidWholeNumber(inputNum);
        }catch (NumberFormatException badUserData) {
            System.out.println(number+" can NOT be parse into integer. ");
            return false;
        }
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
