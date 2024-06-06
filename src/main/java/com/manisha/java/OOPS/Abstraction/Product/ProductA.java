package com.manisha.java.OOPS.Abstraction.Product;

public class ProductA extends ProductsForSale{
    public ProductA(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    protected void showDetails() {

    }
}
