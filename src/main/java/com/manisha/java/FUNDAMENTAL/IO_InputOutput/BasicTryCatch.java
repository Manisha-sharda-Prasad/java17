package com.manisha.java.FUNDAMENTAL.IO_InputOutput;

public class BasicTryCatch {
    public static void main(String[] args) {
        tryCatch();
        tryCatchFinally();
        multipleCatch();

    }

    //Arithmetic Exception--
    public static void tryCatch() {
        try {
            int result = 20 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught ");
        }
        System.out.println("Still Continuing Program");
    }

    // ArrayIndexOutOfBoundsException--
    public static void tryCatchFinally() {
        try {
            int[] result = {1, 2, 3, 4};
            System.out.println(result[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception Caught.");
        } finally {
            System.out.println("This will Always Run.");
        }
        System.out.println("Still Continuing Program");

    }
    // NullPointerException--
    public static void multipleCatch() {
        try {
            String str = null;
            System.out.println(str.length());

            int result = 12 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught : not divisible by 0");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception caught ");
        } finally {
            System.out.println("This will Always Run.");
        }

    }


}