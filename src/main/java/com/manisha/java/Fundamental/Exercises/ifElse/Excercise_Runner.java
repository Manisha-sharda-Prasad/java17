package com.manisha.java.Fundamental.Exercises.ifElse;

import com.manisha.java.util.Print;

import static com.manisha.java.Fundamental.Exercises.ifElse.Exercise2_SpeedConverter.printConversion;
import static com.manisha.java.Fundamental.Exercises.ifElse.Exercise3_MegaBytesConverter.printMegaBytesAndKiloBytes;
import static com.manisha.java.Fundamental.Exercises.ifElse.Exercise4_wakeUp.shouldWakeUp;
import static com.manisha.java.Fundamental.Exercises.ifElse.Exercise5_leapyear.isLeapYear;
import static com.manisha.java.Fundamental.Exercises.ifElse.Exercise6_DecimalComparator.areEqualByThreeDecimalPlaces;
import static com.manisha.java.Fundamental.Exercises.ifElse.Exercise7_8_TeenAndSumChecker.hasEqualSum;
import static com.manisha.java.Fundamental.Exercises.ifElse.Exercise7_8_TeenAndSumChecker.hasTeen;

public class Excercise_Runner {

    public static void main(String[] args){
        main();
    }

    public static void main(){
        //1
        Exercise1_HighScore.checkingScores();

        //2
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(1.5);

        printConversion(100.0); // 62
        printConversion(100.4); // 62
        printConversion(15.25); // 9

        //3
        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(2122);

        //4
        shouldWakeUp(true, 5);
        shouldWakeUp(true, 9);

        shouldWakeUp(false, 5);
        shouldWakeUp(false , 9);

        shouldWakeUp(true, -1);
        shouldWakeUp(true, 26);
        //5
        isLeapYear(1800);
        isLeapYear(2024);
        isLeapYear(2400);
        //6
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        //7, 8
        hasEqualSum(1, 1, 3);
        hasEqualSum(1, 2, 3);
        hasEqualSum(1, -1,0);

        Print.info("isTeen ? ",hasTeen(9, 99 ,19));
        Print.info("isTeen ? ",hasTeen(23, 15 ,42));
        Print.info("isTeen ? ",hasTeen(22, 23 ,34));

     /*Exercise1_HighScore obj1 = new Exercise1_HighScore();
     Exercise1_HighScore obj2 = new Exercise1_HighScore();
     obj1.i1 = 10;
     obj2.i1 = 20;*/

    }


}
