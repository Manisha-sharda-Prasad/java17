package com.manisha.java.OOPSProject;

import com.manisha.java.util.Print;

import java.util.ArrayList;
import java.util.List;

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
        List<Jewellery> allStoreItems = new ArrayList<>();

        Jewellery jn1=new Necklace("necklace-1", 101, 5);
        allStoreItems.add(jn1);
        Jewellery jn2=new Necklace("necklace-2", 102, 10);
        allStoreItems.add(jn2);
        Jewellery jn3=new Necklace("necklace-3", 103, 15);
        allStoreItems.add(jn3);
        Jewellery jn4=new Necklace("necklace-4", 104, 20);
        allStoreItems.add(jn4);

        Jewellery je1=new Earpiece("Earpiece-1", 201, 5); //buy
        allStoreItems.add(je1);
        Jewellery je2=new Earpiece("Earpiece-2", 202, 15);
        allStoreItems.add(je2);
        Jewellery je3=new Earpiece("Earpiece-3", 203, 25);
        allStoreItems.add(je3);

        Jewellery jb1=new Bracelet("Bracelet-1", 301, 5);
        allStoreItems.add(jb1);
        Jewellery jb2=new Bracelet("Bracelet-2", 302, 15);
        allStoreItems.add(jb2);
        Jewellery jb3=new Bracelet("Bracelet-3", 303, 25); //buy
        allStoreItems.add(jb3);

        System.out.println("==== My Store Items =====");
        for( Jewellery j : allStoreItems){
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
