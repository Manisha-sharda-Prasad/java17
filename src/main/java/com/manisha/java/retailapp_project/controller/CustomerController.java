package com.manisha.java.retailapp_project.controller;

import com.manisha.java.retailapp_project.service.impl.CustomerServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerServiceImpl customerService;
}
