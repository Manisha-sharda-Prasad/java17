package com.manisha.java.retailapp_project.service.impl;

import com.manisha.java.retailapp_project.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl {
    @Autowired
    CustomerRepository customerRepository;
}
