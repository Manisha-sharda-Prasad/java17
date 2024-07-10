package com.manisha.java.FUNDAMENTAL.Exercises.ifElse;

import com.manisha.java.util.Print;

public class Exercise12_YearsAndDaysCalc {

public static void printYearsAndDays(long minutes){
    long years=  minutes/ (365 * 24 * 60) ;
    long remainingmins = minutes % (365 * 24 * 60);
    long days = remainingmins / (24 * 60);
    Print.info(years +" y and "+ days +" d.");

    if (minutes < 0){
        Print.info("Invalid Value!!");
    }

}


public static void main(String[] args) {
  printYearsAndDays(525600);
    printYearsAndDays(1051200);
    }
}
