package com.manisha.java.OOPS.Abstraction.Interface.Furniture;

import com.manisha.java.util.Print;

public class WoodBed implements Bed {
    @Override
    public void rawMaterials() {
        Print.print("Raw materials ordered for Wooden bed");
    }
    @Override
    public void price() {
        Print.print("Price of labor cost, raw materials needs to be calculated.");
    }
    @Override
    public void weight() {
        Print.print("Wooden Bed Weight should not extend more than 250 pounds");
    }
    @Override
    public void size() {
        Print.print("\n" +
                "Size\tKing\n" +
                "Product Dimensions\t79.5\"L x 75.5\"W x 12\"H");
    }

    public static void main(String[] args) {
        WoodBed woodBed = new WoodBed();
        woodBed.rawMaterials();
        woodBed.price();
        woodBed.weight();
        woodBed.size();
    }
}
