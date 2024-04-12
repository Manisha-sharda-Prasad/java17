package com.manisha.java.fundamental.exercise.whileAndDoWhile;

import com.manisha.java.util.Print;
import java.util.ArrayList;

public class Exercise9_GetGreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int number1, int number2)
    {
        int result = 0;
        // 1.lis of Divisor/factors
        ArrayList factors_number1 = Exercise8_PrintFactors.printFactors(number1);
        ArrayList factors_number2 = Exercise8_PrintFactors.printFactors(number2);

        //  2. Greatest - iterate array from back
        //  3. Common - equal operator
        for(int i = factors_number1.size()-1 ; i >=0  ; i--)
        {
            int list1_item = (int) factors_number1.get(i);
            Print.print("factors_number1 ["+i+"] = "+ list1_item);

            for(int j = factors_number2.size()-1 ; j >=0  ; j--)
            {
                int list2_item = (int) factors_number2.get(j);
                Print.print("\tfactors_number2 ["+j+"] = "+ list2_item);

                if(list1_item == list2_item){
                    result = list1_item;
                    break;
                }
            }
            if (result != 0)
                break;
        }
        Print.print("getGreatestCommonDivisor ", result);
        return result;
    }

    public static void main(String[]args){
        getGreatestCommonDivisor(25, 15);
        getGreatestCommonDivisor(12, 30);
        getGreatestCommonDivisor(9,18);
        getGreatestCommonDivisor(81,53);
    }
}
/*
 #################### 25
------------------------------
List of factors
[1, 5, 25]
------------------------------


 #################### 15
------------------------------
List of factors
[1, 3, 5, 15]
------------------------------
factors_number1 [2] = 25
------------------------------
	factors_number2 [3] = 15
------------------------------
	factors_number2 [2] = 5
------------------------------
	factors_number2 [1] = 3
------------------------------
	factors_number2 [0] = 1
------------------------------
factors_number1 [1] = 5
------------------------------
	factors_number2 [3] = 15
------------------------------
	factors_number2 [2] = 5
------------------------------
 getGreatestCommonDivisor
5
------------------------------
 */

