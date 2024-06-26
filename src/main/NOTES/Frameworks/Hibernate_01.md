# DB concept
- `Session` 
  - multiple client connecting to `same` database.
    - client-1 (DB-1, Session-1) - DB connection ---txn-1---txn2---- DB Disconnect
    - client-2 (DB-1, Session-2) - DB connection ---txn-1---txn2---- DB Disconnect
    - client-3 (javaPrg-1, session-3) ...
- `Transaction` - Atomicity, unit of work
  - can have multiple transaction.

---

# 1. Hibernate (popular)
Hibernate Provides >>  `Implementation of JPA concepts` +  `Additional Feature`

- `ORM` framework for Java
  - Class,Object <--> map <--> Table,Record
  - Automatic Table Creation : Map `Java Classes` to `Database Tables`, by using annotations.
  - `@Entity`
- `Caching` : 1st level, PersistentContext(PC) | 2nd level , rare, optional.
  - Performance, less Database call.
  - Fetch type options : `lazy loading`, `eager loading`.
  - Access PC, then use `session` Object.
- `Queries`:
  - `HQL` - de-couple with DB.
  - `Native SQL`
  - `Criteria API` -  write complex `dynamic` queries.
- `Transaction management (Automatic):`
  - `SessionFactory` > `session` > `txn.start()` > [your SQL - SQSl1,SQL1, etc] > `txn.commit()` > `session.close()`
  
### 1.1 Hibernate Framework:
- `JPA Concepts`:  to understand flows
- `Built-in method`. eg : delete(), save(), get(), etc
- `Hibernate-configuration`
  - SpringBoot project - `application.property` : preferred
  - non-SpringBoot project - `persistent.xml`
- Key features:-
  - `ORM Mapping`
  - `Transparent Persistence`
  - `HQL (Hibernate Query Language)` : similar to SQL
  - `Automatic Table Creation` : infer/generate SQL statemnet from Java code.
  - `Caching`
  - `Lazy/EAGER Loading`
  - Declarative Coding : `Annotations` based
  

### 1.2 Intro
- `Persist` : save in DB.
- JPA - Java persistence API (Just `Specification`/theory)
- implementor of JPA : `hibernate`, apache-open-jpa, etc.
- hibernate uses `JDBC` behind the scene.
  - JDBC : Core
  - [ old-developer            >>                                               JDBC >> database ]
  - [ new-developer            >>                                  hibernate >> JDBC >> database ]
  - [ new-generation developer >>  Spring-boot-starter-jpa-data >> hibernate >> JDBC >> database ] **
   
- `Driver Load`(Java-prg) > `Connection` > `Statement`- SQL query >> `Execute` > `ResultSet`

---

## 2. JPA Concept
- `Java Persistence API `(JPA) 
- Java specification that provides specific functionality for `ORM` tools.

### 2.1.`ORM` - (Object-Relational Mapping)
  - ORM tool simplifies the Data creation,
  - Maps Java objects to Database tables
  - `Java (Entity)`  <--> Hibernate Framework <---> `Database (Table)`

### 2.2 `Entities` and `Relationships`
  - Entity : `@Entity` class ABC {...}. Class become entity here.
  - Represents a Table in the Database.

###  `RelationShip` **
- @ One-to-One 
  - Add JoinColumn on `any`-side
  - add mappedBy on other side
  
- @ One-to-Many | @ Many-to-One
  - Add JoinColumn on `many`-side
  - add mappedBy on one-side
  
- @ Many-to-Many
  - Add new joinTable with 3 columns [ id, PK1 (non-unique), pk2(non-unique) ]
  - ```
    @JoinTable(
            name = "order_product",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    ```
---  

### 2.3. Inheritance
- Table creation strategy on parent-child class.
1. `Single table`
2. `per class`
3. `join`
---

### 2.4.`Caching` : 
- Note: no need to learn.
- temporary storage /copies - `frequently used data`
- 1-level-cache : default / PersistenceContext (PC)
- 2-level-cache : customize - have to enable it explicitly.

---
https://www.geeksforgeeks.org/difference-between-jdbc-and-hibernate-in-java/?ref=header_search

## 3. JDBC
- JDBC (Java Database Connectivity) 
- APIs that allows java application to interact with relational databases.
- Interacts, Executes SQL queries.



Connections: Establishes a connection to the database using a connection URL, username, and password.

---
#### Rough Notes/Pointer
## 4. Annotations and Concepts
1. 
