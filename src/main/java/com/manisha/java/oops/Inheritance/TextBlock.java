package com.manisha.java.oops.Inheritance;

import com.manisha.java.util.Print;
//Escape Sequence- /t, /n,/", //....
//Text block
//Format specifiers- %d(decimal int value),
public class TextBlock {

    public static void main (String[]args){

        String bulletIt = "Print in bullet list : \n" +
                "\t\u2022 First \n" +
                "\t \u2022 Second \n";
        Print.print(bulletIt);


        String textBlock = """
                Print a Bulleted list:
                        \u2022 First 
                              \u2022 Second """;
        Print.print(textBlock);

        int age = 35;
        Print.print("Your age is %d%n" , age);
        int yearOfBirth = 2023 - age;
        Print.print("Age = %d, Birth year = %d", age, yearOfBirth);
        Print.print("Your age is %fs%n", (float) age);

    }
}
