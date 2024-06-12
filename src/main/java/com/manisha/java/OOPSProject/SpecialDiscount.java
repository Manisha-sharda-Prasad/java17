package com.manisha.java.OOPSProject;

import java.util.Scanner;

public class SpecialDiscount implements Discount{
    @Override
    public void apply() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original price: ");

        double productPrice = scanner.nextDouble();
        double finalPrice;

        if (productPrice >= 100){
            finalPrice = productPrice * 0.50; //50%
        }else{
            finalPrice = productPrice * 0.75; //25%
        }
        System.out.printf("The final price after discount is: $%.2f%n", finalPrice);

    }
}
