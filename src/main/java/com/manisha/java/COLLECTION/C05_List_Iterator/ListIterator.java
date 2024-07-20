package com.manisha.java.COLLECTION.C05_List_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {

        List<String> listFruits = new ArrayList<>();

        listFruits.add("Apple");
        listFruits.add("Banana");
        listFruits.add("Orange");
        listFruits.add("Mango");

        Iterator <String> iterator = listFruits.iterator();

        while (iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit);
            //if (fruit.equals("Apple"))
            if (fruit.contains("Banana")){
                iterator.remove();
            }
        }
        System.out.println("After Removal : " + listFruits);

    }
}
/*
Iterator methods--
- hasNext(): Returns true if the iteration has more elements.
- next(): Returns the next element in the iteration.
- remove(): Removes the last element returned by the iterator.*/
