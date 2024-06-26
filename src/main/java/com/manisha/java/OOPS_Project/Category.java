package com.manisha.java.OOPS_Project;

import lombok.*;

@Getter
@Setter
public class Category {
    int ordinal;
    String value;

    private Category(int ordinal, String name) {
        this.ordinal = ordinal;
        this.value = name;
    }

    // ====== SELF OBJECT
    public static Category NECKLACE = new Category(0,"NECKLACE");
    public static Category EAR = new Category(1,"EAR");
    public static Category BRACELET  = new Category(2,"BRACELET");
}


/*
  CategoryEnum o1 = new CategoryEnum(0,"NECKLACE");
  CategoryEnum o1 = new CategoryEnum(1,"EAR");
  CategoryEnum o1 = new CategoryEnum(2,"BRACELET");
 */

