package com.manisha.java.retailapp_project.repository;

/*@Repository
public interface ProductRepository extends ListCrudRepository<Product,Integer> {
    // 3 abstract method inherit from ListCrudRepository
    // body of all 3 method - SB will add at runtime

    Product findByProductId(int productId); //special Naming convention - then SB will add query

    @Query(" select p from Product p where p.productId = :productId") // HQL
    Product findSingleProduct(int productId);

    @Query("select p from Product p")  // HQL --> SQL --> run
    List<Product> loadAllProducts();
}*/

// JDBC - full code
// Hibernate - NO TABLE , use ENTITY + code : CRUD, commit, etc
// SpringBoot - Do nothing , not even CRUD