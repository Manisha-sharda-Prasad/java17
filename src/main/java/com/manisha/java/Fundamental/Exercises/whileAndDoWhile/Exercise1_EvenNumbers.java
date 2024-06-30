package com.manisha.java.Fundamental.Exercises.whileAndDoWhile;

import com.manisha.java.util.Print;

public class Exercise1_EvenNumbers {
    public static boolean isEvenNumber(int number){
        return ( number % 2 == 0) ? true : false;

    }

//-----------------------MAIN-------------------------------------
    public static void main(String[]args){

            int startnum = 4;
            int finishnum = 20;
            int evenCount = 0;
            int oddCount = 0;
            while( startnum <= finishnum){
                startnum++;
                if(!isEvenNumber(startnum)){
                    oddCount++;
                    continue;
                }
                Print.info("Even number ", startnum);
                evenCount++;
                if (evenCount >= 5){
                    break;
                }
            }
            Print.info("Total odd numbers found = ", oddCount );
            Print.info("Total even numbers found = ", evenCount );
    }
}
