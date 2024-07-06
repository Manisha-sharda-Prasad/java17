package com.manisha.java.retailapp_project.SpringCore.Component;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@SpringBootApplication                               //or @Configuration, @ComponentScan, @EnableAutoConfiguration
public class MyConfiguration {
  @Bean("myComponent-2")                               //Registered Bean/new-instance created of 'MyComponent' class.
  public MyComponent myComponent2(){
      return new MyComponent();
  }

  @ConditionalOnProperty(value = "my.prop.enable.comp-3", havingValue = "yes")     //if value= "" present
  @Bean("myComponent-3")                               //Registered Bean/new-instance created of 'MyComponent' class.
    public MyComponent myComponent3(){
        return new MyComponent();
    }


}
//@Configuration + @Configuration
//2 beans created of - MyComponent By using @@Bean ("myComponent-2") & @Component("myComponent-1").