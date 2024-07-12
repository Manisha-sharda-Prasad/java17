package com.manisha.java.retailapp_project.controller;

import com.manisha.java.retailapp_project.entity.Shop;
import com.manisha.java.retailapp_project.service.impl.ShopServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("shop")
public class ShopController
{
    @Autowired
    ShopServiceImpl shopService;

    @PostMapping("save")
    ResponseEntity <String> saveShopData(@RequestBody Shop shop)
    {
        log.info("Shop to save :: " + shop);

        shopService.addShop(shop);

        return new ResponseEntity<String>("saved Shop Data " , HttpStatus.ACCEPTED) ;    //Returning R.E.(set Header, StatusCode, Body)
    }

    @GetMapping("/getall")
    List<Shop> findShopDetails(){
        return shopService.getAllShop();                                                       //Returning Obj (sets Automatically)
    }

    @GetMapping("/getByName")
    List<Shop> findShopDetails2(@RequestHeader("name") String name, @RequestParam("name") String name2){
        return shopService.getShopByName(name2);
    }

    @GetMapping("/getById")
    Shop findShopDetails3(@RequestHeader("id") Integer id){
        return shopService.getShopByID(id).orElse(new Shop());                         // inside optional .get/ .orElse(new Shop()- handle null exception (create new)
    }

    @PostMapping("/update")
    String findShopDetails4(@RequestBody Shop shop){
        return shopService.updateShop(shop);                        // inside optional .get/ .orElse(new Shop()- handle null exception (create new)
    }

    @DeleteMapping("/delete")
    String findShopDetails5(@RequestParam Integer id){
        return shopService.deleteShop(id);
    }
}
