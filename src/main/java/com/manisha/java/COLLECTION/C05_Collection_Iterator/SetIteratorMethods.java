package com.manisha.java.COLLECTION.C05_Collection_Iterator;

import java.util.*;

public class SetIteratorMethods {
    public static void main(String[] args) {
        Set<String> listFruits = new HashSet<>();

        listFruits.add("Apple");
        listFruits.add("Banana");
        listFruits.add("Orange");
        listFruits.add("Mango");

        Iterator<String> iterator = listFruits.iterator();
        while (iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit);

            if (fruit.equals("Apple")){
                iterator.remove();
            }
        }
        System.out.println("After removal: " + listFruits);
    }
}