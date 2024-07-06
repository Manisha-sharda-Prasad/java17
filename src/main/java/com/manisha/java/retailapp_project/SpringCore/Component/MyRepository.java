package com.manisha.java.retailapp_project.SpringCore.Component;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public String getData(){
        return "Data From Repository";
    }
}
