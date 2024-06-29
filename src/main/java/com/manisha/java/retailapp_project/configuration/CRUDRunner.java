package com.manisha.java.retailapp_project.configuration;

import com.manisha.java.retailapp_project.entity.Product;
import com.manisha.java.retailapp_project.repository.CustomerRepository;
import com.manisha.java.retailapp_project.repository.OrderDetailsRepository;
import com.manisha.java.retailapp_project.repository.OrderRepository;
import com.manisha.java.retailapp_project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Order(2)
public class CRUDRunner implements CommandLineRunner {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    OrderDetailsRepository orderDetailsRepository;
    @Autowired ProductRepository productRepository;
    @Override
    public void run(String... args) throws Exception
    {
        Product p = null;

        // 1 findAll
        List<Product> findAll_result= productRepository.findAll();
        findAll_result
                .stream()
                .forEach(System.out::println);

        // 2 findById
        Optional<Product> findById_result =productRepository.findById(1L);
        p = findById_result.get();
        System.out.println("\nfindById_result : "+p);

        // 3. findByName
        // HQL : select p from Product p where p.name = :namee
        p = productRepository.findByProductName( "Product 2")
                .stream()
                .findFirst().get();
        System.out.println("\nfindByName_result : "+p);

    }
}
