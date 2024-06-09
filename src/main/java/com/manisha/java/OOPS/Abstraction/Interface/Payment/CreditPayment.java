package com.manisha.java.OOPS.Abstraction.Interface.Payment;
//2.2. Implementing the Interface---
public class CreditPayment implements Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
