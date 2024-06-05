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
    String[] helloworld2(){
        MyFunctionalInterafce implementation1 = new ImplemteterClass(); //old

        //new
        MyFunctionalInterafce implementation2 = ()->System.out.print("xxxxxx");
        MyFunctionalInterafce implementation3 = ()->System.out.print("xxxxfhgfhgfgfxx");
        MyFunctionalInterafce implementation4 = ()->System.out.print("xxxxfhgfhgfdvfdvfdvdsfgfxx");

        return new String[]{"Lekhraj", "Manisha"};
    }
}

@FunctionalInterface
interface MyFunctionalInterafce{
    public void doSomething(); // abstract
}

class ImplemteterClass implements MyFunctionalInterafce{
    public void doSomething(){ // implemtation
        System.out.print("ImplemteterClass :: doSomething()... hellow world");
    }
}

// Lambda expression : these are implementation of Function interface.



