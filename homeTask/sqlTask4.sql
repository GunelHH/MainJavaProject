CREATE TABLE Products(
    id serial primary key ,
    name varchar(50),
    price decimal(10,2),
    quantity integer,
    description text,
    category_id integer,
    FOREIGN KEY (category_id) REFERENCES Categories(id)
);

CREATE TABLE Categories(
                         id serial primary key ,
                         name varchar(50)
);
CREATE TABLE Customers(
    id serial primary key,
    firstname varchar(50),
    lastname varchar(50),
    address varchar(50),
    email varchar(50),
    phoneNumber integer
);

CREATE TABLE Orders(
                          id serial primary key,
                          customer_id integer,
                          orderDate date,
                          FOREIGN KEY (customer_id) references Customers(id)
);

CREATE TABLE OrderDetails(
                       id serial primary key,
                       order_id integer,
                       product_id integer,
                       quantity integer,
                       FOREIGN KEY (order_id) references Orders(id),
                       FOREIGN KEY (product_id) references Products(id)

);

INSERT INTO Products (Name, Price, Quantity, Description)
VALUES ('Product A', 10.99, 10, 'Modern'),
       ('Product B', 25.99, 20, 'New'),
       ('Product C', 5.99, 25, 'Ancient');

insert into Categories (Name)
values ('Electronics'),
       ('Home & Garden'),
       ('Books');

INSERT INTO Customers (FirstName, LastName, Address, Email, PhoneNumber)
VALUES ('Bob', 'Carlos', 'Germany', 'info@acme.com', 123 - 456 - 7890),
       ('John', 'Wilson', 'England', 'info@xyz.com', 987 - 654 - 3210),
       ('Mike', 'Corleone', 'Italy', 'info@abc.com', 555 - 555 - 5555);

insert into Orders (id, OrderDate)
values (1, '2023-06-01'),
       (2, '2023-06-05'),
       (3, '2023-06-10');

insert into OrderDetails (order_id, product_id, Quantity)
values (1, 3, 8),
       (2, 1, 5),
       (3, 1, 10);


--1 Get a list of all products.
    SELECT * From Products;
--2 Get a list of all categories of products.
    Select p.*, c.name From  Categories as c
    JOIN Products p on p.category_id = c.id;
--3 Get a list of all customers.
    SELECT * From Customers;
--4 Get a list of all orders.
SELECT * From Orders;
--5 Get a list of all order details.
SELECT * From OrderDetails;
--6 Get information about a specific product by its ID.
SELECT * From products
WHERE id=3;
--7 Get a list of products in a specific category.
SELECT p.* From products as p
JOIN Categories C on C.id = p.category_id
WHERE p.category_id=3;
--8 Get information about a customer by their ID.
SELECT c.*
FROM Customers c
WHERE c.id=1;
--9 Get a list of orders for a specific customer.
SELECT o.*
FROM Orders o
JOIN Customers C on C.id = o.customer_id
WHERE C.id=1;
--10 Get a list of order details for a specific order.
SELECT od.*
FROM OrderDetails od
JOIN Orders O on O.id = od.order_id
WHERE O.id=2;
--11 Update the price of a product by its ID.
UPDATE Products
SET price=10.99
where id=2;
--12 Add a new product.
INSERT INTO Products (Name, Price, Quantity, Description)
VALUES ('Product D', 200, 10, 'Modern');

--13 Delete a product by its ID.
DELETE FROM Products
WHERE id=2;