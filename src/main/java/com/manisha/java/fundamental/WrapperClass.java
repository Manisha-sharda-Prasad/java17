package com.manisha.java.fundamental;

import com.manisha.java.util.Print;

public class WrapperClass {
    public static void main(String[] args)
    {
        System.out.println("======= A. Wrapper : String =========");
        String str1 = new String("manisha - String object"); // heap
        String str2 = "Manisha - string literal" ; // string literal - String pool (fast)
        Print.info( str1);


        System.out.println("======= B. Wrapper : Integer, Long, Short, Byte =========");
        String numAsStr = "55";
        System.out.println("String 2 long : " +Long.parseLong(numAsStr)); // 55
        System.out.println("String 2 int : " +Integer.parseInt(numAsStr));  // 55
        Integer i2 = 20;
        int i1 = i2;


        System.out.println("======= C. Wrapper : Float, float =========");

        System.out.println("======= D. Wrapper : Boolean =========");

    }
}
/*
- Corresponding java-class for each primitive data type.
    eg : int and Integer
         long and Long
         boolean and Boolean

- Autoboxing :
    eg: Integer and int can be used interchangebly.
 */
