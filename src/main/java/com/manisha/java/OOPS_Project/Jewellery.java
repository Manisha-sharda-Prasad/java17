package com.manisha.java.OOPS_Project;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Jewellery
{
    String productName;
    int productCode;
    double price;
    Category category;

    public Jewellery(){}

    public Jewellery(String productName, int productCode, double price, Category catgery)
    {
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
        this.category = catgery;
    }

    public Jewellery(String productName, int productCode, double price)
    {
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }
}
