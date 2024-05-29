--1 Query for adding a new book.
insert into book (title, author, publisher, publication_year, number_of_copies)
values ('Cahil','Ilber Ortayli','bilmemKim','2024-08-13',300);

--2  Query for registering a new reader.
insert into reader (firstname, lastname, address, phonenumber, email)
values ('Jeyhuna','Nabizada','Xirdalanin kruqu','320390293092','jeyhuna@gmail.com');

--3  Query for issuing a book to a reader.
insert into loan (bookid, readerid, loandate, returndate)
values (3,3,'2019-12-5','2020-08-15');

--4 Query for returning a book from a reader.
DELETE FROM loan WHERE returndate='2020-08-15';

--5 Query for searching books based on various criteria.
SELECT * from book
Where title LIKE '%Cahil%';

--6  Query for searching currently available books.
SELECT *
FROM book
WHERE id NOT IN (
    SELECT bookid
    FROM loan
    WHERE loan.returndate IS NULL
);


--7 Query for searching popular books among readers.
SELECT b.*, COUNT(l.readerid) AS total_reads
FROM book b
JOIN loan l ON b.id = l.bookid
GROUP BY b.id
ORDER BY total_reads DESC;

--8 Query for searching books read by a specific reader.
SELECT b.*
FROM book b
JOIN loan l ON b.id = l.bookid
JOIN reader r ON l.readerid = r.id
WHERE r.firstname = 'Jane';

--9 Query for searching books written by a specific author.
SELECT b.*
FROM book b
JOIN authorship ats ON b.id = ats.bookid
JOIN author a ON ats.authorid = a.id
WHERE a.firstname = 'Arthur';

--10 Query for updating book information.
UPDATE book
SET title = 'New Title'
WHERE id = 1;

--11 Query for deleting a book from the library.
DELETE FROM book
WHERE id = 7;
--12  Query for searching books by genre.
SELECT b.*
FROM book b
JOIN genreassignment ga ON ga.bookid = b.id
JOIN genre g ON ga.genreid = g.id
WHERE g.genrename = 'historical friction';

--13  Query for calculating the total number of books borrowed by a reader.
SELECT readerid, COUNT(*) AS total_books_borrowed
FROM loan
GROUP BY readerid;

--14  Query for finding the most borrowed book in the library.
SELECT b.title AS most_borrowed_book, COUNT(l.bookid) AS total_borrow_count
FROM book b
JOIN loan l ON b.id = l.bookid
GROUP BY b.title
ORDER BY total_borrow_count DESC
LIMIT 1;

--15  Query for updating reader information
UPDATE  reader
SET firstname = 'Nisa'
WHERE firstname='Alisa';



