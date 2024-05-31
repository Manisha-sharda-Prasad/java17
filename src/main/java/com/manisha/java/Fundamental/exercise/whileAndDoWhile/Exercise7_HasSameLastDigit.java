package com.manisha.java.Fundamental.exercise.whileAndDoWhile;

import com.manisha.java.util.NumberUtil;
import com.manisha.java.util.Print;

public class Exercise7_HasSameLastDigit {

    public static boolean hasSameLastDigit (int number1, int number2, int number3)
    {
       boolean result = false;

       boolean number1_valid = NumberUtil.IsValidateRange(10,1000, number1);
       boolean number2_valid = NumberUtil.IsValidateRange(10,1000, number2);
       boolean number3_valid = NumberUtil.IsValidateRange(10,1000, number3);


        if(number1_valid && number2_valid && number3_valid)
       {
           int number1_lastdigit = number1%10;
           int number2_lastdigit = number2%10;
           int number3_lastdigit = number3%10;

           // sharing check
            if(         number1_lastdigit == number2_lastdigit
                    &&  number2_lastdigit == number3_lastdigit
            ){
                result = true;
            }
       }
       Print.print("hasSameLastDigit : " + result, "", "");
       return result;
    }

    public static void main(String[]args){
        hasSameLastDigit(41, 22, 71);
        hasSameLastDigit(23, 33, 43);
        hasSameLastDigit(9, 99, 999);
        hasSameLastDigit(18, 88, 888);

    }
}
/*
999%10 = 9
 */

