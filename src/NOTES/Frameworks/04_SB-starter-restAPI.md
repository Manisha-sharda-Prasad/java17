## A. Web services / API :
- services available over the internet:
  - `webApp/website` --> httpResponse (header, body:`html`) : formatted data
  - `web-service` -->  httpResponse (header, body:`json`) : raw data
- trigger/run code just by hitting url:
  - client/browser --> url hit --> req --> backend-Server(run:java-code)
- type :
  - SOAP
  - REST (popular)

### 1. SOAP (Simple Object Access Protocol)
- SOAP is XML-based
- more complex SOAP protocol , requires` XML` messaging and additional setup.

### 2. REST (Representational State Transfer) 
- REST is preferred over SOAP.

- `Simplicity:` 
  - `http` protocol is simple. REST uses standard HTTP methods (GET, POST, PUT, DELETE).  
  - simpler and easier to understand compared to complex `SOAP` protocol.

-  `Stateless`
  - request comes from client -> server process the request, send response
  - server does not save any response, no history, no track.
  - allowing servers to process each requests `independently`.

- `Flexibility:`  
  - supports multiple `data formats : JSON, XML, HTML, plain text, etc`.
  - `JSON` used with REST due to its lightweight nature.

- `Widely Used:` 
  - widely adopted and supported by most modern web frameworks and technologies,
  - easier to integrate with other services and applications.

--- 

### HTTP methods / httpRequest Types
-  Client-server communication uses `HTTP requests` and `HTTP responses`, 
-  client ( web browser or app) communicates with server (where web application is hosted) using standard `HTTP methods`: 

- `GET:`
  - Client Request: " `Retrieve data`."
  - Server Response: Sends back the requested data.
  - Example: Getting a list of products from an online store.

- `POST:`
  - Client Request: "Send data to `Create something new`."
  - Server Response: Confirms creation, return created data.
  - Example: Submitting a new order form.

- `PUT:`
  - Client Request: "`Update existing data`."
  - Server Response: Confirms the update.
  - Example: Updating the details of an existing order.

- `DELETE:`
  - Client Request: "`Delete existing data`."
  - Server Response: Confirms deletion.
  - Example: Deleting an order.

---

## B. Spring MVC (Model-View-Controller):

- https://www.tutorialspoint.com/springmvc/springmvc_overview.htm
- client-server interaction is essential for web applications 
- Instead of traditional HTML views, you can return JSON data using Jackson, 
- simplifying the development of REST-ful web services.

- `Spring MVC (Model-View-Controller):`
  - `Model`: Represents data (e.g. `Java objects, data from DB + @repo + @srv`)
  - `View`: NA in REST, Replacing HTML-> JSON. 
  - `Controller`: Handles HTTP requests, processes them, and returns response. DispatcherServlet(by Spring) + @Controller

- Old (no-framework): Tomcat : Web Container [[  url-1:servlet-1, url-2:servlet-2, ...  ]]

- SpringMVC (framework) : Tomcat : web Container [[   `DispatcherServlet` + `Spring web-AC`  ]]
  - `Single-servlet` `DispatcherServlet` --> forward request to multiple @controller class/s
  - `spring-Container`: web-AC [[ beans: @controller, @srv, @repo, @component, @Bean]]
  - helper: `handlerMapping, ViewResolver`

- model(data object) to Json:
  - `Jackson` is a library that converts `Java objects to JSON` and vice versa.
  - When controller method returns a Java object, Jackson automatically converts it to JSON if the client expects JSON.
  - controller method --> annotate with `@ResponseBody`
  
- Annotations in SpringMVC
- `@RestController`: Tells Spring that this controller returns data (usually JSON) instead of views (HTML).
- `@GetMapping(`"/products"): Maps the /products URL to this method.
- ...
- ...

---

## C. spring-boot-starter-web
- sets up a web application using:
  - Spring MVC.
  - jackson
  - spring core
  - hibernate validator

- Automatic Configuration : `bean register`
  - view resolvers bean
  - Dispatcher Servlet 
  - set up Jackson: ObjectMapper bean, etc
  - embedded tomcat
  - `/error` --> `BasicErrorController`
---
## D. REST API Annotations

- `@RestController:`
Combines `@Controller, @ResponseBody`, simplifying the creation of REST-ful web services.

- `@RequestMapping:`
Used to map web requests onto specific handler classes and/or handler methods.

- `@GetMapping:`
Handles HTTP GET requests.

- `@PostMapping:`
Handles HTTP POST requests.

- `@PutMapping:`
Handles HTTP PUT requests.

- `@DeleteMapping:`
Handles HTTP DELETE requests.

- `@PatchMapping:`
Handles HTTP PATCH requests.

- `@RequestBody:`
Maps the body of the HTTP request to a method parameter.

- `@ResponseBody:`
Maps the return value of a method to the HTTP response body.

- `@RequestParam:`
Extracts query parameters, form data, and parts of the URL from the request.

- `@PathVariable:`
Extracts values from the URI path.

- `@ResponseStatus:`
Specifies the HTTP status code for a method.

- `@ExceptionHandler:`
Defines methods to handle exceptions thrown during request processing.

- `@CrossOrigin:`
Enables Cross-Origin Resource Sharing (CORS).

---
## Coding/prog
```
FLOW:
- client/browser > http req (data) > web-server/container/tomcat >  
        SPRING-MVC/REST [` DispatcherServlet` will call Controller > `Spring-container/AC (controller > srv > rep >)` > database > model(entity,etc) ]
- server has prepared `model` > convert to JSON > http response > browser/client
```
- send data from postman, catch/map those data in controller
- http req sends some `data` to server
  - data1 : student `Object:s1` : save
  - data2 : filter : getAllStudentByCity : `String: city`
  - how ? : 
    - http req:`header` : k:v, k:v, ...  : `@RequestHeader`
    - http req:`body` : json  : `@RequestBody`
    - http req:`url/path` 
      - url`?k=v1&k=v&k=v2`  : `@RequestParam`
      - `url-prefix/v1/v2/url-suffix` : complete url : `@Pathvariable`
      - `url-prefix/v1/v2/url-suffix`?k=v4&k=v&k=v3

- `static url`: abc.com/get
- `dynamic url` : abc.com/get/{pageName}/end
  - abc.com/get/1/end
  - abc.com/get/100/end
  - abc.com/get/1000/end
  - ...