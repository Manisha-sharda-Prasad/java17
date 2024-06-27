# Hibernate

## Intro
- `persist` : save in DB.
- JPA - Java persistence API (Just `Specification`/theory)
- implementor of JPA : `hibernate`(popular), apache-open-jpa, etc.
- hibernate uses `JDBC` behind the scene.
  - JDBC : Core
  - [ old-developer            >>                                              JDBC >> database ]
  - [ new-developer            >>                                 hibernate >> JDBC >> database ]
  - [ new-generation developer >>  Springboot-starter-jpa-data >> hibernate >> JDBC >> database ] **
- hibernate  ==  `implementation of JPA concepts` +  `additional feature`
- JDBC sample code : 
  - https://chatgpt.com/c/3f5f6c3f-3b82-4c27-a381-813ca08dd85f
  - `Driver Load`(Java-prg) > `Connection` > `statement`- SQL query >> `execute` > `ResultSet`
  
- Hibernate Framework: 
>  - `JPA Concepts` - to understand flows
>  - `annotation`. eg : @Entity 
>  - `built-in method`. eg : delete(), save(), get(), etc
>  - `Hibernate-configuration`

## JPA Concept
1. `ORM`  - object-relational mapping
  - `Java (Entity)`  <--> Hibernate (Framework) <---> `Database (Table)`
  - Entity : `@Entity` class ABC {...}. Class ABC become entity here.

2. `Association`

3. `inheritance`

4. `caching` : 
- Note: no need to learn.
- temporary storage /copies - `frequently used data`
- 1-level-cache : default / PersistenceContext (PC)
- 2-level-cache : customize - have to enable it explicitly.

https://www.geeksforgeeks.org/difference-between-jdbc-and-hibernate-in-java/?ref=header_search