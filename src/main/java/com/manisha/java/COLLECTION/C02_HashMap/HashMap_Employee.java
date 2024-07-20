package com.manisha.java.COLLECTION.C02_HashMap;
import java.util.HashMap;
import java.util.Map;

public class HashMap_Employee {
    public static void main(String[] args) {

        //(K,V) pairs
        HashMap<Integer, String> employee = new HashMap();
        employee.put(101, "Alias");
        employee.put(103, "Pika");
        employee.put(104, "Chandy");
        employee.put(103, "Rek");
        employee.put(101, "Aka");

        //Accessing Value by Key
        System.out.println("Employee 101 : " + employee.get(101)); //showing last, new key result
        for (Map.Entry <Integer, String> entry  : employee.entrySet()){
            System.out.println("Id: " + entry.getKey() +", Name:" + entry.getValue());
        }
        employee.remove(101);

        System.out.println(employee.size());
        System.out.println(employee); //lifo print--last(new)
    }
}

/*
(Entry, entrySet)
(get, getKey, getValue)
(put, remove, size)
- Fast access, unordered. Use for quick look-ups.
- To access value in HashMap, must know its key.*/
