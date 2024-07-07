##  Web services :

### 1. REST (Representational State Transfer) 
REST is preferred for its simplicity, performance, scalability, flexibility, ease of use, and widespread adoption.

- Simplicity: 
  - REST uses standard HTTP methods (GET, POST, PUT, DELETE), 
  - simpler and easier to understand compared to the 

- Performance: 
  - REST typically  work with multiple formats (like JSON, XML, HTML, and plain text).
  
- Scalability: 
  - Rest services are stateless, which makes them more scalable.
  - Each request from a client to a server must contain all the information needed to understand and process the request, 
  - allowing servers to process requests independently.

- Flexibility:  
  - supports different data formats. JSON used with REST due to its lightweight nature.

- Widespread Adoption: 
  - widely adopted and supported by most modern web frameworks and technologies,
  - making it easier to integrate with other services and applications.
 
### 2. SOAP (Simple Object Access Protocol) 

- more complex SOAP protocol which requires XML messaging and additional setup.
- SOAP is XML-based and can be more resource-intensive.

### HTTP methods :
In client-server communication using HTTP requests and HTTP responses, 
the client (usually a web browser or app) communicates with the server (where the web application is hosted) using standard HTTP methods. 
Here are the basic ones:

- `GET:`
  - Client Request: " retrieve data."
  - Server Response: Sends back the requested data.
  - Example: Getting a list of products from an online store.

- `POST:`
  - Client Request: "send data to create something new."
  - Server Response: Confirms creation, return created data.
  - Example: Submitting a new order form.

- `PUT:`
  - Client Request: "update existing data."
  - Server Response: Confirms the update.
  - Example: Updating the details of an existing order.

- `DELETE:`
  - Client Request: "delete existing data."
  - Server Response: Confirms deletion.
  - Example: Deleting an order.



### Spring MVC (Model-View-Controller):
This client-server interaction is essential for web applications to function dynamically and efficiently.


- `Spring MVC (Model-View-Controller):`
  - Model: Represents the data (e.g., Java objects).
  - View: Represents the presentation layer (e.g., HTML).
  - Controller: Handles incoming HTTP requests, processes them, and returns a response.

- `Configuration(automatic):`
  - Spring Boot automatically configures Spring MVC for you, so you don’t have to set it up manually.
  - It sets up default configurations and necessary components like DispatcherServlet, view resolvers, etc.

- `Replacing HTML with JSON using Jackson:`

  - Instead of returning HTML views, you  return JSON data.
  - Jackson is a library that Spring Boot uses to convert Java objects to JSON and vice versa.
  - When a controller method returns a Java object, Jackson automatically converts it to JSON if the client expects JSON.
