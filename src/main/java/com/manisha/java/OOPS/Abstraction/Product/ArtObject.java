package com.manisha.java.OOPS.Abstraction.Product;

import com.manisha.java.util.Print;

public class ArtObject extends ProductsForSale{
    public ArtObject(String type, int price, String description) {
        super(type, price, description);
    }
    @Override
    public void showDetails() {
        Print.print("This " + type + " is a beautiful reproduction");
        Print.print("The price of the piece : $" + price);
        Print.print(description);
    }
}
