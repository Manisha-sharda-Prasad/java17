package com.manisha.java.OOPS.Abstraction;

abstract public class ProductsForSale {
    private String type;
    private int price;
    private String description;

    public static double getSalesPrice(int quantity , double price){
       return quantity * price;
    }
    public static void priceLineItem(int quantity , int item){

    }
    //abstract static void showDetails(){}


}
