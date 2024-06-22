--1. Retrieve all shops and their addresses.
select s.shopname, s.address from retailapp.shop s ;

--2. Select all products from a specific category:
select * from retailapp.products p
where p.categoryid = 1 ; 

--3. Select all orders placed by a specific customer:
select * from retailapp.orders o 
where o.customerid = 3;

--4. Select all order details for a specific order:
select * from retailapp.orderdetails o2  
where o2.orderid = 3;

--5. Join Orders and Customers tables to get customer details for each order.
select * from retailapp.customers c 
join 
retailapp.orders o 
on
c.customerid = o.customerid ;

select o.orderid ,o.orderdate , c.customername  
from retailapp.customers c 
join retailapp.orders o 
on c.customerid = o.customerid ;

--6. Join OrderDetails, Orders,Products to get product details for each order.

select p.productname, od.quantity, o.orderdate 
from retailapp.products p ,retailapp.orderdetails od ,retailapp.orders o 
where  od.orderid = o.orderid ;
and  p.productid = od.productid;

--7.Count the number of orders for each customer.
select  c.customername , count(o.orderid) 
from  retailapp.orders o, retailapp.customers c 
where o.customerid = c.customerid 
group by c.customername
--having count(o.orderid) = 2
order by c.customername
;


--8. Get the average price of products in each category
select c.categoryname , avg(p.price)
from retailapp.products p , retailapp.categories c 
where p.categoryid  = c.categoryid 
group by c.categoryname ;

-- Complex Queries--
-- 1. Get the total sales amount for each product.
select p.productname ,(od.quantity * p.price) as TotalSales
from retailapp.orderdetails od, retailapp.products p;


-- 2. Find customers who have placed orders but not yet shipped.
update retailapp.orders
set shipperid = NULL 
where orderid in (13,14,15);

select c.customername, o.orderid 
from retailapp.orders o 
	inner join retailapp.customers c on o.customerid = c.customerid 
	left outer join retailapp.shippers s on o.shipperid = s.shipperid
where o.shipperid IS NULL
; 
-- join 		: inner   join 
-- left-join,   : outer   left-join
-- right-join	: outer	  right-join 



-- 3. Get the most ordered product.

select *
from retailapp.orderdetails od 
where od.quantity = (
		select max(od.quantity)
		from retailapp.orderdetails od
);

























































