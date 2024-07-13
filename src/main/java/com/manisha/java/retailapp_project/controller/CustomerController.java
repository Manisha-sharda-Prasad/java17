package com.manisha.java.retailapp_project.controller;

import com.manisha.java.retailapp_project.entity.Customer;
import com.manisha.java.retailapp_project.service.impl.CustomerServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerServiceImpl customerService;
    @PostMapping("save")
    ResponseEntity <String> saveCustomerDetails(@RequestBody Customer customer)
    {

        log.info("Customer data : " + customer);
        customerService.saveData(customer);
        return new ResponseEntity <String> ("saved" , HttpStatus.ACCEPTED);
    }
    @GetMapping("/data")
    List <Customer> findAllDetails(){
        return customerService.getAllCustomerData();
    }

    @GetMapping("/getId")
     Customer findById(@RequestHeader ("id")Integer id){
        return customerService.findCustomerById();
    }

}
