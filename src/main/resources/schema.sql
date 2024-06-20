-- Customers Table
CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    CustomerName VARCHAR(255) NOT NULL,
    ContactName VARCHAR(255),
    Country VARCHAR(255),
    Address VARCHAR(255),
    City VARCHAR(255),
    PostalCode VARCHAR(20)
);

-- Categories Table
CREATE TABLE Categories (
    CategoryID INT PRIMARY KEY,
    CategoryName VARCHAR(255) NOT NULL,
    Description TEXT
);

-- Employees Table
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    LastName VARCHAR(255) NOT NULL,
    FirstName VARCHAR(255) NOT NULL,
    BirthDate DATE,
    Photo VARCHAR(255),
    Notes TEXT
);

-- Suppliers Table
CREATE TABLE Suppliers (
    SupplierID INT PRIMARY KEY,
    SupplierName VARCHAR(255) NOT NULL,
    ContactName VARCHAR(255),
    Country VARCHAR(255),
    Address VARCHAR(255),
    City VARCHAR(255),
    PostalCode VARCHAR(20)
);

-- Shippers Table
CREATE TABLE Shippers (
    ShipperID INT PRIMARY KEY,
    ShipperName VARCHAR(255) NOT NULL,
    Phone VARCHAR(255)
);

-- Products Table
CREATE TABLE Products (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(255) NOT NULL,
    SupplierID INT,
    CategoryID INT,
    Unit VARCHAR(255),
    Price DECIMAL(10, 2),
    FOREIGN KEY (SupplierID) REFERENCES Suppliers(SupplierID),
    FOREIGN KEY (CategoryID) REFERENCES Categories(CategoryID)
);

-- Orders Table
CREATE TABLE Orders (
    OrderID INT PRIMARY KEY,
    CustomerID INT,
    EmployeeID INT,
    OrderDate DATE,
    ShipperID INT,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID),
    FOREIGN KEY (EmployeeID) REFERENCES Employees(EmployeeID),
    FOREIGN KEY (ShipperID) REFERENCES Shippers(ShipperID)
);

-- OrderDetails Table
CREATE TABLE OrderDetails (
    OrderDetailID INT PRIMARY KEY,
    OrderID INT,
    ProductID INT,
    Quantity INT,
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);


-- DROP TABLE CATEGORIES ;
-- DROP TABLE CUSTOMERS ;
-- DROP TABLE EMPLOYEES ;
-- DROP TABLE ORDERDETAILS ;
-- DROP TABLE ORDERS ;
-- DROP TABLE PRODUCTS ;
-- DROP TABLE  SHIPPERS ;
-- DROP TABLE SUPPLIERS ;