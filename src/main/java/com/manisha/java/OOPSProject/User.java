package com.manisha.java.OOPSProject;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

//@Entity
//@Table(name = "APP_USER")
public class User
{
    //@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    protected String userName;
    protected String emailID;
    protected String phoneNumber;

    @Transient
    protected Cart cart;

    public User(String userNam, String emailID, String phoneNumber) {
        userName = userNam;
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
