package com.manisha.java.retailapp_project.service.impl;

import com.manisha.java.retailapp_project.entity.Customer;
import com.manisha.java.retailapp_project.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl {
    @Autowired
    CustomerRepository customerRepository;

    public Customer saveData(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomerData(){
        return customerRepository.findAll();
    }

    public Customer findCustomerById(){
        return customerRepository.findById();
    }

}
