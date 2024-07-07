package com.manisha.java.retailapp_project.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

// Req - url mapping >> k:v data fetch >> ...
// resp - data prepare >> object >> json >> send  >>  httpResponse::body 200(OK)
@RestController
@RequestMapping("demo")
@Slf4j
public class DemoController
{
    // Request :: url(demo/api1) + empty body + empty header
    @GetMapping("api1/{data1}/{data2}")
    String[] api1(
            @RequestParam("name") String k1,
            @PathVariable("data1") String data1,
            @PathVariable("data2")String data2,
            @RequestHeader ("h1") String h1
    )
    {
        // Part-A || developer
        System.out.println("===== api-1 is called ====");
        log.info("request param - name:{} ", k1);
        log.info("Path Variable  - data1:{}, data2:{} ", data1, data2);
        log.info("Header Variable  - h1:{}", h1);

        return new String[] {"item-1", "item-2", "item-3", "item-4"};

        // Part-B || SB-starter-web
        // 1. jackson :: Java object ---> CONVERT ---> myJSON
        // 2. HttpResponse- ( header + body(myJSON) + status-code)
    }

    @GetMapping("api2")
    String[] api2(){
        System.out.println("===== api-1 is called ====");
        return new String[] {"item-11", "item-22", "item-33", "item-44"};
    }
}


/*
Json:
{
    k:12,
    k:"vjdfjbfdj"
    k: [ i1, i2 ]
}

[
{...}, {...}, {...}
]
 */

