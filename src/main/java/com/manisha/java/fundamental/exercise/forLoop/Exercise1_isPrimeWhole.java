package com.manisha.java.fundamental.exercise.forLoop;

import com.manisha.java.util.Print;
//prime/whole--2,3,5, 7,11,13,17,..61,67 --->divisible by 1 and itself.
//composite--4,6,8,9,12,15 ---> divisible by 1 ,itself and other number also.
public class Exercise1_isPrimeWhole {
    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber/2 ; divisor++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
    public static void isPrimeOrNot() {
        int count = 0;
        for (int i = 10; count < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                Print.info( "number " + i + " is a Prime Number!!");
                count++;
            }
        }
    }
//--------------------MAIN-------------------------
    public static void main(String[]args){

//        Print.info((isPrime(14) ? "" : "Not") + " a prime number");
//        Print.info((isPrime(15) ? "" : "Not") + " a prime number");
//        Print.info((isPrime(17) ? "" : "Not") + " a prime number");
//        Print.info((isPrime(20) ? "" : "Not") + " a prime number");
          isPrimeOrNot();


    }
}
