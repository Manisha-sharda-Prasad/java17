package com.manisha.java.retailapp_project.controller;

import com.manisha.java.retailapp_project.entity.Product;
import com.manisha.java.retailapp_project.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("product")
public class ProductController
{
    @Autowired
    ProductRepository productRepository;
    @Value("${save.order.flag}")
    String flag;                           //application properties - flag
    @Autowired
    Environment env;                       //application properties - flag

    @GetMapping("productApi1/{urlData1}/{urlData2}")
    ResponseEntity <String[]>  productApi1(
           //get from header -
          @RequestHeader("header1") String product1,
          @RequestHeader("header2") String product2,
          //url -
          @RequestParam("param1")  String p1,
          @RequestParam("param2") String p2,
          //dynamic url -
          @PathVariable("urlData1") String u1,
          @PathVariable("urlData2") String u2
    )
    {
        log.info("-----------Product_Api_1------------");
        log.info("RequestHeader, header1: " + product1 + "header2: " + product2);
        log.info("RequestParam, param1: " + p1 + "param1: " + p2);
        log.info("PathVariable, urlData1: " + u1  + "urlData1: " + u2);

        String[] responseBody = new String[] {"Product1, Product2, Product3, Product4, Product5,"};

        HttpHeaders headers = new HttpHeaders();
        headers.add("Header1", "H1");
        headers.add("Header2", "H2");

        return new ResponseEntity<String[]>(responseBody, headers, HttpStatus.OK);
    }
    @PostMapping("save")
    ResponseEntity <String> saveProductData(@RequestBody Product product)
    {
        log.info("Product details : " + product.getId() + product.getPrice() + product.getName());

        String flag2 = env.getProperty("save.order.flag");

        if(flag.equalsIgnoreCase("YES")){
            productRepository.save(product);
        }
        return new ResponseEntity<String>("saved", HttpStatus.OK);
    }
}
