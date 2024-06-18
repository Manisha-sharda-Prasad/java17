package com.manisha.java.API_project.service;

import com.manisha.java.API_project.entity.Product;
import com.manisha.java.API_project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepo;
    @Override
    public List<Product> findAll() {
        // business code
        // calculation
        // report - need data
         List<Product> result = productRepo.loadAllproducts();
         return result;
    }

    @Override
    public Product findById(int id) {
        return productRepo.findSingleProduct(id);
    }

    @Override
    public void addNewProduct(Product p) {
       productRepo.save(p) ;
    }
}
