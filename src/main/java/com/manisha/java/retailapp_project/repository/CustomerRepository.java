package com.manisha.java.retailapp_project.repository;

import com.manisha.java.retailapp_project.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findById();
    // inherit 12 abstract methods
}
