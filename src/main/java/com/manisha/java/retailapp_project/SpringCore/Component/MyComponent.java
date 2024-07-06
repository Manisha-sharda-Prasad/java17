package com.manisha.java.retailapp_project.SpringCore.Component;

import org.springframework.stereotype.Component;

@Component("myComponent-1")                                       //@Component - Bean Created with name : myComponent
public class  MyComponent{
    public String getComponentName(){
        return "MyComponent";
    }
}
