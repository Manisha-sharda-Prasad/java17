package com.manisha.java.OOPS_Project;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class Necklace extends Jewellery{
    public Necklace(String productName, int productCode, double price, Category catgery) {
        //super();
      super( productName,  productCode,  price, catgery);
    }
}
