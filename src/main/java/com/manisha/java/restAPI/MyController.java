package com.manisha.java.restAPI;

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
        return new String[]{"Lekhraj", "Manisha"};
    }
}
