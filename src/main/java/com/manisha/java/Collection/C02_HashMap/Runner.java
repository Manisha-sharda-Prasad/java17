package com.manisha.java.Collection.C02_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        Map<String,String> myMap = new HashMap<>();

        //HashMap
        myMap.put("716-OakGlen", "De-active");
        myMap.put("40-Tangelo", "De-active");
        myMap.put("41-Tangelo", "active");
        myMap.put("716-OakGlen", "De-active-2");
        myMap.put(null, null); // already present

        //HashSet -- bts its map only
        myMap.put("890-OakGlen", null);  //             <<< NOTICE : All values are null
        myMap.put("891-LakeWood", null);
        myMap.put("892-Orange blossom", null);


        // Convert to list/Set
        // entrySet() - [ entry1, entry2, entry3 ] = list/set :: Set<Entry> :: random order
        // keySet() - [ 716-OakGlen , 40-Tangelo, 41-Tangelo ] :: Set<String>
        // values() - [De-active, De-active, active] :: List<String>

        for (Map.Entry entry : myMap.entrySet()){
            System.out.println("\n"+entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println( "\n"+myMap.get("41-Tangelo"));  //  <<<<
    }
}
