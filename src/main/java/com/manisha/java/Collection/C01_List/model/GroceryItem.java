package com.manisha.java.Collection.C01_List.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GroceryItem
{
    String name;
    String type;
    int count;

    public GroceryItem(String name) {
        this(name, "DAIRY",1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);//(count,name) ( int, string, string)
    }
}
