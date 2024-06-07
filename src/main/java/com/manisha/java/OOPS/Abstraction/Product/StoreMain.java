package com.manisha.java.OOPS.Abstraction.Product;

import com.manisha.java.util.Print;

import java.util.ArrayList;

public class StoreMain {
    public static ArrayList<ProductsForSale> storeProducts= new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil Painting", 1350, "Work done By Tanushri in 2017"));
        storeProducts.add(new ArtObject("Sculpture", 2000, "Work done By Lekhraj in 2010"));

        listProducts();
    }
    public static void listProducts(){
        for(var item : storeProducts){
            Print.print("-".repeat(20));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex , int quantity) {
        order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
    }
}

//parent-"ProductsForSale"-->subclass-ArtObject,
//mainClass-StoreMain.
//others-OrderItem


//passing new-instance of (concrete) class 'ArtObject' / subclass of (abstract Parent Class) "ProductsForSale"/