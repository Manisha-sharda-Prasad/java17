##  Spring Boot
 
- Framework designed to simplify the development of Java applications, 
- for web applications and microservices. 
- provides a pre-configured setup.
- reduce boilerplate code.

### 1. Key Features of Spring Boot:
1. `Auto-Configuration`:
   - configures Spring application based on the dependencies you added.
   
2.`Standalone Applications`:
   - allows to create standalone applications 
   - run independently without requiring external  server.
   - package application in `JAR`, run it using an `embedded server` like `Tomcat /Jetty`.

2. `Production-Ready Features`:
   - health checks, and externalized configuration.
   
3. `Microservices Support`:
    - well-suited for developing microservices.

### 2. Spring vs. Spring boot:

#### 1. Spring:
Broad range of features, requiring more configuration and setup.

- Core, `dependency injection`,  `transaction management`.
- wide range of functionalities
- Configuration- done through` XML files`,
- requires `more setup`.

#### 2. Spring boot:
Extension of Spring that simplifies application development.

- `Simplified Development`.
- `Auto-Configuration`: with help of dependencies 
- `reduces manual setup`.
- `Standalone Applications`: `embedded server` (like Tomcat or Jetty)
- `Production-Ready Features`: monitoring, logging, managing applications, 
-  `easier to deploy/ run` in production environments.
- `Starter POMs`: bundle dependencies for specific functionalities


### 3. Annotations:
1.Core Annotations:------

`@SpringBootApplication`: (combines `@Configuration, @EnableAutoConfiguration,@ComponentScan`, Placed on the main class.)

`@Component:` (class as a Spring component.)

`@Service:`  (specialization of @Component, business logic.)

`@Repository:`   (of@Component, handle database operations.)

`@Controller:`    (of @Component. class serves as a controller in the MVC pattern(Model–view–controller)).

`@RestController:` (of @Controller and @ResponseBody, create REST-ful web services.)

2.Configuration and Bean Annotations:--------

`@Configuration:`  (class declares one or more @Bean methods)

`@Bean:` (method  will return an object)

3. Dependency Injection Annotations:--------

`@Autowired:` (inject dependencies automatically. constructors, setter , and fields.)

`@Qualifier:` (which bean to inject when there are multiple candidates.)

4.JPA Annotations:---------

`@Entity:` (class  mapped to a database table.)

`@Table:` (name of  database table used for mapping.)

`@Id:` (specifies primary key of entity.)

`@GeneratedValue:` (generation strategies for the primary keys.)

`@Column:`  (details of column to which a field or property will be mapped.)

5.Spring MVC Annotations:---------

`@RequestMapping:`

`@GetMapping, @PostMapping, @PutMapping, @DeleteMapping, @PatchMapping:` (for @RequestMapping ,specific HTTP methods (GET, POST, PUT, DELETE, PATCH)).

`@RequestParam:`  (extract query parameters, or any other parameters from URL.)

`@PathVariable:` (extract values from the URI template.)

6.Security Annotations:----------

`@Secured:` (defines a list of roles on a method.)