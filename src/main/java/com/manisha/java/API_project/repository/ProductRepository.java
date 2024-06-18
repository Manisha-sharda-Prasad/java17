package com.manisha.java.API_project.repository;

import com.manisha.java.API_project.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends ListCrudRepository<Product,Integer> {
    // 3 abstract method inherit from ListCrudRepository
    // body of all 3 method - SB will add at runtime

    Product findByProductId(int productId); //special Namimg convention - then SB will add query

    @Query(" select p from Product p where p.productId = :productId") // HQL
    Product findSingleProduct(int productId);

    @Query("select p from Product p")
    List<Product> loadAllproducts();
}

// JDBC - full code
// Hibernate - NO TABLE , use ENTITY + code : CRUD, commit, etc
// SpringBoot - Do nothing , not even CRUD