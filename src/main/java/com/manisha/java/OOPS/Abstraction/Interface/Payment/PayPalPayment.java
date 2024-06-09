package com.manisha.java.OOPS.Abstraction.Interface.Payment;
//2.1. Implementing the Interface---
public class PayPalPayment implements Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing paypal payment of $" + amount);
    }
}
