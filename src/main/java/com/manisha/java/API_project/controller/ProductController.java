package com.manisha.java.API_project.controller;

import com.manisha.java.API_project.entity.Product;
import com.manisha.java.API_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// Servlet - http resq / hhtp reponse-body-json
public class ProductController
{
    @Autowired
    ProductService productSrv;
    @GetMapping("get-All-product")
    List<Product> selectAll(){
        List<Product> result = productSrv.findAll();
        for (Product p : result) {
            System.out.println(p);
        }
        return result;
    }

    @GetMapping("find-product-by/{id}")
    Product getbyId(@PathVariable("id") int id){
        return productSrv.findById(id);
    }

    @PostMapping("/add-product")
    //@ResponseBody
    void AddNewproduct(@RequestBody Product p){
        productSrv.addNewProduct(p);
    }
}
