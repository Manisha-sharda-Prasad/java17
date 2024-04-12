package com.manisha.java.fundamental.io;

// Note : run from terminal only.
public class Input_Console {
    public static void main(String... args){
        String name = System.console().readLine("Please enter name : ");
        int age = Integer.parseInt( System.console().readLine("What's your age : ") );
        //log.info("Welcome {} Your age is {}", name , age );
        System.out.println("Welcome "+name+", Your age is "+age );
        String hobbies = System.console().readLine("What are your hobbies?");
        System.out.println(hobbies + " looks interesting to us!!!");
        long phoneNumber = Long.parseLong(System.console().readLine("Enter your phone number :"));
        System.out.println("Confirm Number : " + phoneNumber );
    }
}
