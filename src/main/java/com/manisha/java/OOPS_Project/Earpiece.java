package com.manisha.java.OOPS_Project;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Earpiece extends Jewellery {
    public Earpiece(String productName, int productCode, double price) {
        super( productName,  productCode,  price);
    }
}
