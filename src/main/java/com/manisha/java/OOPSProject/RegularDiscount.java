package com.manisha.java.OOPSProject;

import java.util.Scanner;

public class RegularDiscount implements Discount{
    @Override
    public void apply() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original price: ");

        double productPrice = scanner.nextDouble();
        double finalPrice;

        if (productPrice >= 50){
            finalPrice = productPrice * 0.75; //25%
        }else{
            finalPrice = productPrice * 0.00; //00%
        }
        System.out.printf("The final price after discount is: $%.2f%n", finalPrice);

    }
}
