package com.manisha.java.FUNDAMENTAL.IO_inputOutput;

// Note : run from terminal only.
public class Input_Console {
    public static void main(String... args)
    {
        // ---- "System.console().readLine("please enter XXXX") "----

        String name = System.console().readLine("Please enter name : ");
        int age = Integer.parseInt( System.console().readLine("What's your age : ") );
        System.out.println("Welcome "+name+", Your age is "+age );

        String hobbies = System.console().readLine("What are your hobbies?");
        System.out.println(hobbies + " looks interesting to us!!!");

        long phoneNumber = Long.parseLong(System.console().readLine("Enter your phone number :"));
        System.out.println("Confirm Number : " + phoneNumber );

    }
}

// Dont USE
