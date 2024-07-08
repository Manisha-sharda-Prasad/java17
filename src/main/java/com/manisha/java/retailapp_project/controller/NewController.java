package com.manisha.java.retailapp_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                                                //marks the class as a controller,method returns in -JSON format. //HTTP methods-> handler methods.
public class NewController {

    @GetMapping("url1")
    String m1(){
        return " hello World" ;
    }

}



