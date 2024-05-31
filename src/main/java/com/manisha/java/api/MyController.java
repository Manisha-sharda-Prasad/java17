package com.manisha.java.api;

import com.manisha.java.Fundamental.exercise.ifElse.Excercise_Runner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MyController {

    @GetMapping("family")
    String[] helloworld(){
        return new String[]{"Lekhraj", "Manisha", "Arush"};
    }

    @GetMapping("call-excercise")
    void callMyExercise(){
        Excercise_Runner.main(new String[]{});
    }
}
