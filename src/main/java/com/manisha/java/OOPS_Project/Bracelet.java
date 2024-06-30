package com.manisha.java.OOPS_Project;

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
