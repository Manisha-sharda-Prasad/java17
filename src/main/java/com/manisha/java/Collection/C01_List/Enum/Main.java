package com.manisha.java.Collection.C01_List.Enum;

import com.manisha.java.util.Print;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek week = DaysOfWeek.TUES;
        Print.print(week);

        for (int i = 0; i < 10 ; i++){  // looping 10 times, each time calling getRandomDay().
            week = getRandomDay();
//            Print.print("Name is = "+week.name()+ ", Ordinal Value is = "+week.ordinal());
//
//            if(week == DaysOfWeek.MON) {
//                Print.print("Founded a Monday!!");
//            }
            switchDayOfWeek(week);
        }
    }
    public static DaysOfWeek getRandomDay(){
        int randomInt = new Random().nextInt(7);
        var allDays = DaysOfWeek.values();

        return allDays[randomInt];  // returns result of method, to var allDays.
    }

    public static void switchDayOfWeek(DaysOfWeek weekDay) {
        // + 1 (1-7) (week starts from- {0}{}..).
       int weekInteger = weekDay.ordinal() + 1;
        // (Enum type(weekDay)) using enum (type) itself in (switch expression).
       switch (weekDay){
           case WED -> Print.print("Wednesday is day : " + weekInteger);
           case THUR -> Print.print("Thursday is day : " + weekInteger);
           default -> Print.print(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase()
                   +"day is day " + weekInteger);

       }
    }
}
//weekDay is likely an instance of an enum.
//weekDay.name().charAt(0) is M.--gets first char of enum name string
//substring(1)--takes substring starting from the second char to end of string. For 'MONDAY'-- 'ONDAY'.
//toLowerCase()--converts this substring to lowercase. For 'Sunday',' onday'.
//also- if substring(3).toLowerCase()--'Mday','Tsday'
//Combining the parts:--

//weekDay.name().charAt(0) is M.
//weekDay.name().substring(1).toLowerCase() is onday.
//Concatenating these gives Monday.

// new instance of Random/(0-6)random no.
// values()-returns array of all enum constant values.