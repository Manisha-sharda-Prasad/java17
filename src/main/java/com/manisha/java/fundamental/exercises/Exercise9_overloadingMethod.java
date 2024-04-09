package com.manisha.java.fundamental.exercises;

import com.manisha.java.util.Print;

public class Exercise9_overloadingMethod {

    public static double convertToCentimeters(int heightInches) { //68
        double inchToCm = heightInches * 2.54;
        Print.info("output :: ", heightInches + " in", inchToCm + " cm");
        return inchToCm;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInchRemainder) {
        int feetToInches = (heightInFeet * 12) + heightInchRemainder; //68
        Print.info("input :: ", heightInFeet + " ft " + heightInchRemainder + " in");
        return convertToCentimeters(feetToInches);
    }

    public static void main(String[] args) {

        convertToCentimeters(5, 8);
    }
}