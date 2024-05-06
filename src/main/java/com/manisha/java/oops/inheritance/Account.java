package com.manisha.java.oops.inheritance;

import com.manisha.java.util.Print;

public class Account {
    //Properties------------------
    private String accountNum ;
    private double accountBalance ;
    private String customerName ;
    private String customerEmail;
    private String phone;
    //also with Constructors------------
    public  Account(){
        Print.print("Empty constructor called!!");
    }
    public Account(String number, double balance, String customerName, String email, String phone){
        Print.print("Account constructor with parameters called");
        accountNum = number;
        accountBalance = balance;// not using this -- different name than parameters.
        this.customerName = customerName; //same var name -- as properties-- use this.
        customerEmail = email;
        this.phone = phone;

    }



    //Methods--------------------------
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
        Print.print("Your deposit is = $" + deposit + ". Your current balance is now = $" + accountBalance);
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
