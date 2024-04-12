package com.manisha.java.fundamental.exercise.WhileandDoWhile;

import com.manisha.java.util.Print;

import java.util.Arrays;
import java.util.Collections;

public class Exercise3_PalindromeNumber {


    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;

        while (original != 0) {
            reverse = (reverse * 10) + original % 10;
            original = original / 10;
            Print.info("number: "+number , "reverse: "+reverse, "original: "+original);
        }

        // print result
        if (reverse == number){
            Print.info(number+ " number is a palindrome!!!");
        }else {
            Print.info(number+" number is not a palindrome.");
        }
        // return result
        return reverse == number;

    }

 /*   public static boolean isPalindrome2(int number)
    {
        String numberAsString = String.valueOf(number);
        char[] charArray = numberAsString.toCharArray();
        Collections.reverse(Arrays.asList(charArray));
    }*/
            public static void main (String[]args){
            isPalindrome(1221);
            isPalindrome(707);
    }

}
/*
( 0 * 10 ) + 1 =   00 +   1 = 1
1 * 10 + 2 =   10 +   2 = 12
12 * 10 + 2 =  120+   2 = 122
122 * 10 + 1 = 1220 + 1 = 1221
 */