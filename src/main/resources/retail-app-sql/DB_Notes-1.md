1.)SQL-- stands for Structured Query Language
--SQL is a standard language for storing, manipulating and retrieving data in databases.
--To build a website that shows data from a database, you will need: RDBMS

2.)RDBMS--Relational Database Management System.
--database program (i.e. MS Access, SQL Server, MySQL , Oracle, Post-Gress)
--data in RDBMS is stored in database objects called tables.
--A table is a collection of related data entries it consists of columns and rows.

3.)SQL Commands:
(DDL,DML)

-SELECT - extracts data from a database
-UPDATE - updates data in a database
-DELETE - deletes data from a database
-INSERT INTO - inserts new data into a database

-CREATE DATABASE - creates a new database
-ALTER DATABASE - modifies a database

-CREATE TABLE - creates a new table
-ALTER TABLE - modifies a table
-DROP TABLE - deletes a table

-CREATE INDEX - creates an index (search key)
-DROP INDEX - deletes an index

4.)SQL aggregate functions are:
function that performs a calculation on a set of values, and returns a single value.

-MIN() - returns the smallest value of selected column
-MAX() - returns the largest value
-COUNT() - returns the number of rows in a set
-SUM() - returns the total sum of a numerical column
-AVG() - returns the average value of a numerical column

5.)SQL JOIN:
A JOIN clause is used to combine rows from two or more tables, based on a related column between them.

-(INNER) JOIN: Returns records that have matching values in both tables
-LEFT (OUTER) JOIN: Returns all records from the left table, and the matched records from the right table
-RIGHT (OUTER) JOIN: Returns all records from the right table, and the matched records from the left table
-FULL (OUTER) JOIN: Returns all records when there is a match in either left or right table
-SQL INNER JOIN  SQL LEFT JOIN  SQL RIGHT JOIN  SQL FULL OUTER JOIN

6.)SQL Constraints:
used to specify rules for the data in a table. limit the type of data that goes into table.
If  any violation between the constraint and the data action, the action is aborted:

-NOT NULL - Ensures that a column cannot have a NULL value
-UNIQUE - Ensures that all values in a column are different
-PRIMARY KEY - A combination of a NOT NULL and UNIQUE. Uniquely identifies each row in a table
-FOREIGN KEY - Prevents actions that would destroy links between tables
-CHECK - Ensures that the values in a column satisfies a specific condition
-DEFAULT - Sets a default value for a column if no value is specified
-CREATE INDEX - Used to create and retrieve data from the database very quickly