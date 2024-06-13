package com.manisha.java.OOPSProject;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    protected String userName;
    protected String emailID;
    protected String phoneNumber;
    protected Cart cart;

    public User(String userName, String emailID, String phoneNumber) {
        this.userName = userName;
        this.emailID = emailID;
        this.phoneNumber = phoneNumber;
    }

    public User(String userName, String emailID, String phoneNumber, Cart cart) {
        this.userName = userName;
        this.emailID = emailID;
        this.phoneNumber = phoneNumber;
        this.cart = cart;
    }
}
