package com.manisha.java.OOPSProject;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class Bracelet extends Jewellery{
    public Bracelet(String productName, int productCode, double price) {
        super( productName,  productCode,  price);
    }
}
