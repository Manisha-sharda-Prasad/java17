package com.manisha.java.oops.Encapsulation.Printer;

import com.manisha.java.util.Print;
public class PrinterMain {
    public static void main(String[]args){

        Printer printer = new Printer(50, true);
        Print.print("Initial page count is = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job pages = %d, Printer Total = %d %n", pagesPrinted, printer.getPagesPrinted());
    }
}
//------------------------