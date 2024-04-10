package com.manisha.java.fundamental.exercise.switchCase;

import com.manisha.java.util.Print;

public class Exercise2_IsLeapYear {

    static boolean isLeapYear(int year)
    {
        boolean isLeapYearflag = false;

        // in range
        if(year > 0 && year < 10000){
             isLeapYearflag = switch (year){
                default -> ((year%4==0 && year%100!=0) || year%400==0 ) ? true : false;
            };
        }

        Print.info(year +" , isLeapYear : " + isLeapYearflag);
        return isLeapYearflag;
    }
    static int getDaysInMonth(int month, int year){
        int noOfDay = -1;
        // out of range
        if( month < 1 || month > 12 || year < 1 || year > 9999){
            noOfDay = -1;
        }
        else{
             noOfDay = switch (month){
                case 1,3,5,7,10,12 -> 31;
                case 4,6,9,11 -> 30;
                case 2 -> isLeapYear(year) ? 29 : 28; // feb
                default -> -1;
            };
        }
        Print.info(year+" "+month +" ,noOfDay : " + noOfDay);
        return noOfDay;
    }

    //==================Main==========================
     public static void main(String[]args){
         isLeapYear(-1600);
         isLeapYear(1600);
         isLeapYear(2017);
         isLeapYear(2000);

         getDaysInMonth(1, -2020);
         getDaysInMonth(1, 2020);
         getDaysInMonth(2, 2020);
         getDaysInMonth(2, 2018);
         getDaysInMonth(-1, 2020);


     }
}


