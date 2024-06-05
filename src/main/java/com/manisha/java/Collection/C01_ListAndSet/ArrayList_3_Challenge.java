package com.manisha.java.Collection.C01_ListAndSet;
import com.manisha.java.util.Print;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayList_3_Challenge {
    private static Scanner scan = new Scanner(System.in);

    private static void printMenu(){
        String textBlocks = """
                Available actions:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                """;
        Print.print(textBlocks + "");
    }
    private static void addItems(ArrayList<String> groceries) {
        Print.print("Add item(s) [separate items by comma]: ");
        String[] items = scan.nextLine().split(","); //prints user String['items'] in a nextLine into an array.
        groceries.addAll(List.of(items));
    }
    private static void removeItems(ArrayList<String> groceries) {
        Print.print("Remove item(s) [separate items by comma]: ");
        String[] items = scan.nextLine().split(",");
        groceries.removeAll(List.of(items));
    }

    public static void main(String[] args) {
        boolean condition = true;

        ArrayList<String> groceries = new ArrayList<>();

        while (condition) //run until condition is true
        {
            printMenu();

            System.out.println("\nEnter a number for which action you want to do : ");
            String inputStr = scan.nextLine(); //takes String input

            int inputInt = Integer.parseInt(inputStr);//Parse String to Int--/an expression that evaluates to an integer.

            switch (inputInt){
                //case 0 -> (shutDown);
               case 1 -> addItems(groceries);
               case 2 -> removeItems(groceries);
                default -> condition = false;//if user enters other than 1 or 2.
            }
            groceries.sort(Comparator.naturalOrder());//sorts [items]
            Print.print(groceries);
        }
    }
}
 /*
           switch (inputStr){ //an expression that evaluates to an integer.
                //if user enters other than 1 or 2.
                //case "0" -> {},
                //case "1" -> {};
                default -> flag = false;
            }
            */