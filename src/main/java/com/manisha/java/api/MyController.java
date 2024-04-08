package com.manisha.java.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MyController {

    @GetMapping("hello")
    String[] helloworld(){
        return new String[]{" Lekhraj", "Manisha", "Arush"};
    }
}
