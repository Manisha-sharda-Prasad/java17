package com.manisha.java.Collection.ListAndSet;
import com.manisha.java.util.Print;
import java.util.ArrayList;
import java.util.Arrays;

public record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }
public class Main{
    public static void main(String[]args){
        GroceryItem[] groceryItems = new GroceryItem[3];
        groceryItems[0] = new GroceryItem("milk");
        groceryItems[1] = new GroceryItem("apples","PRODUCE",6);
        groceryItems[2] = new GroceryItem("oranges","PRODUCE",5);
        Print.print(Arrays.toString(groceryItems));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        //<Type> = <> --diamond-Operator------
        ArrayList<GroceryItem> groceryItems1 = new ArrayList<>();
        groceryItems1.add(new GroceryItem("Butter"));
    }
}
}
