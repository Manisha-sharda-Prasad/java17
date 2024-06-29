package com.manisha.java.retailapp_project.repository;

import com.manisha.java.retailapp_project.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Long> {
}
