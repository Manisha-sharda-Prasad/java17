# 1. Hibernate
- Hibernate is a `Java (ORM)framework`.
- Most used Object/Relational persistence and query service.
- Map `Java Classes` to `Database Tables`, by using annotations.
- Provides data query and recovery facilities
- Automatic Transaction management 
- Caching, Lazy-Loading

### 1.1 Intro
- `persist` : save in DB.
- JPA - Java persistence API (Just `Specification`/theory)
- implementor of JPA : `hibernate`(popular), apache-open-jpa, etc.
- hibernate uses `JDBC` behind the scene.
  - JDBC : Core
  - [ old-developer            >>                                               JDBC >> database ]
  - [ new-developer            >>                                  hibernate >> JDBC >> database ]
  - [ new-generation developer >>  Spring-boot-starter-jpa-data >> hibernate >> JDBC >> database ] **
   
- Hibernate Provides >>  `Implementation of JPA concepts` +  `Additional Feature`
- JDBC sample code : 
  - https://chatgpt.com/c/3f5f6c3f-3b82-4c27-a381-813ca08dd85f
  - `Driver Load`(Java-prg) > `Connection` > `Statement`- SQL query >> `Execute` > `ResultSet`
  
### 1.2 Hibernate Framework: 
- `JPA Concepts`  to understand flows
- `annotation`. eg : @Entity 
- `built-in method`. eg : delete(), save(), get(), etc 
- `Hibernate-configuration`

## 2. JPA Concept
- `Java Persistence API `(JPA) 
- Java specification that provides specific functionality for `ORM` tools.

### 2.1.`ORM` - Object-relational mapping
  - `Java (Entity)`  <--> Hibernate (Framework) <---> `Database (Table)`
  - Entity : `@Entity` class ABC {...}. Class ABC become entity here.

### 2.2.`Association`

### 2.3.`Inheritance`

### 2.4.`Caching` : 
- Note: no need to learn.
- temporary storage /copies - `frequently used data`
- 1-level-cache : default / PersistenceContext (PC)
- 2-level-cache : customize - have to enable it explicitly.

https://www.geeksforgeeks.org/difference-between-jdbc-and-hibernate-in-java/?ref=header_search

## 3. JDBC
- JDBC (Java Database Connectivity) provides a set of Java APIs to access relational databases from the Java program.
- 