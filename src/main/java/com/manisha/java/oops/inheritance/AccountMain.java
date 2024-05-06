package com.manisha.java.oops.inheritance;

import com.manisha.java.util.Print;

public class AccountMain {
    public static void main(String[]args){

    //Account maniAccount = new Account();

    Account maniAccount = new Account("345678", 2000, "Manisha Prasad", "maniprasad@gmail.com","9174659937");

//    maniAccount.setAccountNum("345678");
//    maniAccount.setCustomerName("Manisha Prasad");
//    maniAccount.setPhone("9174659937");
//    maniAccount.setCustomerEmail("maniprasad@gmail.com");
//    maniAccount.setAccountBalance(2000);
    Print.print(maniAccount.getCustomerName());
    Print.print(maniAccount.getAccountNum());
    Print.print(maniAccount.getAccountBalance());

    maniAccount.withdrawingFunds(100.0);
    maniAccount.depositFunds(500.0);
    maniAccount.withdrawingFunds(100.0);

    }
}
