package com.manisha.java.fundamental.exercises;

import com.manisha.java.util.Print;

public class Exercise13_printEqualNum {
public static void printEqual(int x, int y, int z){


    if (x == y && y == z){
        Print.info("All numbers are equal");
    }
    else if(x != y && y != z && x!= z){
        Print.info("All numbers are different");
    }
    else {
        Print.info("Neither all are equal or different");
    }
}


    public static void main(String[] args) {
      printEqual(1, 1, 1);
      printEqual(-7, -1, -2);
    }
}
