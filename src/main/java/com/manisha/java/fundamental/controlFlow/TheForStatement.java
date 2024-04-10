package com.manisha.java.fundamental.controlFlow;

import com.manisha.java.util.Print;

public class TheForStatement {

    public static double calcInterest(double amount, double intRate){

        double interestAmount = (amount * (intRate /100));

        for ( double rate = 2.0; rate <= 5.0; rate++){
            Print.info( "% interest of " + amount+ " at "+ rate + "% is " + interestAmount );
        }
        return interestAmount;
    }
    public static void main(String[]args){
        calcInterest(10000, 2);
    }
}
