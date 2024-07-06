package com.manisha.java.retailapp_project.SpringCore.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private MyService myService;                              //DI



}
