package com.manisha.java.Fundamental.io;

import com.manisha.java.util.NumberUtil;
import com.manisha.java.util.Print;

import java.util.Scanner;

public class readingInputChallenge {
    public static int sumInputNumbers(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String numStr = null;

        for (int i = 1; i <= 5; i++){
            Print.print("Enter numbers_"+i );

            numStr = scanner.nextLine(); //<<<<<

            if(NumberUtil.IsValidWholeNumber(numStr)){
                sum = sum + Integer.parseInt(numStr); //<<<<
            }else {
                Print.print("skipping "+ numStr);
            }
        }
        Print.print(sum);
        return sum;
    }
//-----------------------------MAIN---------------------------------------
    public static void  main(String[]args){
        sumInputNumbers();
    }
}
