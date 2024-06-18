-- Inserting data into Users table
INSERT INTO Users (UserName, Email, Password) VALUES
('Alice Johnson', 'alice@example.com', 'password123'),
('Bob Smith', 'bob@example.com', 'password123');

-- Inserting data into Products table
INSERT INTO Products (ProductName, Price, Stock) VALUES
('Laptop', 999.99, 10),
('Smartphone', 599.99, 20),
('Headphones', 199.99, 50);

-- Inserting data into Orders table
INSERT INTO Orders (UserID, TotalAmount) VALUES
(1, 1599.97),
(2, 799.98);

-- Inserting data into OrderItems table
INSERT INTO OrderItems (OrderID, ProductID, Quantity, Price) VALUES
(1, 1, 1, 999.99),
(1, 2, 1, 599.99),
(2, 2, 1, 599.99),
(2, 3, 1, 199.99);

INSERT INTO Product (product_id,Product_Name, Price, Stock)
VALUES (4, 'Laptop', 999.99, 10);