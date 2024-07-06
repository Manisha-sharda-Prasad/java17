##  Spring vs.Spring Boot


### 1.  Spring boot:
- Framework simplifies development of Java applications, 
- for web applications and `microservices`. 
- provides a `pre-configured setup`.
- reduce boilerplate code.

### 1.1 Key Features of Spring Boot:
1.`Auto-Configuration`:
   - configures Spring application based on the dependencies you added.
   
2.`Standalone Applications`:
   - allows to create standalone applications 
   - run independently without requiring external  server.
   - package application in `JAR`, run it using an `embedded server` like `Tomcat /Jetty`.

3.`Production-Ready Features`:
   - health checks, and externalized configuration.
   
4.`Microservices Support`:
    - well-suited for developing microservices.
    - make your microservices smaller and it will run faster.

5`More` : 
- `Auto Configured` Setup and `Starter Projects`:
- `Extension of Spring` that `simplifies application development using STARTER-PROJECT` / `Starter POMs(bundle dependencies)`
    - sb-starter-`jpa-data`
    - sb-starter-`web` (created using spring-MVC framework)

```
		Starter POM : 
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
```

- STARTER-PROJECT
    - `Auto-Configuration`:  starter project will have all framework's default setting/configuration.
        - `@EnableAutoConfiguation`
    - `Standalone Applications` :
        - Old : create web/servlet code >  install tomcat in laptop > launch/run project inside in Tomcat.
        - new : JAR has `embedded tomcat server` (or Jetty). run like regular program.
    - `Production-Ready Features`:
        - health-monitoring
        - logging

---


### 2. Spring: (Framework of frameworks):
- `Core` 
    - `Dependency` 
      - `Class A` has `Class B` instance.
      -  done by developers(developer control)-> a=new A, b=new B, a.setB(b)
      - so, A is dependent on B .
      - eg: Student has Address.
    - `Dependency Injection` (from Spring) :
      - `IoC`(Inversion of Control) Manages `bean lifecycle` and `dependencies`.
      - put `@Componenet`(Singleton class - obj 1) on classA,B,C
      - Spring will create `IoC-Container` [[ empty ]] 
      - Spring will create objects of A and B - [[ A a1, B b1 ]]
      - put `@AutoWire`(DI) on class [A]
      - Spring will inject [b1 into a1], using either way:
    - `Developer/ Spring -Ioc (bts) `: 
        - way-1 : `Setter Injection` : (flexible but mutable.)
          ```
          A a1 = new A();
          B b1 = new B();
          a1.setB(b1); // DI
          ```
        - way-2 : `Constructor Injection` : (promotes immutability.)
          ```
          B b1 = new B();
          A a1 = new A(b1); // DI
          ```
      - `Bean type`:
        - `Singleton beans` ( register in container at startup) 
          - a1, b1. ( single object only). eg : repo, service, controller `class` are singleton.
          - mostly used. 90%+
          - class B { m(){}, m(){}, ... } :: code-present / `stateless classes` / `SINGLETON` (single instance of classB)
        - `prototype beans` (lazy) 
          - register later by code:  c1, c2, c3 : [[ A a1, B b1, C c1,c2,c3 ]]
          - rarely used
          - class A { P, P, ... } :: data-hold / `stateful classes` / `PROTOTYPE` (multiple instance/s of classA)
      
    - Container Analogy:  
      - `Spring Container` / ApplicationContext AC: [[ beans : o1, o2, o3...    ]]
      - `hibernate Container` / PersistenceContext PC or Session: [[ entities : e1, e2, e3...    ]]
    
    - Spring project - run : empty container load >>  singleton bean gets created and get registered to container.
      
  - `AOP` : skip
  - `Spring hibernate`
  - `Spring JDBC` : jdbcTemplate.*
  - `Spring transaction management`
  - `Spring MVC` - webApp:  JSP:[HTML,JS,CSS] + [ Servlet(http) ]
  - `Spring REST` - REST api
  - ...
  - ...

- Broad range of features, requiring more configuration and setup.

---

### 3. Annotations :
- `@SpringBootApplication`: (Placed on the main class, combines 
    - `@Configuration` 
    - `@EnableAutoConfiguration`
    - `@ComponentScan`

- Bean Creation:
  - `@Component:`(marks/flags a class as a Spring component)
    - `@Service:`(specialization of @Component, business logic.)
    - `@Repository:`(of@Component, handle database operations.)
    - `@Controller:`(of @Component. class serves as a controller in the MVC pattern(Model–view–controller)).
      - `@RestController:`(of @Controller and @ResponseBody, create REST-ful web services.)

  - Configuration and Bean (Manual DI)
    - `@Configuration`
    - `@Bean`

- Automatic - Dependency Injection
  - `@Autowired:` : inject dependencies automatically : constructors, setter  or fields (reflection-API, assignment operator)
    - `@Qualifier:` Resolve : multiple candidates beans founds

---
## Spring MVC Annotations:---------
- `@RequestMapping:`
- `@GetMapping, @PostMapping, @PutMapping, @DeleteMapping, @PatchMapping:` (for @RequestMapping ,specific HTTP methods (GET, POST, PUT, DELETE, PATCH)).
- `@RequestParam:`  (extract query parameters, or any other parameters from URL.)
- `@PathVariable:` (extract values from the URI template.)
---

## Security Annotations:----------
- `@Secured:` (defines a list of roles on a method.)

---




