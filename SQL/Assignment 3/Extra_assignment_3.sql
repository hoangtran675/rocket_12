USE adventureworks;
-- QUESTION 1
SELECT `Name` FROM product WHERE ProductID IN (SELECT ProductID FROM product WHERE `Name` LIKE '%Saddle%');
-- QUESTION 2
SELECT `Name` FROM product 
WHERE productID IN (SELECT productID FROM product
WHERE `Name` LIKE '%BoT%' );
-- QUESTION 3
SELECT ProductID , `Name`
FROM product 
WHERE ListPrice = (SELECT MIN(ListPrice) AS minimum_price FROM product
WHERE ProductSubcategoryID = 3);
-- QUESTION 4
SELECT a.`Name`, b.`Name` 
FROM countryregion a
JOIN stateprovince b ON a.CountryRegionCode = b.CountryRegionCode;

-- QUESTION 5
SELECT a.`Name`, b.`Name` 
FROM countryregion a
JOIN stateprovince b ON a.CountryRegionCode = b.CountryRegionCode
WHERE a.`Name` = 'Germany' OR a.`Name` = 'Canada';

-- QUESTION 6 : BusinessEntityID ??????
SELECT a.SalesPersonID, a.Bonus, a.SalesYTD, b.SalesOrderID, b.OrderDate
FROM salesperson a
JOIN salesorderheader b ON a.SalesPersonID = b.SalesPersonID;

-- QUESTION 7
SELECT  a.Bonus, a.SalesYTD, b.SalesOrderID, b.OrderDate, e.Title
FROM salesperson a
JOIN salesorderheader b ON a.SalesPersonID = b.SalesPersonID
JOIN employee e ON a.SalesPersonID = e.EmployeeID;
