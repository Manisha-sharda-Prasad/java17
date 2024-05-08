package com.manisha.java.oops.Inheritance.Strings;

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
        //------------------------------------------------
        String textBlock = """
                Print a Bulleted list:
                        \u2022 First 
                              \u2022 Second """;
        Print.print(textBlock);
        //------------------------------------------------
        int age = 35;
        String name = "Rohan";
        int yearOfBirth = 2023 - age;
        //printf- format
        System.out.printf("Name : %s , Age : %d  Birth year : %d " , name, age, yearOfBirth);
        System.out.printf("Your age is %.2f%n ", (float) age);

        int age2 = 20;
        float height = 5.8f;
        String name2 = "John";

        System.out.printf("Name: %s , Age: %d , Height: %.2f%n ", name2, age2, height);


    }
}
