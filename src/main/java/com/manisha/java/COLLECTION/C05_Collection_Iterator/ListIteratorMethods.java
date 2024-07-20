package com.manisha.java.COLLECTION.C05_Collection_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods {

    public static void main(String[] args) {

        List<String> listFruits = new ArrayList<>();

        listFruits.add("Apple");
        listFruits.add("Banana");
        listFruits.add("Orange");
        listFruits.add("Mango");

        ListIterator <String> listIterator = listFruits.listIterator();

        //Forward Iteration :

        while (listIterator.hasNext()){
            String fruit = listIterator.next();
            System.out.println(fruit);

            if (fruit.equals("Mango")){
                listIterator.set("Blueberry");
            }
        }
        //Backward Iteration :

        while (listIterator.hasPrevious()){
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }
        System.out.println("Modified list: " + listFruits);
    }
}