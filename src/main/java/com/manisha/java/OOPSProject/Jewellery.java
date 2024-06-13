package com.manisha.java.OOPSProject;

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
    Category catgery;

    public Jewellery(){}

    public Jewellery(String productName, int productCode, double price, Category catgery)
    {
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
        this.catgery = catgery;
    }
}
