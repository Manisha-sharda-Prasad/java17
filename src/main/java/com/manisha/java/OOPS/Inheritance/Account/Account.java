package com.manisha.java.OOPS.Inheritance.Account;

import com.manisha.java.util.Print;
import lombok.ToString;

@ToString
public class Account {
    //Properties------------------
    private String accountNum ;
    private double accountBalance ;
    private String customerName ;
    private String customerEmail;
    private String phone;

    public Account(){
        //Print.print("Empty constructor-1 called!!");
    }
    // const - name, no return type, body - good practice : ONLY initialize member property
    // overload
    // called only once and define default value
    // Constructor Chaining - this(), this(**) method----

    public Account(String number, double balance, String customerName, String email, String phone){
        this(); //Account()
        //this("123456789", 0,"customerName");
        //super(); //Parent()
        Print.print("Account constructor-2 with 5 parameters called");
        customerEmail = email;
        this.phone = phone;
        accountNum = number;
        accountBalance = balance;// not using this -- different name than parameters.
        this.customerName = customerName; //same var name -- as properties-- use this.
    }

    public Account(String number, double balance, String customerName){
        Print.print("Account constructor-3 with 3 parameters called");
        accountNum = number;
        accountBalance = balance;// not using this -- different name than parameters.
        this.customerName = customerName; //same var name -- as properties-- use this.
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
