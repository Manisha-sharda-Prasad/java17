package com.manisha.java.fundamental.exercises;

public class Exercise5_leapyear
{
    // --- start here ---
 public static boolean isLeapYear(int year) {
     boolean leapYear = false;
     //if divisible by 4, go next-- if year not divisible by 100-true, if divisible by 400-true,it's a leap year.
     if (year >= 1 && year <= 9999) {
         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
             System.out.println("It is a leap year!!!");
             leapYear = true;
         } else {
             System.out.println("It is not a leap year.");
             leapYear = false;
         }
     } else {
         System.out.println("Year is not in the valid range (1 - 9999).");
         leapYear = false;
     }
     return leapYear;
 }


//############## MAIN #############
     public static void main (String[]args){
         isLeapYear(1800);
         isLeapYear(2024);
         isLeapYear(2400);

     }
 }

