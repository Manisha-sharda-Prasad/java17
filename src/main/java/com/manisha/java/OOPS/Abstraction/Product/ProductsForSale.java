package com.manisha.java.OOPS.Abstraction.Product;

abstract public class ProductsForSale {
    private String type;
    private double price;
    private String description;

    public ProductsForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public static double getSalesPrice(int quantity ){
        double salesPrice = 0;
        return quantity * salesPrice;
    }
    public static void printPricedItem(int quantity ){
    }
    protected abstract void showDetails();
}
