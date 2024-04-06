package com.manisha.java.fundamental.exercises;


public class Exercise2_SpeedConverter
{
    public static long toMilesPerHour(double kilometersPerHour){
        double result = (kilometersPerHour < 0) ? -1d : kilometersPerHour / 1.6;
        //return String.valueOf(result);
        return Math.round(result);
    }

    public static void printConversion(double kilometersPerHour){
        long result = toMilesPerHour(kilometersPerHour);
        if(result == -1d){
            System.out.println("Invalid value" );
        }else{
            System.out.println(kilometersPerHour + " km/h = "+result + " mi/h");
        }
    }

    public static void main(String... args){
        // testing
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(1.5);

        printConversion(100.0); // 62
        printConversion(100.4); // 62
        printConversion(15.25); // 9
    }
}

/*
-- Conversion methods --
    - String.valueOf()
    - Integer.pasrsInt
    - Long.parseLong
 */
