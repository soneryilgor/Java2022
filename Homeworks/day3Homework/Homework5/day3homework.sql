select ContactName, CompanyName,City from Customers

select ContactName Adi, CompanyName Sirketadi,City Sehir from Customers

select * from Customers where City="London"

SELECT * FROM Products where Categoryid=1 or categoryId=3

SELECT * FROM Products where Categoryid=1 or unit>=10

SELECT * FROM Products order by ProductName

SELECT * FROM Products order by CategoryID, ProductName

SELECT * FROM Products order by unit asc

SELECT * FROM Products order by unit desc

SELECT * FROM Products where Categoryid=1 order by price

SELECT * FROM Products where Categoryid=1 order by price desc

SELECT count(*) from products

SELECT count(*) from products where categoryid=2

SELECT count(*) adet from products where categoryid=2

SELECT categoryId from products group by categoryid

SELECT categoryId, count(*) Urun from products group by categoryid

SELECT categoryId, count(*) Urun from products group by categoryid having count(*)<10

SELECT categoryId, count(*) Urun from products where unit>20 group by categoryid having count(*)<10

SELECT Products.ProductID, Products.ProductName, Products.Price, Categories.CategoryName
FROM products inner join categories
on products.categoryId=categories.categoryid

SELECT Products.ProductID, Products.ProductName, Products.Price, Categories.CategoryName
FROM products inner join categories
on products.categoryId=categories.categoryid
where products.price<10

select * from products p inner join OrderDetails od
on p.productid =od.productid

select * from products p left join OrderDetails od
on p.productid =od.productid

select * from customers c left join Order o
on c.customerid =o.customerid
where o.customerid is null

select * from products p inner join OrderDetails od
on p.productid =od.productid
inner join Orders o
on o.orderid=od.orderid