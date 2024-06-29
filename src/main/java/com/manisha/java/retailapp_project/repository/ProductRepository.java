package com.manisha.java.retailapp_project.repository;

import com.manisha.java.retailapp_project.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>
{
    // 12 abstract method added by SB, since we ectended JpaRepository

    @Query("select p from Product p where p.name = :namee")
    List<Product> findByProductName(String namee);
}
