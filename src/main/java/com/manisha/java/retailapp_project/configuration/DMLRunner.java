package com.manisha.java.retailapp_project.configuration;

import com.manisha.java.retailapp_project.entity.Customer;
import com.manisha.java.retailapp_project.entity.Order;
import com.manisha.java.retailapp_project.entity.OrderDetails;
import com.manisha.java.retailapp_project.entity.Product;
import com.manisha.java.retailapp_project.repository.CustomerRepository;
import com.manisha.java.retailapp_project.repository.OrderDetailsRepository;
import com.manisha.java.retailapp_project.repository.OrderRepository;
import com.manisha.java.retailapp_project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

//@Component
@org.springframework.core.annotation.Order(1)
public class DMLRunner implements CommandLineRunner
{
    @Autowired
    CustomerRepository customerRepository; // = new CustomerRepositoryImpl(); @Autowired
    @Autowired OrderRepository orderRepository;
    @Autowired OrderDetailsRepository orderDetailsRepository;
    @Autowired ProductRepository productRepository;

    //
    @Override
    public void run(String... args) throws Exception
    {
        System.out.println( " ===== DMLRunner ====");

        Customer customer = new Customer();
        customer.setName("John Doe");

        Product product1 = new Product();
        product1.setName("Product 1");
        product1.setPrice(10.0);

        Product product2 = new Product();
        product2.setName("Product 2");
        product2.setPrice(20.0);

        productRepository.save(product1);
        productRepository.save(product2);

        Order order = new Order();
        order.setOrderDate("2024-06-28");
        order.setCustomer(customer);

        OrderDetails orderDetails1 = new OrderDetails();
        orderDetails1.setQuantity(2);
        orderDetails1.setPrice(10.0);
        orderDetails1.setOrder(order);

        OrderDetails orderDetails2 = new OrderDetails();
        orderDetails2.setQuantity(1);
        orderDetails2.setPrice(20.0);
        orderDetails2.setOrder(order);

        Set<OrderDetails> orderDetailsSet = new HashSet<>();
        orderDetailsSet.add(orderDetails1);
        orderDetailsSet.add(orderDetails2);
        order.setOrderDetails(orderDetailsSet);

        Set<Product> products = new HashSet<>();
        products.add(product1);
        products.add(product2);
        order.setProducts(products);

        customer.setOrders(Set.of(order));

        customerRepository.save(customer);
    }

    @Bean
    CustomerRepository myrepo(){
        return null;
    }
}
