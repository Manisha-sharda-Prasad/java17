package com.manisha.java.oops.inheritance;

import com.manisha.java.util.Print;

public class Account {
    //Properties------------------
    private String accountNum ;
    private double accountBalance ;
    private String customerName ;
    private String customerEmail;
    private String phoneNumber ;

    //Methods----------------------
    public void withdrawingFunds(double withdraw){
        if((accountBalance - withdraw) <= 0){
            Print.print("You cannot withdraw funds!! You have = $" + accountBalance);
        }
        else{
            accountBalance = accountBalance - withdraw;
            Print.print("Withdrawal of = $" + withdraw + " processed!, remaining balance is = $" + accountBalance);
        }
    };
    public void depositFunds(Double deposit){

        accountBalance = accountBalance + deposit;
        Print.print("Your deposit is = $" + deposit + "and your current balance is now = $" + accountBalance);
    };



    //auto generated getter-setter---------
    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
