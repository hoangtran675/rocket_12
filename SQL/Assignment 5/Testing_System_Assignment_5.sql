USE testing_system_assignment;
-- QUESTION 1;
DROP TRIGGER IF EXISTS 	question_1;
DELIMITER $$
CREATE TRIGGER question_1
BEFORE INSERT ON `group` FOR EACH ROW
BEGIN
 IF NEW.create_date < NOW() - INTERVAL 1 YEAR THEN
 SIGNAL SQLSTATE '12345' 
 SET MESSAGE_TEXT = 'THE CREATE MUST BE LESS THAN 1 YEAR BEFORE';
 END IF;
END $$
DELIMITER ;
INSERT INTO `group`(create_date)
VALUES	('2019-01-01');

-- QUESTION 2
DROP TRIGGER IF EXISTS 	question_2;
DELIMITER $$
CREATE TRIGGER question_2
BEFORE INSERT ON `account` FOR EACH ROW
BEGIN
	DECLARE id_sale INT;
    SELECT department_id INTO id_sale
    FROM department
    WHERE department_name = 'Sale';
	IF NEW.department_id = id_sale THEN
 SIGNAL SQLSTATE '12345' 
 SET MESSAGE_TEXT = 'DEPARTMENT SALE CAN NOT ADD MORE USER';
 END IF;
END $$
DELIMITER ;
-- QUETION 3 : sua 5 thanh 8
DROP TRIGGER IF EXISTS 	question_3;
DELIMITER $$
CREATE TRIGGER question_3
BEFORE INSERT ON group_account FOR EACH ROW
BEGIN
    
	IF NEW.group_id IN (SELECT group_id
					    FROM group_account
					    GROUP BY group_id
                        HAVING COUNT(account_id) = 8 ) THEN
	SIGNAL SQLSTATE '12345' 
	SET MESSAGE_TEXT = 'THIS GROUP CAN NOT BE ADDED MORE THAN 8 ACCOUNTS';
	END IF;
END $$
DELIMITER ;

-- QUESTION 4 :
DROP TRIGGER IF EXISTS 	question_4;
DELIMITER $$
CREATE TRIGGER question_4
BEFORE INSERT ON exam_question FOR EACH ROW
BEGIN
	IF NEW.question_id IN (SELECT question_id
					    FROM exam_question
					    GROUP BY exam_id
                        HAVING COUNT(question_id) = 2 ) THEN
	SIGNAL SQLSTATE '12345' 
	SET MESSAGE_TEXT = 'THIS EXAM CAN NOT BE ADDED MORE THAN 2 QUESTIONS';
	END IF;
END $$
DELIMITER ;
INSERT INTO exam_question(exam_id, question_id)
VALUES		(1,2 );

-- QUESTION 5
-- admin@gmail.com
DROP TRIGGER IF EXISTS 	question_5;
DELIMITER $$
CREATE TRIGGER question_5
BEFORE INSERT ON `account` FOR EACH ROW
BEGIN
	IF NEW.email = 'admin@gmail.com' THEN
	SIGNAL SQLSTATE '12345' 
	SET MESSAGE_TEXT = 'THIS IS ADMIN EMAIL, CAN NOT DEDETE THIS EMAIL';
	END IF;
END $$
DELIMITER ;

-- QUESTION 6

DROP TRIGGER IF EXISTS 	question_6;
DELIMITER $$
CREATE TRIGGER question_6
BEFORE INSERT ON `account` FOR EACH ROW
BEGIN
	IF NEW.department_id IS NULL THEN
	SET NEW.department_id = (SELECT department_id FROM department WHERE department_name = 'Waiting room');
	END IF;
END $$
DELIMITER 



-- QUESTION 7 -------------------------------------------------------------------------------------------------------------------------------
INSERT INTO answer(content, question_id, is_correct)
VALUES	('answer A - 5', 5, 'TRUE'), 
		('answer B - 5', 5, 'FALSE'),
        ('answer C - 5', 5, 'FALSE'), 
        ('answer A - 1', 1, 'TRUE'),
        ('answer B - 1', 1, 'FALSE'),
        ('answer C - 1', 1, 'FALSE'),
        ('answer D - 1', 1, 'FALSE'),
        ('answer A - 2', 2, 'TRUE'), 
		('answer B - 2', 2, 'FALSE');
        
