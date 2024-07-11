package com.manisha.java.retailapp_project.service.impl;
import com.manisha.java.retailapp_project.entity.Shop;
import com.manisha.java.retailapp_project.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ShopServiceImpl {
    @Autowired
    ShopRepository shopRepository;

    @Transactional
    public Shop addShop(Shop shop) {
        return shopRepository.save(shop); //db call-1
        // db-2 : repo2.
        // db-3 : repo2.
        //commit
        // java   PC * * *    DB
    }

   public List<Shop> getAllShop(){
       return shopRepository.findAll();
    }

    public List<Shop> getShopByName(String name){
        return shopRepository.findByName(name);
    }
    public Optional<Shop> getShopByID(Integer id){
        return shopRepository.findById(id);
    }

    @Transactional
    public String updateShop(Shop shopNew)
    {
        // 1. fetch Entity from DB
        Shop shopCurrent =  shopRepository.findById(shopNew.getId()).get();

        // 2. update entity
        shopCurrent.setAddress(shopNew.getAddress());
        shopCurrent.setCity(shopNew.getCity());
        shopCurrent.setName(shopNew.getName());
        shopCurrent.setCountry(shopNew.getCountry());
        shopCurrent.setPostalCode(shopNew.getPostalCode());

        // 3. persist entity
        shopRepository.save(shopCurrent);

        return "updated";
    }

    public String deleteShop(Integer id) {
        shopRepository.deleteById(id);
        return "shop deleted, having id : "+id;
    }

    // deleteAllShop(){}
    // deleteAllById(){}
}
