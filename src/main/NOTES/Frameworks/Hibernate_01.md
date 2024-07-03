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
key concepts of Hibernate in Java:

- `JPA CONCEPTS`:  
  - to understand flows
- `ORM MAPPING`: 
  - Java Class,Object <--> map <--> Table
- `@ENTITY` :
  - Automatic Table Creation : Map `Java Classes` to `Database Tables`.
- `BUILT METHODS`: 
  - delete(), save(), get(), etc
- `MAPPINGS`: 
  - Annotations for mappings, including relationships.
- `CACHING` : 
     - `session-level/ 1st-level /PersistentContext(PC)`- temporary memory,clears out.
     - `session-factory-level/ 2nd level `- global cache shared across sessions,rare used.
     - Access `PC`, then use `session` Object.
- `FETHCH - Lazy/Eager Loading`:
  - loading related data when needed/ fetch all advance,loaded immediately.
- `QUERIES/ CRITERIA API`:
  - `HQL` - de-couple with DB ,similar to SQL
  - `Criteria API` -  An alternative to HQL, write complex `dynamic` queries.
  - `Automatic Table Creation` : generate SQL statement from Java code.

- `TRANSACTION MANAGEMENT `:
  - Automatic
  - grouping multiple database operations into a single transaction.
  - `SessionFactory` > `session` > `txn.start()` > [your SQL - SQSl1,SQL1, etc] > `txn.commit()` > `session.close()`
  
### 1.1 Hibernate Framework:

- Hibernate-configuration:-
  - SpringBoot project - `application.property` : preferred
  - non-SpringBoot project - `persistent.xml`
- `Persist` : save in DB.
- Implementor of JPA : `hibernate`, apache-open-jpa, etc.
- Hibernate uses `JDBC` behind the scene.
  - JDBC : Core
  - [ old-developer            >>                                               JDBC >> database ]
  - [ new-developer            >>                                  hibernate >> JDBC >> database ]
  - [ new-generation developer >>  Spring-boot-starter-jpa-data >> hibernate >> JDBC >> database ] **
   
- `Driver Load`(Java-prg) > `Connection` > `Statement`- SQL query >> `Execute` > `ResultSet`

---

## 2. JPA Concept
- `Java Persistence API `(JPA) 
- Java specification(theory) that provides specific functionality for `ORM` tools.

### 2.1.`ORM` - (`Object-Relational Mapping`)
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
### 2.3. `Inheritance`
- Table creation strategy on parent-child class.
1. `Single table`
2. `per class`
3. `join`
---

### 2.4.`Caching` : 
- Note: no need to learn.
- Temporary storage /copies - `frequently used data`
- `1st-level/ Session-level Caching:-`
  - automatically caches objects within a session
  - temporary memory
  - Default / PersistenceContext (PC)
- `2nd-level/ Session-Factory-level Caching:-`
  - global cache shared across sessions
  - reused data
  - reducing the need to go back to the database frequently.
  - Customize - have to enable it explicitly.

### 2.5. `Persistence Context` /`PC`: 
- `container` that holds a set of `managed entity` instances.
- changes made to these entities are `tracked`,
- and `synchronizes/update the database`.
- Types of Persistence Context:-
  - `1.Transaction-scoped PC`:
    - single database transaction.
    - ends when transaction commits/rolls back.
    - used in web applications, where each request is handled in single transaction.
  - `2.Extended PC `:
    - lasts beyond a single transaction.
    - desktop applications. 
    - PC span multiple transactions/Data updating continuously
    - PC open for a longer period

### 2.6. `Session`/`Entity Manager`: 
- interface provided by JPA
- provide methods - `CRUD (Create, Read, Update, Delete)`operations on entities.
- manages the `PC`, ensuring that your changes to objects are tracked 
- synchronized with the database.

---

## 3. JDBC
- JDBC (Java Database Connectivity) 
- APIs that allows java application to interact with relational databases.
- Interacts, Executes SQL queries.
- Connections: Establishes connection to database uses - URL, username, and password.

---
#### Rough Notes/Pointer
## 4. Annotations and Concepts
1. 
https://www.geeksforgeeks.org/difference-between-jdbc-and-hibernate-in-java/?ref=header_search
https://chatgpt.com/c/571ae190-6863-48e7-90a8-90473fdd943a
