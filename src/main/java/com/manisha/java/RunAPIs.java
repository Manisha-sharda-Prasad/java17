package com.manisha.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RunAPIs {

	public static void main(String[] args) {
		SpringApplication.run(RunAPIs.class, args);

		List<String> l = new ArrayList<String>();
		l.add("item-1");
		l.add("item-2");
		l.add("item-3");

		l.stream()
			.map( i -> i+"====" ) // operator are method(pass Lambda/arrow function)
			.filter( i -> i.contains("2") )
			.forEach(System.out::println);
				//.operation3()
				//.operation4()
			//.collect( Collectors.toList() ); // terminal operation - collect()

		l.forEach( i -> System.out.println(i) );
	}
}

/*
Functional interface - only 1 abstract method

implement: write method body
- class
- Lambda / arrow function  -> method reference === [ new syntax ]
*/
