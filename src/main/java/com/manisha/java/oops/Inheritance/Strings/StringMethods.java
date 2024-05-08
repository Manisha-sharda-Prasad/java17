package com.manisha.java.oops.Inheritance.Strings;

import com.manisha.java.util.Print;

public class StringMethods {
    public static void main(String[]args){
        String dob = "4/12/1995";
        int startIndex = dob.indexOf("1995");
        Print.print("Starting index : " + startIndex);
        Print.print("Birth date : " + dob.substring(startIndex));
        Print.print("Month : " + dob.substring(3, 6));

       String newDate = String.join("/","23", "11", "1995");
       Print.print("new date : " + newDate);

       newDate = "25".concat("/").concat("12").concat("/").concat("1990");
       Print.print("new date : " + newDate);

       Print.print(newDate.replace('/', '-'));
       Print.print(newDate.replace("2", "0"));
    }
}
