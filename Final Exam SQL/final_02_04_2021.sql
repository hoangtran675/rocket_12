DROP DATABASE IF EXISTS final_exam;
CREATE DATABASE final_exam;
USE final_exam;

DROP TABLE IF EXISTS Country;
CREATE TABLE Country(
	country_id		INT PRIMARY KEY,
    country_name	VARCHAR(255) NOT NULL
);

INSERT INTO Country(	country_id, 	country_name)
VALUES 				(		1	  ,	   'Việt Nam'				),
					(		2	  ,	   'Trung Quốc'				),
                    (		3	  ,	   'Hoa Kì'				),
                    (		4	  ,	   'Nga'				);
DROP TABLE IF EXISTS Location;
CREATE TABLE Location(
	location_id			INT PRIMARY KEY,
    street_address		VARCHAR(255) NOT NULL,
    postal_code			VARCHAR(255) NOT NULL,
    country_id			INT NOT NULL,
    FOREIGN KEY(country_id) REFERENCES Country(country_id)
);

INSERT INTO Location( location_id,	street_address,	postal_code,	country_id)
VALUES				(	1		,	'Đại Cồ Việt'	,  '100000',	1		),
					(	2		,	'Trần Phú'	 ,      '180000',	1		),
                    (	3		,	'Trần Hưng Đạo'	,   '190000',	1		),
                    (	4		,	'Thương Hải 1'	,  '200000',	2		),
                    (	5		,	'Bắc Kinh 1'	,  '210000',	2		),
                    (	6		,	'Texas 1'	    ,  '300000',	3		),
                    (	7		,	'Lusiana'	    ,  '350000',	3		),
                    (	8		,	'Maxcova 1'	    ,  '400000',	4		);

DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee(
	employee_id		INT PRIMARY KEY,
    full_name		VARCHAR(255),
    email			VARCHAR(255) UNIQUE KEY NOT NULL,
    location_id 	INT,
    FOREIGN KEY(location_id) REFERENCES Location(location_id)
);

INSERT INTO Employee(employee_id, full_name, email, location_id)
VALUES 		(  1,   'TRẦN VĂN HOÀNG', 'tran16875@gmail.com', 1),
			(  2,   'NGUYỄN NGỌC DUY', 'nn03@gmail.com'		, 2),
            (  3,   'NGUYỄN VĂN HIẾN ', 'hienvti@gmail.com'	, 3),
            (  4,   'PHAM VAN HOAN', 'hoanbk@gmail.com'		, 1),
            (  5,   'LÊ HỒNG THÁI', 'thaile@gmail.com'		, 4),
            (  6,   'Đinh Ngọc THÀNH', 'thanhit@gmail.com'	, 5),
            (  7,   'PHẠM NHẬT VƯỢNG', 'vuongvin@gmail.com'	, 6),
            (  8,   'LÊ QUANG ANH', 'quanganh@gmail.com'	, 6),
            (  9,   'LÝ THÀNH ĐẠI', 'daivti@gmail.com'		, 8);
            

-- Câu 2a : Lấy tất cả các nhân viên thuộc việt nam
SELECT * 
FROM Employee
WHERE location_id IN (SELECT location_id 
					  FROM Location 
                      WHERE country_id = (SELECT country_id 
										  FROM Country 
                                          WHERE country_name = 'Việt Nam') )
ORDER BY employee_id;
-- Câu 2b : Lấy ra tên quốc gia của employee có email là nn03@gmail.com
SELECT country_name 
FROM Country
WHERE country_id = (SELECT country_id 
					FROM Location
                    WHERE location_id = (SELECT location_id 
										FROM employee
                                        WHERE email = 'nn03@gmail.com'));
                                        
-- Câu 2c : Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc
-- 
SELECT c.country_name, l.location_id, COUNT(e.employee_id) AS number_of_employee
FROM Country c
JOIN Location l ON c.country_id = l.country_id
LEFT JOIN Employee e ON l.location_id = e.location_id
GROUP BY c.country_name, l.location_id;

-- câu 3 : tạo trigger
DROP TRIGGER IF EXISTS question_3;
DELIMITER $$
	CREATE TRIGGER question_3
    BEFORE INSERT ON `employee`
    FOR EACH ROW
    BEGIN
		
        IF NEW.location_id IN (SELECT location_id 
							  FROM Location 
                              WHERE country_id IN ( SELECT c.country_id
													FROM Country c
													JOIN Location l ON c.country_id = l.country_id
													LEFT JOIN Employee e ON l.location_id = e.location_id
													GROUP BY c.country_name
													HAVING COUNT(e.employee_id) = 10 ) ) THEN
	SIGNAL SQLSTATE '12345' 
	SET MESSAGE_TEXT = 'THE COUNTRY FOR THIS EMPLOYEE IS ALREADY 10 PEOLE';
    END IF;
    END $$
DELIMITER ;
 

-- Câu 4 : 
ALTER TABLE employee
DROP FOREIGN KEY employee_ibfk_1;
ALTER TABLE employee
ADD FOREIGN KEY (location_id) REFERENCES Location(location_id) ON DELETE SET NULL;





                                        


