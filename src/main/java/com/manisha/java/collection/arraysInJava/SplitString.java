package com.manisha.java.collection.arraysInJava;

import com.manisha.java.util.Print;

public class SplitString {
    public static void main(String...args){
        String [] splitString = "Hello World Again ".split(" ");
        printText(splitString);

        Print.print("/".repeat(20));
        printText("Hello");

        Print.print("/".repeat(20));
        printText("Hello" , "World" , "2024");

        Print.print("/".repeat(20));
        printText(); //no args

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};//String sArray, anonymous array initializer.
        Print.print(String.join(",", sArray));// using sArray(arrays) as a method arg.

    }
    private static void printText(String...textList){
        for (String t : textList){
            Print.print(t);
        }
    }
}
//.split(), .repeat(), .join()
//(String... textList)--feature let us create one method to support multiple ways, of calling this method, call with no args also

//"varargs"--the Var arguments parameter, gives more option when executing methods,
//but can only have one argument.eg-(String...'textList'), (String.join--java inbuilt methods also take one and last arg)

//'anonymous array initializer-' called anon. because type isn't included.