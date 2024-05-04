package com.manisha.java.oops.inheritance;

public class AccountMain {
    public static void main(String[]args){

    Account maniAccount = new Account();
    maniAccount.setAccountNum("345678");
    maniAccount.setCustomerName("Manisha Prasad");
    maniAccount.setPhoneNumber("9174659937");
    maniAccount.setCustomerEmail("maniprasad@gmail.com");
    maniAccount.setAccountBalance(2000);

    maniAccount.withdrawingFunds(100.0);
    maniAccount.depositFunds(500.0);
    maniAccount.withdrawingFunds(100.0);

    }
}
