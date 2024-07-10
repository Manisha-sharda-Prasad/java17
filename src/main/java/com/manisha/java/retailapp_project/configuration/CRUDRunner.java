package com.manisha.java.retailapp_project.configuration;

import com.manisha.java.retailapp_project.entity.Order;
import com.manisha.java.retailapp_project.entity.OrderDetails;
import com.manisha.java.retailapp_project.entity.Product;
import com.manisha.java.retailapp_project.entity.Shop;
import com.manisha.java.retailapp_project.repository.*;
import jakarta.persistence.Tuple;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Component
@org.springframework.core.annotation.Order(2)
public class CRUDRunner implements CommandLineRunner {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    OrderDetailsRepository orderDetailsRepository;
    @Autowired ProductRepository productRepository;
    @Autowired ShopRepository shopRepository;

    @Override
    public void run(String... args) throws Exception
    {
        Product p = null;
        Order o = null;
        OrderDetails p2 = null;
        Shop s2 = null;

        // 1 findAll
        List<Product> findAll_result= productRepository.findAll();
        findAll_result
                .stream()
                .forEach(System.out::println);

        // 2. findById
        Optional<Product> findById_result = productRepository.findById(1L);
        p = findById_result.get();
        log.info("\nfindById_result : "+p);

        // 3. findByName
        // first step: (HQL : select p from Product p where p.name = : productName)
        // second step:
        p = productRepository.findByProductName( "Product 2")
                .stream()
                .findFirst().get();
        log.info("\nfindByName_result : "+p);

        // 4. findAll
        System.out.println("\norderRepository findAll: ");
        List<Order> fI = orderRepository.findAll();
        fI.stream()
                .forEach(i -> log.info(i.toString()));

        // 5. findOrderDate
        // first step: (HQL : select o from Order o where o.order_date = :orderDates)
        // second step:
        o = orderRepository.findOrderDate("2024-06-28")
                .stream()
                .findAny().orElseGet( ()->null);
        log.info("\norderRepository findOrderDate: " +o);


        // 6.
        // first step: (select p2 from OrderDetails where p2.price = :price)
        // second step:
        p2 = orderDetailsRepository.findByPrice(20.0)
               .stream().findFirst().orElseGet(()->null);
        log.info("\norderDetailRepository findByPrice: " +p2);

        //7.
        List<Tuple> result_tuple = orderDetailsRepository.findOrderIdAndCustomerIdByPrice(20.0)
                .stream().collect(Collectors.toList());
                //.findFirst()                                                   //using List of <Tuple> //findFirst not possible
                //.orElseGet(()
        log.info("\norderDetailRepository findOrderIdAndCustomerIdByPrice: tuple " +result_tuple);
    }
}
