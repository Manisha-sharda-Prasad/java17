package com.manisha.java.fundamental.controlFlow;

import com.manisha.java.util.Print;

public class Switchcase {
    //1.)example-----------------------------------
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

    //2.)example------------------------------------
    static void natoWord( char charValue) {
        //char charValue = 'A';
        switch (charValue) {
            case 'A':
                Print.info("A is alien");
                break;
            case 'B':
                Print.info("B is baker");
                break;
            case 'C':
                Print.info("C is Charlie");
                break;
            case 'D':
                Print.info("D is Dog");
                break;
            case 'E':
                Print.info("E is Ellie");
                break;
            default:
                Print.info("It does not exist");
                break;

        }

    }


    //3.)example-------------------------------------
    static void printOfDayWeek(int day){
       String dayOfWeek = switch (day){
            case 0,7 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                String invalid =  " Invalid Day ";
                yield invalid;
            }
        };
       Print.info( day + " stands for " + dayOfWeek);
    }


    // ############ MAIN ##############
    public static void main (String... args){
    //1.----
    getQuarter("MAY");
    getQuarter("DEC");
    //2.----
     natoWord('A');
     natoWord('B');
     natoWord('X');

     //3.------
        printOfDayWeek(9);
        printOfDayWeek(3);
    }
}

/*
Traditional one

Enhanced switch expression (java 14 )
- return (by yeild keyword for each case.)
- case combine by ,. eg : Case 1,2,3 --> {}
- no need of break
- : replace ->
 */
