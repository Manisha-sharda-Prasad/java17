package com.manisha.java.retailapp_project.repository;

import com.manisha.java.retailapp_project.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    @Query("select o from Order o where o.orderDate = :orderDates")
    List<Order> findOrderDate(String orderDates);
}
