DROP DATABASE IF EXISTS Testing_System_Assignment;
CREATE DATABASE Testing_System_Assignment;
USE Testing_System_Assignment;

DROP TABLE IF EXISTS department;
CREATE TABLE department(
	department_id		INT PRIMARY KEY AUTO_INCREMENT,
    department_name 	VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS position;
CREATE TABLE `position`(
	position_id		INT PRIMARY KEY AUTO_INCREMENT,
    position_name	ENUM('Dev', 'Test','Scrum Master','PM')
);

DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`(
	account_id		INT PRIMARY KEY AUTO_INCREMENT,
    email			VARCHAR(255) NOT NULL,
    username		VARCHAR(255) NOT NULL UNIQUE KEY,
    fullname		VARCHAR(255),
    department_id 	INT ,
    position_id		INT, 
    create_date		DATE,
    FOREIGN KEY(department_id) REFERENCES department(department_id),
    FOREIGN KEY(position_id) REFERENCES `position`(position_id)
);

DROP TABLE IF EXISTS `group`;
CREATE TABLE `group`(
	group_id		INT PRIMARY KEY AUTO_INCREMENT,
    group_name		VARCHAR(255) NOT NULL,
    creator_id		INT NOT NULL ,
    create_date 	DATE,
    FOREIGN KEY(creator_id) REFERENCES `account`(account_id)
);

DROP TABLE IF EXISTS group_account;
CREATE TABLE group_account(
	group_id	INT NOT NULL,
    account_id	INT NOT NULL,
    join_date	DATE,
    FOREIGN KEY(account_id) REFERENCES `account`(account_id),
    FOREIGN KEY(group_id) REFERENCES `group`(group_id)
    
);

DROP TABLE IF EXISTS type_question;
CREATE TABLE type_question(
	type_id	INT PRIMARY KEY AUTO_INCREMENT,
    type_name	ENUM('Essay', 'Multiple-Choice')
);

DROP TABLE IF EXISTS category_question;
CREATE TABLE category_question(
	category_id	INT PRIMARY KEY AUTO_INCREMENT,
    category_name	VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS question;
CREATE TABLE question(
	question_id		INT PRIMARY KEY AUTO_INCREMENT,
    content			VARCHAR(255) NOT NULL,
    category_id 	INT,
    type_id			INT NOT NULL,
    creator_id		INT,
    create_date		DATE,
    FOREIGN KEY(creator_id) 	REFERENCES `account`(account_id),
    FOREIGN KEY(type_id) 		REFERENCES type_question(type_id),
    FOREIGN KEY(category_id) 	REFERENCES category_question(category_id)

);
            
DROP TABLE IF EXISTS answer;
CREATE TABLE answer(
	answer_id	INT PRIMARY KEY AUTO_INCREMENT,
    content		VARCHAR(255) NOT NULL,
	question_id	INT,
    is_correct	ENUM('TRUE','FALSE'),
    FOREIGN KEY(question_id)	REFERENCES question(question_id)
);

DROP TABLE IF EXISTS exam;
CREATE TABLE exam(
	exam_id	INT PRIMARY KEY AUTO_INCREMENT,
    `code`	VARCHAR(15) NOT NULL UNIQUE KEY,
    title	VARCHAR(255) NOT NULL,
    category_id	INT,
    duration INT NOT NULL,
    creator_id	INT ,
    create_date	DATE,
    FOREIGN KEY(creator_id) REFERENCES `account`(account_id),
    FOREIGN KEY(category_id) REFERENCES category_question(category_id)
);
			
DROP TABLE IF EXISTS exam_question;
CREATE TABLE exam_question(
	exam_id	INT,
    question_id INT,
    FOREIGN KEY(question_id) REFERENCES question(question_id),
    FOREIGN KEY(exam_id) REFERENCES exam(exam_id)
	
);

-- Insert Data To Table

INSERT INTO department(department_name)
VALUES	( 'Sale'),
		( 'Marketing'),
        ( 'Production'),
        ( 'ISE'),
        ( 'Recorder'),
        ( 'Quality'),
        ( 'Maintenance'),
        ( 'R&D'),
        ( 'HR'),
        ( 'Purchase');

-- 'Dev', 'Test','Scrum Master','PM'
INSERT INTO `position`(position_name)
VALUES	('Dev'),
		('Test'),
        ('Scrum Master'),
        ('PM'),
        ('Dev'),
        ('Test'),
        ('Scrum Master'),
        ('PM');
        
INSERT INTO `account`(email, username, fullname, department_id, position_id, create_date)
VALUES	('accountemail2@gmail.com', 'username2', 'tran van 2', (SELECT department_id FROM department WHERE department_name = 'Marketing') , (SELECT position_id FROM `position` WHERE position_id = 2), '2020-02-01' ),
		('accountemail3@gmail.com', 'username3', 'nguyen thi 3', (SELECT department_id FROM department WHERE department_name = 'Production') , (SELECT position_id FROM `position` WHERE position_id = 3), '2020-01-05' ),
        ('accountemail4@gmail.com', 'username4', 'do van 4', (SELECT department_id FROM department WHERE department_name = 'ISE') , (SELECT position_id FROM `position` WHERE position_id = 4), '2019-12-12' ),
        ('accountemail5@gmail.com', 'username5', 'pham van 5', (SELECT department_id FROM department WHERE department_name = 'R&D') , (SELECT position_id FROM `position` WHERE position_id = 1), '2020-06-01' ),
        ('accountemail6@gmail.com', 'username6', 'ly thi 6', (SELECT department_id FROM department WHERE department_name = 'Quality') , (SELECT position_id FROM `position` WHERE position_id = 2), '2020-01-01' ),
        ('accountemail7@gmail.com', 'username7', 'dinh van 7', (SELECT department_id FROM department WHERE department_name = 'Sale') , (SELECT position_id FROM `position` WHERE position_id = 2), '2020-01-01' ),
        ('accountemail8@gmail.com', 'username8', 'le van 8', (SELECT department_id FROM department WHERE department_name = 'Quality') , (SELECT position_id FROM `position` WHERE position_id = 1), '2020-01-01' );
        
INSERT INTO `group`(group_name, creator_id, create_date)
VALUES	('group 1' ,(SELECT account_id FROM `account` WHERE account_id = 22), '2019-12-12'),
		('group 2' ,(SELECT account_id FROM `account` WHERE account_id = 23), '2020-05-12'),
        ('group 3' ,(SELECT account_id FROM `account` WHERE account_id = 24), '2020-07-12'),
        ('group 4' ,(SELECT account_id FROM `account` WHERE account_id = 25), '2020-06-12'),
        ('group 5' ,(SELECT account_id FROM `account` WHERE account_id = 26), '2019-12-21');


INSERT INTO group_account(group_id, account_id, join_date)
VALUES		( (SELECT group_id FROM `group` WHERE group_id = 1) , (SELECT account_id FROM `account` WHERE account_id = 22), '2020-02-01' ),
			( (SELECT group_id FROM `group` WHERE group_id = 2) , (SELECT account_id FROM `account` WHERE account_id = 23), '2020-02-01' ),
            ( (SELECT group_id FROM `group` WHERE group_id = 3) , (SELECT account_id FROM `account` WHERE account_id = 22), '2020-12-01' ),
            ( (SELECT group_id FROM `group` WHERE group_id = 4) , (SELECT account_id FROM `account` WHERE account_id = 25), '2020-08-06' ),
            ( (SELECT group_id FROM `group` WHERE group_id = 5) , (SELECT account_id FROM `account` WHERE account_id = 23), '2020-12-01' );	
        
INSERT INTO type_question(type_name)
VALUES	('Essay'),
		('Essay'),
        ('Multiple-Choice'),
        ('Essay'),
        ('Multiple-Choice'),
        ('Essay'),
        ('Multiple-Choice');
        
INSERT INTO category_question(category_name)
VALUES		('category name 1'),
			('category name 2'),
            ('category name 3'),
            ('category name 4'),
            ('category name 5'),
            ('category name 6'),
            ('category name 7');
            
INSERT INTO question(content, category_id, type_id, creator_id, create_date)
VALUES		('content 1', (SELECT category_id FROM category_question WHERE category_id = 1) , (SELECT type_id FROM type_question WHERE type_id = 1), (SELECT account_id FROM `account` WHERE account_id = 22), '2020-01-01'),
			('content 2', (SELECT category_id FROM category_question WHERE category_id = 2) , (SELECT type_id FROM type_question WHERE type_id = 2), (SELECT account_id FROM `account` WHERE account_id = 23), '2020-05-01'),
            ('content 3', (SELECT category_id FROM category_question WHERE category_id = 3) , (SELECT type_id FROM type_question WHERE type_id = 2), (SELECT account_id FROM `account` WHERE account_id = 23), '2020-06-01'),
            ('content 4', (SELECT category_id FROM category_question WHERE category_id = 4) , (SELECT type_id FROM type_question WHERE type_id = 1), (SELECT account_id FROM `account` WHERE account_id = 24), '2020-01-15'),
            ('content 5', (SELECT category_id FROM category_question WHERE category_id = 5) , (SELECT type_id FROM type_question WHERE type_id = 1), (SELECT account_id FROM `account` WHERE account_id = 22), '2020-02-01');            

INSERT INTO answer(content, question_id, is_correct)
VALUES		('answer content 1', (SELECT question_id FROM question WHERE question_id = 1 ), 'TRUE'),
			('answer content 2', (SELECT question_id FROM question WHERE question_id = 2 ), 'TRUE'),
            ('answer content 3', (SELECT question_id FROM question WHERE question_id = 3 ), 'FALSE'),
            ('answer content 4', (SELECT question_id FROM question WHERE question_id = 4 ), 'FALSE'),
            ('answer content 5', (SELECT question_id FROM question WHERE question_id = 5 ), 'TRUE');
            

INSERT INTO exam(`code`, title, category_id, duration, creator_id, create_date)
VALUES		('code 1', 'title 1', (SELECT category_id FROM category_question WHERE category_id = 1), 30, (SELECT account_id FROM `account` WHERE account_id = 22) , '2020-01-01'),
			('code 2', 'title 2', (SELECT category_id FROM category_question WHERE category_id = 2), 45, (SELECT account_id FROM `account` WHERE account_id = 23) , '2020-05-01'),
            ('code 3', 'title 3', (SELECT category_id FROM category_question WHERE category_id = 3),60, (SELECT account_id FROM `account` WHERE account_id = 24) , '2020-01-01'),
            ('code 4', 'title 4', (SELECT category_id FROM category_question WHERE category_id = 4),45, (SELECT account_id FROM `account` WHERE account_id = 23) , '2020-01-02'),
            ('code 5', 'title 5', (SELECT category_id FROM category_question WHERE category_id = 5),60, (SELECT account_id FROM `account` WHERE account_id = 22) , '2020-02-01'),
            ('code 6', 'title 6', (SELECT category_id FROM category_question WHERE category_id = 5),45, (SELECT account_id FROM `account` WHERE account_id = 24) , '2020-01-01');
            
INSERT INTO exam_question(exam_id, question_id)
VALUES		( (SELECT exam_id FROM exam WHERE exam_id = 1), (SELECT question_id FROM question WHERE question_id = 1) ),
			( (SELECT exam_id FROM exam WHERE exam_id = 2), (SELECT question_id FROM question WHERE question_id = 2) ),
            ( (SELECT exam_id FROM exam WHERE exam_id = 3), (SELECT question_id FROM question WHERE question_id = 3) ),
            ( (SELECT exam_id FROM exam WHERE exam_id = 4), (SELECT question_id FROM question WHERE question_id = 4) ),
            ( (SELECT exam_id FROM exam WHERE exam_id = 5), (SELECT question_id FROM question WHERE question_id = 5) );