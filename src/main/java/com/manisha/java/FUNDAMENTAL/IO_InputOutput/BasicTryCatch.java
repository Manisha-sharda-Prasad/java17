package com.manisha.java.FUNDAMENTAL.IO_InputOutput;

public class BasicTryCatch {
    public static void main(String[] args) {
        tryCatch();
        tryCatchFinally();

    }

    public static void tryCatch(){
            try {
                int result = 20/ 0;
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception caught ");
            }
            System.out.println("Still Continuing Program");
    }

    public static void tryCatchFinally(){
        try {
            int[] result = {1,2,3,4};
            System.out.println(result[6]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Exception Caught.");
        } finally {
            System.out.println("This will Always Run.");
        }
        System.out.println("Still Continuing Program");

    }

}
