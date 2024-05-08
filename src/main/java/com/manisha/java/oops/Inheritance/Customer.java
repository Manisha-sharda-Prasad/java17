package com.manisha.java.oops.Inheritance;

import com.manisha.java.util.Print;
import lombok.ToString;

@ToString
public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    //Getter------------------->
    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }

    //Constructors----------------->
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //--------------------------Main-------------------------->
    public static void main(String[]args){
        Customer customer = new Customer("Manisha", 1000, "Manu@gmail.com");
        Customer customer2 = new Customer("Lekhraj","lekhraj@gmail.com");

        Print.print(customer.getCreditLimit());
        Print.print(customer.getName());
        Print.print(customer.getEmail());

        Print.print(customer2.getEmail());
        Print.print(customer2.getName());

    }
}
