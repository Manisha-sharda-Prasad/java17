# DB concept
- `session` 
  - multiple client connecting to `same` database.
    - client-1 (DB-1, Session-1) - DB connection ---txn-1---txn2---- DB Disconnect
    - client-2 (DB-1, Session-2) - DB connection ---txn-1---txn2---- DB Disconnect
    - client-3 (javaPrg-1, session-3) ...
- `transaction` - Atomicity, unit of work
  - can have multiple transaction.

---

# 1. Hibernate (popular)
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
- Automatic `Transaction management `
  - `SessionFactory` > `session` > `txn.start()` > [your SQL - SQSl1,SQL1, etc] > `txn.commit()` > `session.close()`


### 1.1 Intro
- `Persist` : save in DB.
- JPA - Java persistence API (Just `Specification`/theory)
- implementor of JPA : `hibernate`, apache-open-jpa, etc.
- hibernate uses `JDBC` behind the scene.
  - JDBC : Core
  - [ old-developer            >>                                               JDBC >> database ]
  - [ new-developer            >>                                  hibernate >> JDBC >> database ]
  - [ new-generation developer >>  Spring-boot-starter-jpa-data >> hibernate >> JDBC >> database ] **
   
- Hibernate Provides >>  `Implementation of JPA concepts` +  `Additional Feature` 
- `Driver Load`(Java-prg) > `Connection` > `Statement`- SQL query >> `Execute` > `ResultSet`
  
### 1.2 Hibernate Framework: 
- `JPA Concepts`:  to understand flows
- `Annotation`. eg : @Entity 
- `Built-in method`. eg : delete(), save(), get(), etc 
- `Hibernate-configuration` 
  - SpringBoot project - `application.property` : preferred
  - non-SpringBoot project - `persistent.xml`

## 2. JPA Concept
- `Java Persistence API `(JPA) 
- Java specification that provides specific functionality for `ORM` tools.

### 2.1.`ORM` - (Object-Relational Mapping)
  - ORM tool simplifies the data creation,
  - `Java (Entity)`  <--> Hibernate (Framework) <---> `Database (Table)`
  - Entity : `@Entity` class ABC {...}. Class ABC become entity here.

### 2.2.`Association` or `relationShip` *****

### 2.3.`Inheritance`

### 2.4.`Caching` : 
- Note: no need to learn.
- temporary storage /copies - `frequently used data`
- 1-level-cache : default / PersistenceContext (PC)
- 2-level-cache : customize - have to enable it explicitly.

https://www.geeksforgeeks.org/difference-between-jdbc-and-hibernate-in-java/?ref=header_search

## 3. JDBC
- JDBC (Java Database Connectivity) provides a set of Java APIs to access relational databases from the Java program.
- Java APIs enable programs to execute SQL statements, and interact with any SQL database.


---
### Rough Notes/Pointer
1. 
