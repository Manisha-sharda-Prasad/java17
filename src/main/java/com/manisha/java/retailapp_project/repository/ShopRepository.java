package com.manisha.java.retailapp_project.repository;
import com.manisha.java.retailapp_project.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer> {
    List<Shop> findByName(String name);

    //public findAll()
}
