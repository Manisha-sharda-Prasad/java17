package com.manisha.java.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("hello")
    String helloworld(){
        return " hello world";
    }
}
