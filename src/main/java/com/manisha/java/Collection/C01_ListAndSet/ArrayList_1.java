package com.manisha.java.Collection.C01_ListAndSet;

import com.manisha.java.Collection.C01_ListAndSet.model.GroceryItem;
import com.manisha.java.util.Print;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_1 {
    public static void main(String[]args)
    {
        // OLD
        // Array / []
        GroceryItem[] groceryItems = new GroceryItem[3];

        groceryItems[0] = new GroceryItem("milk");
        groceryItems[1] = new GroceryItem("apples","PRODUCE",6);
        groceryItems[2] = new GroceryItem("oranges","PRODUCE",5);

        Print.print(Arrays.toString(groceryItems)); //toString()--overriding this method  above

        // NEW
        // Collection - List : ArrayList
        // basic Operation :: add(E), set(index), remove(index)
        ArrayList<GroceryItem> groceryList = new ArrayList<>();

        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Milk","DAIRY",2));
        groceryList.add(new GroceryItem("Oranges","PRODUCE",7));
        groceryList.set(0,new GroceryItem("Apples","PRODUCE",8));
        groceryList.remove(1);

        Print.print(groceryList);

    }
}

// Notes:

// toString method--- Array class also contains "toString method"- nicely formats an array of objects.
// The String.format--- method signature,This template contains ‘%’ chars to represent where the various Objects should be placed within it.
// set() - replace the first item, puts itself.
// remove()