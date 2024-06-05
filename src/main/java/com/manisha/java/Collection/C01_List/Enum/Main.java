package com.manisha.java.Collection.C01_List.Enum;

import com.manisha.java.util.Print;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek week = DaysOfWeek.TUE;
        Print.print(week);

        for (int i = 0; i < 10 ; i++){  // looping 10 times, each time calling getRandomDay().
            week = getRandomDay();
            Print.print("Name is = "+week.name()+ ", Ordinal Value is = "+week.ordinal());

            if(week == DaysOfWeek.MON) {
                Print.print("Founded a Monday!!");
            }
        }
    }
    public static DaysOfWeek getRandomDay(){
        int randomInt = new Random().nextInt(7);  // new instance of Random/(0-6)random no.
        var allDays = DaysOfWeek.values(); // values()-returns array of all enum constant values.

        return allDays[randomInt];  // returns result of method, to var allDays.
    }
}
