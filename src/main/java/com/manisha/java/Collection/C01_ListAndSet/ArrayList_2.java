package com.manisha.java.Collection.C01_ListAndSet;

import com.manisha.java.util.Print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayList_2
{
    public static void main(String[] args)
    {
        // Array
        String[] items = {"apples", "bananas", "milk", "eggs"};

        // List from Array
        List<String> listItems = List.of(items);
        Print.print(listItems);

        ArrayList <String> groceries = new ArrayList<>(listItems);
        groceries.add("yogurt");
        groceries.remove(0);
        Print.print(groceries);

        //better ways to add elements----
        //passing list of Strings, to static method on List -(List.of)---
        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard","cheese","papaya","naan"));
        Print.print(nextList);
        //addAll(other var) array-----
        groceries.addAll(nextList);
        Print.print(groceries);

        //other in-built methods used for elements of array ------
        Print.print("third item = " + groceries.get(2));

        if(groceries.contains("mustard")){Print.print("contains mustard!");}

        groceries.add("yogurt");

        Print.print("first = "+ groceries.indexOf("yogurt"));
        Print.print("last = "+ groceries.lastIndexOf("yogurt"));

        groceries.remove(1);
        groceries.remove("yogurt");
        Print.print(groceries);

        groceries.removeAll(List.of("bananas","eggs"));
        Print.print(groceries);

        groceries.retainAll(List.of("apples","milk","mustard", "naan", "cheese"));
        Print.print(groceries);

        groceries.clear();
        Print.print(groceries);
        Print.print("isEmpty = "+ groceries.isEmpty());

        groceries.addAll(Arrays.asList("eggs", "watermelon", "apricot", "ham", "mints", "cucumber"));
        Print.print(groceries);

        groceries.sort(Comparator.naturalOrder());
        Print.print(groceries);

        groceries.sort(Comparator.reverseOrder());
        Print.print(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        Print.print(Arrays.toString(groceryArray));

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        Print.print(newList);
    }
}

//Methods-java.util--
//.contains()
//.get(),
//.add(), .remove(),
//.addAll(), .removeAll(),
//.retainAll(),
//.clear(),
//.isEmpty(),
//.indexOf(),
//.LastIndexOf(),
//.List.of(),
//.Arrays.asList(),
//.sort(),
//.sort(Comparator.naturalOrder(),
//.sort(Comparator.reverseOrder(),
//.size()
//.asList()-- returns mutable list, but not resizeable(element size fixed)-----
//List.of()-- returns immutable list,resizable. Attempt to modify the list(add,remove,or update elements)will result in UnsupportedOperationException