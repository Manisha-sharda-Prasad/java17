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
   - package application in `JAR`, run it using an `embedded serve`r like `Tomcat /Jetty`.

2. `Production-Ready Features`:
   - health checks, and externalized configuration.
   
3. `Microservices Support`:
    - well-suited for developing microservices.


### 2. Annotations:
1.Core Annotations:-

`@SpringBootApplication`: combines `@Configuration, @EnableAutoConfiguration,@ComponentScan`, Placed on the main class.

`@Component:` class as a Spring component.

`@Service:`  specialization of @Component, business logic.

`@Repository:`   of@Component, handle database operations.

`@Controller:`    of @Component. class serves as a controller in the MVC pattern(Model–view–controller).

`@RestController:` of @Controller and @ResponseBody, create REST-ful web services.

2.Configuration and Bean Annotations:-

`@Configuration:`

`@Bean:`

3.Dependency Injection Annotations:-

`@Autowired:`

`@Qualifier:`

4.JPA Annotations:-

`@Entity:`

`@Table:`

`@Id:`

`@GeneratedValue:`

`@Column:`

5.Spring MVC Annotations:-

`@RequestMapping:`

`@RequestParam:`

`@GetMapping, @PostMapping, @PutMapping, @DeleteMapping, @PatchMapping:`

`@PathVariable:`

6.Security Annotations:-

`@Secured:`