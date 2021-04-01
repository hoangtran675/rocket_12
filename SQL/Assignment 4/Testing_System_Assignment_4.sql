USE testing_system_assignment;
 --                                                                      Question 1 : nhap vao ten phong ban, in ra toan bo account phong ban do
DROP PROCEDURE IF EXISTS question_1;
DELIMITER $$
CREATE PROCEDURE question_1(IN p_dept_name VARCHAR(255) )
BEGIN
	SELECT a.account_id 
    FROM `account` a
    INNER JOIN department d ON a.department_id = d.department_id
    WHERE d.department_name = p_dept_name;
END$$
DELIMITER ;
CALL question_1('Sale');

--                                                                  question 2 : in ra so luong account trong moi group
DROP PROCEDURE IF EXISTS question_2;
DELIMITER $$
CREATE PROCEDURE question_2()
BEGIN
	SELECT group_id, COUNT(account_id) AS count_account_id
    FROM group_account
    GROUP BY group_id;
END$$
DELIMITER ;
CALL question_2();

--                                                                        question 3 : 
DROP PROCEDURE IF EXISTS question_3;
DELIMITER $$
CREATE PROCEDURE question_3()
BEGIN
	SELECT t.type_id, COUNT(q.question_id)
    FROM type_question t 
    INNER JOIN question q ON t.type_id = q.type_id
    WHERE MONTH(create_date) = MONTH(CURRENT_DATE()) AND YEAR(create_date) = YEAR(CURRENT_DATE())
    GROUP BY t.type_id;
END$$
DELIMITER ;
CALL question_3();

--                                                                question 4 : tao ra id cua type question co nhieu cau hoi nhat
DROP PROCEDURE IF EXISTS question_4;
DELIMITER $$
CREATE PROCEDURE question_4(OUT p_type_id INT)
BEGIN
	SELECT type_id INTO p_type_id
    FROM	(SELECT  type_id, MAX(A._count)
FROM
    (SELECT 
        t.type_id, COUNT(q.question_id) AS _count
    FROM
        type_question t
    INNER JOIN question q ON t.type_id = q.type_id
    GROUP BY t.type_id) AS A) AS B
    WHERE type_id = B.type_id;
END$$
DELIMITER ;
SET @p_type_id = '';
CALL question_4(@p_type_id);
SELECT @p_type_id;

--                                                               question 5 : su dung stored procedure o question 4 tim ra type_name
DROP PROCEDURE IF EXISTS question_5;
DELIMITER $$
CREATE PROCEDURE question_5()
BEGIN
	SELECT type_name
    FROM type_question
    WHERE type_id = @p_type_id;
END$$
DELIMITER ;
CALL question_5();

--                                                            question 6 : nhap vao chuoi, tra ve group co ten chua chuoi hoac user co usernam chua chuoi vua nhap
DROP PROCEDURE IF EXISTS question_6;
DELIMITER $$
CREATE PROCEDURE question_6(IN p_name VARCHAR(255))
BEGIN
	SELECT a.username, g.group_name
    FROM `account` a , `group` g
    WHERE g.group_name LIKE CONCAT('%', p_name, '%') OR a.username LIKE CONCAT('%', p_name, '%') ;
END$$
DELIMITER ;
CALL question_6('p');
SELECT * FROM `account`;

--                                                                question 7 nhap vao fullnam va email 
DROP PROCEDURE IF EXISTS question_7;
DELIMITER $$
CREATE PROCEDURE question_7(IN p_fullname VARCHAR(255), IN p_email VARCHAR(255))
BEGIN
	DECLARE out_position VARCHAR(255);
    DECLARE out_email VARCHAR(255);
    DECLARE out_dept VARCHAR(255);
	SELECT a.username, g.group_name
    FROM `account` a , `group` g
    WHERE g.group_name LIKE CONCAT('%', p_name, '%') OR a.username LIKE CONCAT('%', p_name, '%') ;
END$$
DELIMITER ;
CALL question_7('p');
--                                                                       question 8 : essay, multiple choice

DROP PROCEDURE IF EXISTS question_8;
DELIMITER $$
CREATE PROCEDURE question_8(IN p_type_question ENUM('Essay', 'Multiple-Choice'))
BEGIN
	SELECT MAX(A.length_content), A.question_id FROM
	( SELECT q.question_id, CHAR_LENGTH(q.content) AS length_content
    FROM question q
    RIGHT JOIN type_question tp ON q.type_id = tp.type_id
    WHERE tp.type_name = 'Multiple-Choice'
    ORDER BY length_content DESC ) AS A;
END$$
DELIMITER ;
CALL question_8('Multiple-Choice');
SELECT * FROM question;

--                                                                              question 9 : xoa exam dua vao ID
DROP PROCEDURE IF EXISTS question_9;
DELIMITER $$
CREATE PROCEDURE question_9(IN p_exam_id INT)
BEGIN
	COMMIT;
	DELETE FROM exam
    WHERE exam_id = p_exam_id;
END$$
DELIMITER ;
CALL question_9(6);
SELECT * FROM exam;
ROLLBACK;

--                                                           question 10 ???????????????????????????????????????

DROP PROCEDURE IF EXISTS question_10;
DELIMITER $$
CREATE PROCEDURE question_10()
BEGIN
	DECLARE p_exam_id INT;
    SELECT COUNT(A.exam_id) +  COUNT(eq.exam_id) AS total
    FROM (	SELECT exam_id INTO p_exam_id
			FROM exam
			WHERE YEAR(create_date) <= YEAR(CURRENT_DATE()) - 1 ) AS A
	LEFT JOIN exam_question eq ON A.exam_id = eq.exam_id;
    CALL question_9(@p_exam_id);
END$$
DELIMITER ;
SET @p_exam_id = '';
CALL question_9(@p_exam_id);


 -- question 11 : xoa phong ban bang ten va chuyen account phong ban do sang phong cho
 DROP PROCEDURE IF EXISTS question_11;
DELIMITER $$
CREATE PROCEDURE question_11(OUT p_department_name VARCHAR(255) )
BEGIN
UPDATE `account`
SET department_id = 20 , department_name = 'Waiting room'
WHERE department_id IN (
	SELECT A.department_id FROM
	( SELECT *
    FROM department
    WHERE department_name = p_department_name ) AS A );

DELETE FROM department
WHERE department_name = p_department_name;
END$$
DELIMITER ;
 

-- question 12 : moi thang co bao nhieu cau hoi duoc tao ra trong nam nay
DROP PROCEDURE IF EXISTS question_12;
DELIMITER $$
CREATE PROCEDURE question_12( )
BEGIN
SELECT MONTH(create_date), COUNT(question_id)
FROM question
WHERE YEAR(create_date) = 2020
GROUP BY MONTH(create_date);
END$$
DELIMITER ;

-- question 13 : moi thang co bao nhieu cau hoi, trong 6 thang tro lai day
DROP PROCEDURE IF EXISTS question_13;
DELIMITER $$
CREATE PROCEDURE question_13( )
BEGIN
SELECT MONTH(create_date), IFNULL(COUNT(question_id), 'Khong ton tai gia tri')
FROM question
WHERE create_date >= NOW()
GROUP BY MONTH();
END$$
DELIMITER ;
