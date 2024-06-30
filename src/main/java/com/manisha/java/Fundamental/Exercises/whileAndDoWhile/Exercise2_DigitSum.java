package com.manisha.java.Fundamental.Exercises.whileAndDoWhile;

import com.manisha.java.util.Print;

public class Exercise2_DigitSum {
//1.)------------------------------------------
    public static int sumDigits(int number){
      if ( number < 0){
          return -1;
      }
      int sum = 0;
      while (number > 9){
         int digit = number % 10;
         sum = sum + digit;
         number = number/10; // cast to int.  4863.4 ---> 4863
         Print.info("number : "+number, "last Digit : "+digit, "sum : "+sum);
      }
      return sum;
    }
//2.)also--------------------------------------------
    static int sumDigits2(int number){ // 1234
        int sum = 0;
        String numAsString= String.valueOf(number); // "1234"
        char[] digits = numAsString.toCharArray(); // ['1','2','3','4']
        for(int i =0; i< digits.length ; i++){
            String digitAsString = String.valueOf(digits[i]); // '1' == "1" == 1
            sum = sum + Integer.parseInt(digitAsString);
        }
        Print.info("SUM 2 : "+sum);
        return sum;
    }
//----------------------------------MAIN---------------------------------------------//
    public static void main(String[]args){
        Print.info("The sum of digits ", sumDigits(1234));
        sumDigits2(12345);
        /*
        Print.info("The sum of digits ", sumDigits(-125));
        Print.info("The sum of digits ", sumDigits(123));
        Print.info("The sum of digits ", sumDigits(-12));
        */

    }
}

/*
sum=0
n=48634     n%10=4  n/10=4863.4 = 4863
n=4863      n%10=3  n/10=486.3 = 486
n=486       n%10=6  n/10=48.6 = 48
n=48        n%10=8  n/10=4.8 = 4
n=4

'A' --> 64
'%' --> 72
'1' -->42 char to int
*/
