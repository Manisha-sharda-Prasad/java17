package com.manisha.java.FUNDAMENTAL.IO_inputOutput;

import com.manisha.java.util.Print;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Input_Scanner {

    public static void scanner2_file(){
        // program-2 (Scanner for File)
        File myFile_1 = new File("inputfile.txt"); //file
        try{
            Scanner scanFromFile = new Scanner(myFile_1);
            String line1 = scanFromFile.nextLine(); // hint : use inside while.
            String line2 = scanFromFile.nextLine();
            String line3 = scanFromFile.nextLine();

            System.out.println(line1);
            System.out.println(line2);
            System.out.println(line3);

        }catch (FileNotFoundException myExc){
            Print.print(myExc.getMessage(), "File does not exist !! Please enter correct file");
        }
        catch (Exception myExc){
            Print.print(myExc.getMessage(), "General Exception");
        }
        finally {
            Print.print("Iam finally block from exception handling"
                    , "I always get executed/run");
        }

        Print.info("Line after exception handling");
    }


    public static void scanner1_console(){
        // program-1 (Scanner for console) var = new Scanner(System.in)-------
        Scanner scanFromConsole = new Scanner(System.in); // System.in===console

        System.out.println("Please enter name : ");
        String name = scanFromConsole.nextLine(); // <<<<

        Boolean isValidYear = false;
        int year = 0;
        while (!isValidYear) {
            System.out.println(" Please enter birth year : ");

            try {
                year = Integer.parseInt(scanFromConsole.nextLine()); // <<<<
                if (year > 2024 || year < 1990) {
                    isValidYear = false;
                } else isValidYear = true;
            }catch (NumberFormatException badUserData) {
                System.out.println("Characters are not allowed! Try again.");
            }
        }

        int currentYear = LocalDateTime.now().getYear();
        int age = currentYear - year;

        System.out.println( "you are " + name + " and your birth year is " + year);
        System.out.println( "your age " +  age);
    }

//--------------------------------------MAIN-----------------------------------------------//
    public static void main(String... args)  {

        scanner1_console();

        //scanner2_file();

        //Scanner scanFromConsole = new Scanner(System.in);
//        while (true){
//
//            String text = scanFromConsole.nextLine();
//            Print.print(text);
//            if(text.equals("exit")) break;
//        }

    }
}

/*

         ---- scannerObj.nextLine() ----

         System.out.println("Please enter name : ");
         String name = scanFromConsole.nextLine();

inputfile.txt ::

hello manisha. this is line one.
line2
line3
line4

 */
