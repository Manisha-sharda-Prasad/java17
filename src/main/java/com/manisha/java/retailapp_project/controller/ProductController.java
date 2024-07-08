package com.manisha.java.retailapp_project.controller;
import com.manisha.java.util.Print;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {
    @GetMapping("productApi1/{urlData1}/{urlData2}")
    ResponseEntity <String[]>  productApi1(

           //get from header -
          @RequestHeader("header1") String product1,
          @RequestHeader("header2") String product2,
          //url -
          @RequestParam("param1")  String p1,
          @RequestParam("param2") String p2,
          //dynamic url -
          @PathVariable("urlData1") String u1,
          @PathVariable("urlData2") String u2
    )
    {
        Print.print("-----------Product_Api_1------------");
        Print.print("RequestHeader, header1:{} " + product1 + "header2:{} " + product2);
        Print.print("RequestParam, param1:{} " + p1 + "param1:{} " + p2);
        Print.print("PathVariable, urlData1:{} " + u1  + "urlData1:{} " + u2);

        String[] responseBody = new String[] {"Product1, Product2, Product3, Product4, Product5,"};

        HttpHeaders headers = new HttpHeaders();
        headers.add("Header1", "H1");
        headers.add("Header2", "H2");

        return new ResponseEntity<String[]>(responseBody, headers, HttpStatus.OK);
    }
}
