package com.manisha.java.retailapp_project.SpringCore.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired(required = true)
    @Qualifier("myBeanA_2")                       //Priority -@Qualifier*** /not @Primary "myBeanA_1"
    Bean_A dependency1; // = null
    @Override
    public void run(String... args) throws Exception {
        System.out.println(dependency1.greet()); // null.greet()
    }
}
