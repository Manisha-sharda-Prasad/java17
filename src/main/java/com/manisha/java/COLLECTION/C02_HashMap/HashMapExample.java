package com.manisha.java.COLLECTION.C02_HashMap;

import com.manisha.java.util.Print;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Boolean> map = new HashMap<>();

        map.put("Summer", true);
        map.put("Rainy", false);
        map.put("June", true);
        map.put("Climate-Change", false);
        map.put("April", false);
        map.put("April", false);

        map.get("Rainy");            //("Key")--gets value
        map.containsKey("April");    //("Key")--gets value

        map.putIfAbsent("Snow", false);

        map.replace("Climate-Change", false, true);

        Print.print(map);
        //map.entrySet();
        map.keySet();


        for (String key : map.keySet()){
            Print.print("KEY: "+ key + ", VALUE: " + map.get(key) );
        }
    }
}
/*
HashMap--
- collection that implements Map interface.
- Stores (key , value) pairs,each key must be unique,
- does not maintain any order of elements.*/
