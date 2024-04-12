package com.manisha.java.fundamental.exercise.forLoop;

import com.manisha.java.util.Print;

public class Exercise2_SumChallenge {
    public static void sumCountCalculate(){
        int countMatch = 0;
        int sumMatch = 0;
        for(int i = 1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0 )){
                countMatch++;
                sumMatch += i;
                Print.info(" Found a match that is divisible by 3 and 5 = " + i);
            }
            if(countMatch == 5){
                break;
            }
        }
        Print.info("Sum = " + sumMatch);
    }
    //--------------------MAIN-----------------------
    public static void main(String[]args){
        sumCountCalculate();
    }
}
