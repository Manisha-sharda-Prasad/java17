package com.manisha.java.Collection.ListAndSet;

import com.manisha.java.util.Print;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};
        Print.print(items);
        //listItems--original copy----
        List <String> listItems = List.of(items);
        Print.print(listItems);

        //'new' instance/ groceries--making separate copy, making changes in copy version----
        //calling const. on ArrayList(and passing arg)----
        ArrayList <String> groceries = new ArrayList<>(listItems);
        groceries.add("yogurt");
        groceries.remove(0);
        Print.print(groceries);

        //better ways to add elements----
        //passing list of Strings, to static method on List -(List.of)---
        ArrayList<String> nextList = new ArrayList<>(
                List.of("Pickles", "mustard","cheese"));
        Print.print(nextList);
        //add.all(other var) array-----
        groceries.addAll(nextList);
        Print.print(groceries);
    }
}
