package com.manisha.java.fundamental.controlFlow;

import com.manisha.java.util.Print;

public class TheForStatement {

    public static double calcInterest(double amount, double intRate){

        return  (amount * (intRate /100));
    }
    public static double calcuInt(double amount, double intRate){
        return (amount * (intRate /100));
    }
    public static void main(String[]args){
        //1.)-------
        for ( double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calcInterest(10000.0, rate);
            Print.info(" 10,000  at interest of " + rate + "% = " + interestAmount);

        }
        //2.)-------
         for (double i = 7.5; i <= 10; i += 0.25) {
            double intAmount =  calcuInt(500.0 , i );
//           if (intAmount > 8.5){
//                break;
//            }
             Print.info( " $500  amount interest of " + i + "% =  $" + intAmount );
        }
    }
}
