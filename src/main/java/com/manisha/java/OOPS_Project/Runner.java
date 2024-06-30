package com.manisha.java.OOPS_Project;

import com.manisha.java.util.Print;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        // 1. user login - newUser (7 days) SpecialDiscount
        Cart cartM = new Cart();
        cartM.setBill(0.0d);
        cartM.setItems(new ArrayList<>());
        cartM.setDiscount(new SpecialDiscount());

        User userM = new User("Manisha", "prasadmanisha@g", "9891082408",cartM);
        userM.setCart(cartM);
        Print.print("User logged-in, ", userM);

        // 2. view product
        List<Jewellery> allStoreItemList = new ArrayList<>();

        Jewellery jn1=new Necklace("necklace-1", 101, 5, Category.NECKLACE);
        allStoreItemList.add(jn1);
        Jewellery jn2=new Necklace("necklace-2", 102, 10, Category.NECKLACE);
        allStoreItemList.add(jn2);
        Jewellery jn3=new Necklace("necklace-3", 103, 15, Category.NECKLACE);
        allStoreItemList.add(jn3);
        Jewellery jn4=new Necklace("necklace-4", 104, 20, Category.NECKLACE);
        allStoreItemList.add(jn4);

        Jewellery je1=new Earpiece("Earpiece-1", 201, 5); //buy
        allStoreItemList.add(je1);
        Jewellery je2=new Earpiece("Earpiece-2", 202, 15);
        allStoreItemList.add(je2);
        Jewellery je3=new Earpiece("Earpiece-3", 203, 25);
        allStoreItemList.add(je3);

        Jewellery jb1=new Bracelet("Bracelet-1", 301, 5);
        allStoreItemList.add(jb1);
        Jewellery jb2=new Bracelet("Bracelet-2", 302, 15);
        allStoreItemList.add(jb2);
        Jewellery jb3=new Bracelet("Bracelet-3", 303, 25); //buy
        allStoreItemList.add(jb3);
        // [jn1, jn2, jn3, jn4,  je1, je2, je3,  jb1, jb2, jb3] // insert order
        // 100

        // Jewellery Sort
        // 1. sort by productName
        // 2. sort by ProductCode
        // 3. sort by price

        Collections.sort(allStoreItemList, (j1,j2) -> {
            if(j1.productCode > j2.productCode) return 1;
            if(j1.productCode < j2.productCode) return -1;
            else return 0;
        });

        // Collections.sort(
        //                  list-1 var ,
        //                  Comparator(I) > compare(t1,t2){... return -1,0,1}
        //                  )

        System.out.println("==== My Store Items =====");
        for( Jewellery j : allStoreItemList){
            Print.print(j);
        }

        // 3. add cart - 2 // <<<<
        userM.getCart().addItems(je1);
        userM.getCart().addItems(jb3);
        userM.getCart().addItems(jn3);
        userM.getCart().removeItems(jn3);

        // 4. place order - invoice  // <<<<
        userM.getCart().printInvoice();
    }
}
