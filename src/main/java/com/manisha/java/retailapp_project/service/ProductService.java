package com.manisha.java.retailapp_project.service;

import com.manisha.java.retailapp_project.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> findAll();
    Product findById(int id);

    void addNewProduct(Product p);
}
