package com.manisha.java.retailapp_project.repository;

import com.manisha.java.retailapp_project.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Long> {
    @Query("select p2 from OrderDetails p2 where p2.price = :price")
    List<OrderDetails> findByPrice(double price);
}
