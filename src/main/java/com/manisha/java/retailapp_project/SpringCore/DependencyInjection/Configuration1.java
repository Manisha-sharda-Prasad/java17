package com.manisha.java.retailapp_project.SpringCore.DependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Configuration1 {

    @Bean("myBeanB_1")
    Bean_B myBeanB_1(){
        return new Bean_B();
    }
    @Bean("myBeanA_1")
    @Primary                       //or @Qualifier use in Runner
    Bean_A myBeanA_1( Bean_B b){
         Bean_A temp = new Bean_A();
         temp.setDependency1(b); // Manual : setter Injection
         return temp;
    }

    // =======
    @Bean("myBeanA_2")
    Bean_A myBeanA_2(Bean_B b){
        return new Bean_A(b); // Manual : Constructor Injection
    }
}



