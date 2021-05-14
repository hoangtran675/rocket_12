DROP DATABASE IF EXISTS final;
CREATE DATABASE final;
USE final;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
	id	INT PRIMARY KEY,
    fullName VARCHAR(255),
    email VARCHAR(255),
    `password` VARCHAR(255),
    `position` ENUM('M','E'),
    expInYear INT,
    projectId INT,
    proSkill VARCHAR(255)
    
);



DROP TABLE IF EXISTS project;
CREATE TABLE project(
	projectId INT,
    teamSize INT,
    idManager INT,
    idEmployees INT
);

INSERT INTO `user`(id, fullName, email, `password`, `position`, expInYear,  projectId, proSkill)
VALUES			  (1,'Tran Van Hoang', 'tran16875@gmail.com', '123456', 'M', 8, NULL, NULL),
				   (2,'Tran Thi Loan', 'tranloan@gmail.com', '123456', 'E', NULL, 1, 'dev'),
                    (3,'Le Hong Tham', 'tham16@gmail.com', '123456', 'E', NULL, 1, 'test'),
                     (4,'Pham Thi Hue', 'huepham@gmail.com', '123456', 'M', 4, NULL, NULL),
                      (5,'Nguyen Ngoc Nam', 'namnguyen@gmail.com', '123456', 'E', NULL, 2, 'sql'),
                       (6,'Pham Cong Kien', 'kienmd@gmail.com', '123456', 'E', NULL, 2, 'test'),
                        (7,'Nguyen Thi Nguyet', 'nguyet@gmail.com', '123456', 'E', NULL, 2, 'php');
                    
INSERT INTO project(projectId, teamSize, idManager, idEmployees)
VALUES 				(1, 3, 1, 2),
					(1, 3, 1, 3),
                    (2, 4, 4, 5),
                    (2, 4, 4, 6),
                    (2, 4, 4, 6);


