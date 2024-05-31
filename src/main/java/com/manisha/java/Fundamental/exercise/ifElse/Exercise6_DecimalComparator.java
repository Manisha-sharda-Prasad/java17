package com.manisha.java.Fundamental.exercise.ifElse;

import com.manisha.java.util.Print;

public class Exercise6_DecimalComparator
{
public static boolean  areEqualByThreeDecimalPlaces(double valueOne, double valueTwo ) {
 long valOneRounded = (long) (valueOne * 1000);
 long valTwoRounded = (long) (valueTwo * 1000);
    Print.info("one : ", valueOne, (valueOne * 1000), valOneRounded,
            "two : ", valueTwo, (valueTwo * 1000), valOneRounded );
  //return valOneRounded == valTwoRounded ;
  //boolean  result = false;

  if (valOneRounded == valTwoRounded) {
      Print.info("numbers are the same up to three decimal places");
      return true;
  }
  else {
      Print.info("false value");
      return false;
  }
}
    // --- start here ---

    //  ############## MAIN #############
    public static  void main(String[] args){
     areEqualByThreeDecimalPlaces(-3.1756, -3.175);
     areEqualByThreeDecimalPlaces(3.0, 3.0);

    }
}


