package com.manisha.java.webapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MyController {

    @PostMapping("family/getdetails")
    String[] helloworld(String abc, String xyz){
        return new String[]{"Lekhraj", "Manisha", "Arush"};
    }

    @PutMapping("family/getdetails-2")
    String[] helloWorld2(){
        MyFunctionalInterface implementation1 = new ImplementerClass(); //old

        //new
        MyFunctionalInterface implementation2 = ()->System.out.print("implementation2");
        MyFunctionalInterface implementation3 = ()->System.out.print("implementation3");
        MyFunctionalInterface implementation4 = ()->System.out.print("implementation4");

        return new String[]{"Lekhraj", "Manisha"};
    }
}

@FunctionalInterface
interface MyFunctionalInterface{
    public void doSomething(); // abstract
}


class ImplementerClass implements MyFunctionalInterface{
    public void doSomething(){ // implementation
        System.out.print("ImplementerClass :: doSomething()... hello world");
    }
}

// Lambda expression : these are implementation of Function interface.



