##  Web services :

### 1. REST (Representational State Transfer) 
REST is preferred for its` simplicity, performance, scalability, flexibility, ease of use, and widespread adoption`.

- `Simplicity:` 
  - REST uses standard `HTTP methods (GET, POST, PUT, DELETE),` 
  - simpler and easier to understand compared to complex SOAP protocol.

- `Performance:` 
  - REST typically  work with multiple formats like (`JSON, XML, HTML, and plain text`).
  
- `Scalability: `
  - Rest services are `stateless,` which makes them more scalable.
  - Each request from client -> server contain all information needed to understand and process the request, 
  - allowing servers to process requests independently.

-` Flexibility:`  
  - supports different `data formats`. 
  - `JSON` used with REST due to its lightweight nature.

- `Widespread Adoption:` 
  - widely adopted and supported by most modern web frameworks and technologies,
  - easier to integrate with other services and applications.
 
### 2. SOAP (Simple Object Access Protocol) 
- SOAP is XML-based
- more complex SOAP protocol , requires` XML` messaging and additional setup.
 

### HTTP methods :
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



### Spring MVC (Model-View-Controller):
- This client-server interaction is essential for web applications 
- spring-boot-starter-web sets up a web application using Spring MVC. 
- Instead of traditional HTML views, you can return JSON data using Jackson, 
- simplifying the development of REST-ful web services.


- `Spring MVC (Model-View-Controller):`
  - Model: Represents the data (e.g., Java objects).
  - View: Represents the presentation layer (e.g., HTML).
  - Controller: Handles incoming HTTP requests, processes them, and returns a response.

- `Configuration(automatic):`
  - Spring Boot automatically configures Spring MVC for you, so you don’t have to set it up manually.
  - It sets up default configurations and necessary components like DispatcherServlet, view resolvers, etc.

- Replacing `HTML` with `JSON (Jackson):`

  - Instead of returning HTML views, you  return `JSON data`.
  - Jackson is a library that Spring Boot uses to convert `Java objects to JSON` and vice versa.
  - When controller method returns a Java object, Jackson automatically converts it to JSON if the client expects JSON.
  
  - `Controller returning JSON`:
    - `@RestController`: Tells Spring that this controller returns data (usually JSON) instead of views (HTML).
    - `@GetMapping(`"/products"): Maps the /products URL to this method.
    - Returning Java objects: These are automatically converted to JSON by Jackson.

