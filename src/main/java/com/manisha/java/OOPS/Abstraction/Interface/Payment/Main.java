package com.manisha.java.OOPS.Abstraction.Interface.Payment;

public class Main {
    public static void main(String[] args) {
        Payment p1 = new CreditPayment() ;
        p1.processPayment(100.0);

        Payment p2 = new PayPalPayment();
        p2.processPayment(200.0);
    }
}
