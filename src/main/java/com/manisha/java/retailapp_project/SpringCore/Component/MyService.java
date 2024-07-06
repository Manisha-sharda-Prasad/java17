package com.manisha.java.retailapp_project.SpringCore.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Autowired                                                //Dependency Inject-of Class- 'MyRepository'
    private MyRepository myRepository;

    public String processData(){
        return myRepository.getData();
    }
}
