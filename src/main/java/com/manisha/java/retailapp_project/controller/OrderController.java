package com.manisha.java.retailapp_project.controller;

import com.manisha.java.retailapp_project.entity.Order;
import com.manisha.java.retailapp_project.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    OrderRepository orderRepository;
    @PostMapping("save")
    ResponseEntity<String> saveOrderData(@RequestBody Order order){

        log.info("Order details : " + " " + order.getId() + " " +order.getOrderDate());
        //orderRepository.save(order);
        return new ResponseEntity <String>("saved order data " , HttpStatus.ACCEPTED);
    }
}
