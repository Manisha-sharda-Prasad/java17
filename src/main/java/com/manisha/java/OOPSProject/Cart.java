package com.manisha.java.OOPSProject;
public class Cart {

    protected String items;
    protected String totalItems;
    protected String paymentMethod;

    public Cart(String items, String totalItems, String paymentMethod) {
        this.items = items;
        this.totalItems = totalItems;
        this.paymentMethod = paymentMethod;
    }

    public void addItems(){}
    public void removeItems(){}
    public void addCoupons(){}

}
