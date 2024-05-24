CREATE Table Sales(
                      id serial Primary Key,
                      product varchar(50),
                      quantity integer,
                      price decimal(10,2)
);

insert into sales (product, quantity, price)
values ('Computer',3,3000.99),
       ('Laptop',5,500),
       ('telephone',10,2000),
       ('planshet',6,2500);


SELECT sum(quantity) as SumOfQuantity,avg(price) as TotalPrice From Sales
GROUP BY product;

Select sum(quantity),avg(price),min(price),max(price),count(id)
FROm Sales
GROUP BY product;


CREATE Table Expenses(
                         id serial Primary Key,
                         category varchar(50),
                         amount decimal(10,2)
);

insert into expenses (category, amount)
values ('apple',225.6),
       ('hp',100),
       ('asus',300),
       ('lenovo',200);

SELECT sum(amount) as totalAmount,avg(amount) as AvgAmount From Expenses
GROUP BY category;


CREATE Table Products(
                         id serial Primary Key,
                         name varchar(50),
                         price decimal(10,2)
);

insert into Products (name, price)
values ('apple',225.6),
       ('hp',100),
       ('asus',300),
       ('lenovo',200);


SELECT max(price) as maxPrice,min(price) as minPrice From Products
GROUP BY name;


CREATE table Students(
                         id serial primary key ,
                         name varchar(50),
                         surname varchar(50),
                         age integer,
                         gradeAvarage decimal
);

insert into Students (name, surname, age,gradeAvarage)
values ('Gunel','Hasanova',21,100);


CREATE table Grades(
                       id serial primary key ,
                       grade decimal
);

insert into Grades (grade)
values (100),
       (90),
       (80),
       (70);

Select name from Students
where gradeAvarage>(Select avg(grade) from Grades);

CREATE table MaleStudents(
                             id serial primary key ,
                             name varchar(50),
                             surname varchar(50),
                             age integer
);

insert into malestudents (name, surname, age)
values ('Ilqar','Mustafayev',22),
       ('Zaka','Suleymanov',24),
       ('Elgun','Mahmudov',20);


CREATE table FemaleStudents(
                               id serial primary key ,
                               name varchar(50),
                               surname varchar(50),
                               age integer
);

insert into FemaleStudents (name, surname, age)
values ('Gunel','Hasanova',21),
       ('Kheyransa','Pashayeva',27),
       ('Jeyhuna','Nabizada',24);

Select name from MaleStudents
UNION
Select name from FemaleStudents
order by name;


Select * from MaleStudents
intersect
Select * from FemaleStudents
order by name;

Select * from MaleStudents as m
except
Select * from FemaleStudents as f
order by name;


