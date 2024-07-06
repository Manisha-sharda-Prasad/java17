package com.manisha.java.retailapp_project.SpringCore.Component;

import org.springframework.stereotype.Component;

@Component                                       //@Component - Bean Created
public class  MyComponent{
    public String getComponentName(){
        return "MyComponent";
    }
}
