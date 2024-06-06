package com.manisha.java.OOPS.Abstraction.Product;

import com.manisha.java.util.Print;

abstract public class ProductsForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductsForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public  double getSalesPrice(int quantity ){
        return quantity * price;
    }
    public  void printPricedItem(int quantity ){
        //System.out.printf("%2d quantity at $%8.2f each, %-15s %-35 %n" + quantity + price + type + description);
        Print.print( quantity + " quantity at $" + price + " each, " + type + " " + description);
    }
    public abstract void showDetails();
}




//The format string "%2d quantity at $%8.2f each, %-15s %-35s%n" specifies:---
//%2d for a 2-digit integer (quantity).
//%8.2f for a floating-point number with 8 total digits and 2 decimal places (price).
//%-15s for a left-justified string with a width of 15 characters (type).
//%-35s for a left-justified string with a width of 35 characters (description).