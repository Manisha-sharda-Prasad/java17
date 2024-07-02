package com.manisha.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(e)
@ComponentScan("com.manisha.java.retailapp_project")
public class RunAPIs {

	public static void main(String[] args)
	{
		SpringApplication.run(RunAPIs.class, args);



		List<String> l = new ArrayList<String>();
		l.add("Lekhraj");
		l.add("Zeh");
		l.add("Manisha");
		l.add("Arush");
		// [l, Z, M , A] : order: insertion order
		// sort : [A, l , M , Z]

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
