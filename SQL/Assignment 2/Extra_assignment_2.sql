USE extra_assignment;
-- QUESTION 1
INSERT INTO fresher_training_management(fullname, birth_date, gender, et_iq, et_gmath, et_english, training_class, evaluation_note, vti_account )
VALUES	('tran van hoang', '1998-12-17', 'Male', 15, 10, 35, 1, 'good',1),
		('le thi nhung', '1997-01-01', 'Female', 20, 14, 40, 3, 'normal',2),
        ('nguyen van dai', '1998-10-17', 'Male', 6, 7, 48, 2, 'good',3),
        ('pham van quoc', '1996-09-19', 'Male', 18, 12, 50, 2, NULL,4),
        ('pham thanh chung', '1998-05-17', 'Male', 20, 3, 18, 3, NULL,5),
        ('le thi ngoc', '2000-12-17', 'Female', 10, 10, 25, 4, 'not bad',6),
        ('vu the sang', '2001-09-11', 'Male', 18, 16, 35, 4, 'not bad',7),
        ('tran hong tham', '2002-04-12', 'Female', 10, 10, 25, 4, 'not good',8),
        ('le thi giang', '2001-12-01', 'Female', 10, 10, 25, 4, NULL,9),
        ('le hong thuy', '1995-12-05', 'Female', 17, 16, 45, 5, 'good',10);
-- QUESTION 2
SELECT * FROM fresher_training_management
GROUP BY MONTH(birth_date)
ORDER BY MONTH(birth_date) ASC;
-- QUESTION 3
SELECT * 
FROM fresher_training_management
WHERE trainee_id IN (SELECT trainee_id FROM fresher_training_management
WHERE CHAR_LENGTH(fullname) = (SELECT MAX(CHAR_LENGTH(fullname)) AS _max FROM fresher_training_management) );

-- QUESTION 4
SELECT * FROM fresher_training_management
WHERE et_iq + et_gmath >= 20 AND et_iq >= 8 AND et_gmath >= 8 AND et_english >= 18 ;

-- QUESTION 5
COMMIT;
DELETE FROM fresher_training_management
WHERE trainee_id = 3;
ROLLBACK;
-- QUESTION 6
COMMIT;
UPDATE fresher_training_management
SET training_class = 2
WHERE trainee_id = 5;
ROLLBACK;




DROP TABLE IF EXISTS department;
CREATE TABLE department(
	department_number	INT,
    department_name		VARCHAR(255)
);
INSERT INTO department(department_number, department_name)
VALUES		(1, 'DEV'),
			(2, 'PM'),
            (3, 'SALE'),
            (4, 'ADMIN'),
            (5, 'TEST'),
            (6, 'MARKETING'),
            (7, 'ADMIN'),
            (8, 'HR'),
            (9, 'SCRUM MASTER'),
            (10, 'DELIVERY');
			
DROP TABLE IF EXISTS employee_table;
CREATE TABLE employee_table(
	employee_number	INT PRIMARY KEY,
    employee_name	VARCHAR(255),
    department_name VARCHAR(255)
);

INSERT INTO employee_table(employee_number, employee_name, department_name)
VALUES		(1, 'TRAN VAN HOANG', 'DEV'),
			(2, 'PHAM VAN HOAN', 'DEV'),
            (3, 'NGUYEN QUANG DUY', 'DEV'),
            (4, 'DINH QUANG HIEU', 'DEV'),
            (5, 'DINH THI YEN', 'MARKETING'),
            (6, 'TRAN THI HONG NGUYEN', 'MARKETING'),
            (7, 'TRAN DUC THINH', 'MARKETING'),
            (8, 'DUONG VAN HOANG', 'HR'),
            (9, 'NGUYEN HUY HOANG', 'HR'),
            (10, 'LE NGOC QUYNH', 'ADMIN');
            
DROP TABLE IF EXISTS employee_skill_table;
CREATE TABLE employee_skill_table(
	employee_number	INT,
    skill_code		VARCHAR(255),
    date_registered	DATE,
    FOREIGN KEY(employee_number) REFERENCES employee_table(employee_number)
);

INSERT INTO employee_skill_table(employee_number, skill_code, date_registered)
VALUES							(1, 'Java skill', '2020-01-01'),
								(2, 'Java skill', '2020-01-01'),
                                (3, '.Net skill', '2020-01-01'),
                                (4, 'Pyhthon skill', '2020-01-01'),
                                (5, 'Presentation skill', '2020-01-01'),
                                (1, 'English skill', '2020-01-01'),
                                (2, 'Presentation skill', '2020-01-01'),
                                (1, 'Management skill', '2020-01-01'),
                                (5, 'Teamwork', '2020-01-01'),
                                (6, 'Teamwork', '2020-01-01');

-- QUESTION 4
SELECT department_name, COUNT(employee_number) FROM employee_table
GROUP BY department_name
HAVING COUNT(employee_number) > 3;

-- QUESTION 5
SELECT * FROM employee_table
GROUP BY employee_name;

-- QUESTION 6
SELECT employee_number, COUNT(skill_code) FROM employee_skill_table
GROUP BY employee_number
HAVING COUNT(skill_code) > 1;


-- QUESTION 6