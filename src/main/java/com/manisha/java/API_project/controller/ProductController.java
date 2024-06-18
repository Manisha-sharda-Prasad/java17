package com.manisha.java.API_project.controller;

import com.manisha.java.API_project.entity.Product;
import com.manisha.java.API_project.repository.ProductRepository;
import com.manisha.java.API_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
//@RequestMapping("product")
// Servlet - http request / http response-body-json
public class ProductController
{
    @Autowired ProductService productSrv;
    @Autowired ProductRepository productRepo;

    // postman call - get-All-product --> httpRequest --> selectAll() call

    @GetMapping("get-All-product")
    List<Product> selectAll()
    {
        List<Product> result = productSrv.findAll();
        List<Product> result2 = productRepo.loadAllProducts();
        for (Product p : result) {System.out.println(p);}
        return result; // to --> JSON
        // result(java object) --> [ @ResponseBody --> json ] --> httpReponse/internet --> postman/client
    }

    @GetMapping("get-All-product-sorted")
    List<Product> selectAllSorted()
    {
        List<Product> result = selectAll();
        Comparator<Product> c = (p1,p2) -> p1.getProductName().compareTo(p2.getProductName());
        result.sort(c);
        return result; // to --> JSON
    }

    @GetMapping("find-product-by/{id}")
    Product getById(@PathVariable("id") int id){
        return productSrv.findById(id);
    }

    @PostMapping("/add-product")
    void AddNewproduct(@RequestBody Product p){
        productSrv.addNewProduct(p);
    }

    @GetMapping("get-All-Product-Names")
    List<String> getAllProductNames(){
        List<Product> products =  selectAll();
        List<String> result = new ArrayList<>();
        for (Product p : products){
            String name= p.getProductName();
            result.add(name);
        }
        return result; // -->json
    }
}
// problem-1 : [ "Laptop","Iphone-15","samsung-note-20-ultra","Asus-15","Motorolla-Z" ]
// problem-2 : Sorted products
