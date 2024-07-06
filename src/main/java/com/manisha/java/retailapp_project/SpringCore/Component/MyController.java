package com.manisha.java.retailapp_project.SpringCore.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private MyService myService;                              //DI
    @GetMapping("/data")                                    //for @RequestMapping,specific HTTP methods (GET,POST,PUT,DELETE,PATCH)
    public String getData(){
        return myService.processData();                     //calling method of 'MyService' class
    }
}
