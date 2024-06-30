package com.manisha.java.Fundamental.Exercises.switchCase;

import com.manisha.java.util.Print;

public class Exercise1_NumberInWord {
    static void printNumberInWord(int number){
        String printWord = switch (number){
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> {
                String invalid = "Invalid value";
                yield invalid;
            }

        };
        Print.info( number + " in word is " + printWord);

    }
//==================Main==========================
    public static void main(String[]args){
        printNumberInWord(1);
        printNumberInWord(10);
        Exercise2_IsLeapYear.isLeapYear(123);
    }
}


