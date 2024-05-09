package com.manisha.java.oops.Inheritance.Strings;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Strings {
    public static void main(String[]args){
        printoinfo("Hello World");
        printoinfo("");
        printoinfo("\t \n");

        String hello = "Hello World";
        System.out.printf("index of r : %d %n", hello.indexOf('r'));

        System.out.printf("index of l: %d %n", hello.indexOf('l'));
        System.out.printf("last index of l: %d %n", hello.lastIndexOf('l'));
        System.out.printf("index of l: %d %n", hello.indexOf('l', 3));
        System.out.printf("last index of l: %d %n", hello.lastIndexOf('l',8));
        log.info("Hello lekhraj {} {}",hello,23 );

        String helloWorldLower = hello.toLowerCase();
        if(hello.equals(helloWorldLower)){
            System.out.println("Value match!");
        }
        if(hello.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Value match Ignoring Case! ");
        }
        if(hello.startsWith("Hello")){
            System.out.println("String starts with hello. ");
        }
        if(hello.endsWith("World")){
            System.out.println("String ends with world. ");
        }
        if(hello.contains("World")){
            System.out.println("String contains world. ");
        }
    }
    //--------------------------------------------
    public static void printoinfo(String string) {
        int length = string.length();
        System.out.printf("Length : %d %n", length);

        if(string.isEmpty()){
            System.out.printf("String is empty" );
            return;
        }
        System.out.printf("First char : %c %n", string.charAt(0));
        System.out.printf("Last char : %c %n", string.charAt(length- 1));
    }
}