DROP TRIGGER IF EXISTS 	question_7;
DELIMITER $$
CREATE TRIGGER question_7
BEFORE INSERT ON answer FOR EACH ROW
BEGIN
	DECLARE v_number_of_answers TINYINT;
	DECLARE v_number_of_correct_answers TINYINT;

	SELECT COUNT(a.answer_id) INTO v_number_of_answers
    FROM answers a 
    JOIN questions q ON a.question_id = q.question_id
    WHERE a.question_id = NEW.question_id;
    
    SELECT COUNT(a.answer_id) INTO v_number_of_correct_answers
    FROM answers a 
    JOIN questions q ON a.question_id = q.question_id
    WHERE a.question_id = NEW.question_id AND a.is_correct = 1;
    
    IF v_number_of_answers > 4 THEN
		SIGNAL SQLSTATE '12345' -- disallow insert this record
		SET MESSAGE_TEXT = 'One question has a maximum of 4 answers!';
	END IF;
    
    IF v_number_of_correct_answers >= 2 THEN
		SIGNAL SQLSTATE '12345' -- disallow insert this record
		SET MESSAGE_TEXT = 'One question has a maximum of 2 correct answers!';
	END IF;
END $$
DELIMITER ;

ALTER TABLE `account`
ADD COLUMN gender ENUM('M','F','U');


-- QUESTION 8

DROP TRIGGER IF EXISTS 	question_8;
DELIMITER $$
CREATE TRIGGER question_8
BEFORE INSERT ON `account` FOR EACH ROW
BEGIN
	IF NEW.gender = 'Male' THEN
		SET NEW.gender = 'M';
	ELSEIF NEW.gender = 'Female' THEN
		SET NEW.gender = 'F';
	ELSEIF NEW.gender = 'Unknown' THEN
		SET NEW.gender = 'U';
	END IF;
END$$
DELIMITER ;

-- QUESTION 9 

DROP TRIGGER IF EXISTS 	question_9;
DELIMITER $$
CREATE TRIGGER question_9
BEFORE DELETE ON exam FOR EACH ROW
BEGIN
	IF OLD.create_date >= NOW() - INTERVAL 2 DAY THEN
	SIGNAL SQLSTATE '12345' 
	SET MESSAGE_TEXT = 'THIS IS EXAM IS IN TWO DAYS BEFORE, CAN NOT DELETE';
	END IF;
END$$
DELIMITER ;

-- QUESTION 10

DROP TRIGGER IF EXISTS 	question_10;
DELIMITER $$
CREATE TRIGGER question_10
BEFORE DELETE ON question FOR EACH ROW
BEGIN
	IF OLD.question_id NOT IN (	SELECT q.question_id 
								FROM question q 
                                INNER JOIN exam_question eq ON q.question_id = eq.question_id  ) THEN
	SIGNAL SQLSTATE '12345' 
	SET MESSAGE_TEXT = 'CAN NOT DELETE, BECAUSE QUESTION IS NOT NULL';
	END IF;
END $$
DELIMITER ;

DROP TRIGGER IF EXISTS 	question_10_1;
DELIMITER $$
CREATE TRIGGER question_10_1
BEFORE UPDATE ON question FOR EACH ROW
BEGIN
	IF OLD.question_id NOT IN (	SELECT q.question_id 
								FROM question q 
                                INNER JOIN exam_question eq ON q.question_id = eq.question_id  ) THEN
	SIGNAL SQLSTATE '12345' 
	SET MESSAGE_TEXT = 'CAN NOT DELETE, BECAUSE QUESTION IS NOT NULL';
	END IF;
END $$
DELIMITER ;

-- QUESTION 12 : 
SELECT exam_id, duration,
CASE	
	WHEN e.duration <= 30 THEN 'Short time'
    WHEN e.duration > 30 AND e.duration <= 60 THEN 'Medium time'
    ELSE 'Long time' 
END AS type_of_duration
FROM exam e;

-- QUESTION 13
SELECT group_id, COUNT(account_id) AS _count, 
	CASE
		WHEN COUNT(account_id) <= 5 THEN 'few'
		WHEN COUNT(account_id) > 5 AND COUNT(account_id) <= 20 THEN 'normal'
		ELSE 'higher'
	END AS the_number_user_amount
FROM group_account
GROUP BY group_id;
-- QUESTION 14
SELECT a.department_id, d.department_name, COUNT(a.account_id), 
	CASE 
		WHEN COUNT(a.account_id) = 0 THEN 'Khong co User'
        ELSE ''
    END AS check_number_of_user
FROM `account` a 
RIGHT JOIN department d ON a.department_id = d.department_id
GROUP BY d.department_id;




         











