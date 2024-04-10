package com.manisha.java.fundamental.controlFlow;

import com.manisha.java.util.Print;

public class Switchcase {

    static String getQuarter(String month){
        String result = switch (month) {
            case "JAN", "FEB", "MAR" -> "1st";
            case "APR", "MAY", "JUN" -> "2nd";

            case "JUL", "AUG", "SEP" -> "3rd";
            case "OCT", "NOV", "DEC" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
        Print.info(month+" Quarter is "+result);
        return result;
    }

    // ############ MAIN ##############
    public static void main (String... args){
    getQuarter("MAY");
    getQuarter("DEC");

    }
}
