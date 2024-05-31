package com.manisha.java.Fundamental.exercise.forLoop;

import com.manisha.java.util.Print;

public class Exercise3_OddOrNot {

    public static boolean isOdd(int number){
        if(number < 0)
            return false; // validation : if negative  number.
        return number%2!=0 ? true : false;
    }
    public static void sumOdd(int start, int end) {
        int sum = 0;
        for (int currentNum = start; currentNum <= end; currentNum++){
            if(isOdd(currentNum)){
                sum=sum+currentNum;
                Print.info("Found  "+currentNum+" odd", "sum :"+sum);
            }else{
                Print.info("Skipping... "+currentNum+", even");
            }

        }
        Print.info("=== Final Sum : "+sum);
    }

 //--------------------MAIN-------------------------
    public static void main(String[]args){
        sumOdd(3,10);
    }
}
