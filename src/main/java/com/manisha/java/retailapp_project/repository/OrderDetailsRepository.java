package com.manisha.java.retailapp_project.repository;

import com.manisha.java.retailapp_project.entity.Order;
import com.manisha.java.retailapp_project.entity.OrderDetails;
import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Long>
{
    // session start
    // txn start
    @Query("select od from OrderDetails od, Order o " +
            "where o.id = od.order.id " +
            "and od.price = :price ")
    List<OrderDetails> findByPrice(double price);                         //OrderDetails
    // txn.commit
    //session.close

    @Query("select o from OrderDetails od, Order o " +
            "where o.id = od.order.id " +
            "and od.price = :price ")
    List<Order> findOrderByPrice(double price);                            //Order

    @Query("select o.id from OrderDetails od, Order o " +
            "where o.id = od.order.id " +
            "and od.price = :price ")
    List<Long> findOrderIdByPrice(double price);                            //Long

    @Query("select o.id, o.customer.id " +
            "from OrderDetails od, Order o " +
            "where o.id = od.order.id " +
            "and od.price = :price ")
    List<Tuple> findOrderIdAndCustomerIdByPrice(double price);               //Tuple

}

/*
1. flexible JQL with joins
2. jpql return -- sync -- method return
3. <Tuple> -- Heterogeneous Array

 */
