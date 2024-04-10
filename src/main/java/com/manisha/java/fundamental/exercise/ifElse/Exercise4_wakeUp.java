package com.manisha.java.fundamental.exercise.ifElse;

import com.manisha.java.util.Print;

public class Exercise4_wakeUp
{
    // --- start here ---
public static boolean  shouldWakeUp(boolean barking, int  hourOfDay) // 0-23
{
    boolean shouldWakeUp = false;
    // 1. out of range check for hourOfDay . eg : 45, -5
    if (hourOfDay < 0 || hourOfDay > 23) {
        Print.info("hourOfDay : incorrect value passed, must be 0-23");
        shouldWakeUp = false;
    }

    // 2. passed between 0-23
    // 2.1. 22 - 8 (sleeping)
    else if (barking  && (hourOfDay < 8 || hourOfDay > 22)  ){
        Print.info("Wake Up! Dog is Barking!!!");
        shouldWakeUp = true;
    }
    // 2.2 8- 22 ( already awake)
    else {
        shouldWakeUp = false;
        Print.info("No need to wake up");
    }

    return shouldWakeUp;
}


    //  ############## MAIN #############
    public static  void main(String[] args){
//    shouldWakeUp(true, 5);
//    shouldWakeUp(false, 23);
//    shouldWakeUp(true, 7);
//    shouldWakeUp(false,0);
        shouldWakeUp(true, 5);
        shouldWakeUp(true, 9);

        shouldWakeUp(false, 5);
        shouldWakeUp(false , 9);

        shouldWakeUp(true, -1);
        shouldWakeUp(true, 26);
    }
}


