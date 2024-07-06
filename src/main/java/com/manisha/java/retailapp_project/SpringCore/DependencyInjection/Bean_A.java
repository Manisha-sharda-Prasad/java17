package com.manisha.java.retailapp_project.SpringCore.DependencyInjection;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bean_A {

    Bean_B dependency1;

    String greet(){
        return "hello I 'am Bean_A instance : "+this;
    }
}
