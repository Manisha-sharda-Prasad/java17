package com.manisha.java.collection.arraysInJava;

public class BasicsOfArray {

    //Declaring an Array-----
//    int[] numbers;
//    String[] names;

    //Instantiating an Array----
//    numbers = 'new' int[5];
//    names = 'new' String[10];

    //Initializing an Array-----
// elementType[] arrayName = {value1, value2, value3, ...};
    int[] numbers = {1, 2, 3, 4, 5};
    String[] names = {"Alice", "Bob", "Charlie"};

    //Usage in Methods-----
//use array initializers directly in method calls:
//printNumbers(new int[]{1, 2, 3, 4, 5});

    public static void printNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
    //Arrays.toString()------
    int[] number = {1, 2, 3, 4, 5};
//    String arrayStr = Arrays.toString(number);
//    Print.print(arrayStr);  // Output: [1, 2, 3, 4, 5]
}
