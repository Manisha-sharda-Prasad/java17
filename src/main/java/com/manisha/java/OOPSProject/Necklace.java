package com.manisha.java.OOPSProject;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class Necklace extends Jewellery{
    public Necklace(String productName, int productCode, double price) {
        //super();
      super( productName,  productCode,  price);
    }
}
