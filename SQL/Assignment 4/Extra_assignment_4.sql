USE database_test1;

-- ------------------------------------------------------------------------------------------------------------------------ CREATE table project_module
DROP TABLE IF EXISTS project_modules;
CREATE TABLE project_modules(
	module_id	INT PRIMARY KEY,
    project_id	INT,
    project_modules_date	DATE,
    project_modules_completed_on	DATE,
    project_modules_description		VARCHAR(255),
    FOREIGN KEY (project_id) REFERENCES projects(project_id) ON DELETE SET NULL
);
-- ------------------------------------------------------------------------------------------------------------------------- INSERT table project_module
INSERT INTO project_modules(module_id, project_id, project_modules_date, project_modules_completed_on, project_modules_description )
VALUES	(1, 1, '2020-11-01', '2020-12-01', 'for PC'),
		(2, 1, '2020-11-01', '2020-12-31', 'for Mobile'),
        (3, 2, '2020-10-01', NULL, 'for PC'),
        (4, 2, '2020-11-01', '2021-01-31', 'for Mobile'),
        (5, 3, '2020-03-01', '2020-09-01', 'Advertisement'),
        (6, 4, '2020-10-10', NULL, 'for Mobile');		
INSERT INTO project_modules(module_id, project_id, project_modules_date, project_modules_completed_on, project_modules_description )
VALUES	(7, 5, '2020-11-10', '2021-01-03', 'Online Recruitment');


-- ------------------------------------------------------------------------------------------------------------------------ CREATE table work_doone
DROP TABLE IF EXISTS work_done;
CREATE TABLE work_done(
	work_done_id			INT,
    employee_id				INT,
    module_id				INT,
    work_done_date			DATE,
    work_done_description	VARCHAR(255),
    work_done_status		INT,
    FOREIGN KEY (module_id) REFERENCES project_modules(module_id) ON DELETE SET NULL
);
-- ------------------------------------------------------------------------------------------------------------------------ INSERT table project_module
INSERT INTO work_done(work_done_id, employee_id, module_id, work_done_date, work_done_description, work_done_status)
VALUES		(1, 5, 1, '2020-11-29', 'Front FB for PC work 1', 1),
			(2, 4, 2, '2020-12-28', 'Front FB for Mobile work 1', 2),
            (3, 3, 3, NULL, 'Back FB for PC work 1', 2),
            (4, 6, 4, '2021-01-29', 'Back FB for Mobile work 1', 3),
            (5, 7, 5, '2020-08-25', 'Advertisement in Vietnam', 2),
            (6, 2, 6, NULL, 'database for Android Mobile', 2);
INSERT INTO work_done(work_done_id, employee_id, module_id, work_done_date, work_done_description, work_done_status)
VALUES		(7, 5, 7, '2021-01-01', 'new update', 1);
-- ------------------------------------------------------------------------------------------------------------------------ CREATE table project
CREATE TABLE projects(
	project_id	INT PRIMARY KEY,
    project_name	VARCHAR(255),
    project_start_date	DATE,
    project_description	VARCHAR(255),
    project_detail	VARCHAR(255),
    project_completed_on	DATE
);
-- ------------------------------------------------------------------------------------------------------------------------ INSERT table project
INSERT INTO projects(project_id, project_name, project_start_date, project_description, project_detail, project_completed_on )
VALUES		(1, 'front end', '2020-10-15', 'front-end FB', 'US supplier', '2021-01-01'),
			(2, 'back end', '2020-09-15', 'back_end FB', 'UK supplier', '2021-02-01'),
            (3, 'marketing', '2020-02-15', 'marketing camera', 'Vietnam', '2020-09-01'),
            (4, 'database', '2020-07-05', 'database youtube', 'China', '2020-11-01'),
            (5, 'Recruitment', '2020-10-05', 'For VTI', 'Jave Dev', '2020-12-15');
UPDATE projects
SET project_completed_on = NULL
WHERE project_id IN (2,4);

-- ------------------------------------------------------------------------------------------------------------------------ CREATE table employee
DROP TABLE IF EXISTS employee;
CREATE TABLE employee(
	employee_id	INT,
    employee_lastname	VARCHAR(255),
    employee_first_name	VARCHAR(255),
    employee_hiredate	DATE,
    employee_status	INT,
    supervisor_id	INT,
    social_security_number	INT
);
-- ------------------------------------------------------------------------------------------------------------------------ INSERT table employee
INSERT INTO employee(employee_id, employee_lastname, employee_first_name, employee_hiredate, supervisor_id, social_security_number)
VALUES		(1, 'HOANG', 'TRAN', '2019-05-15', 3, 1),
			(2, 'YEN', 'DINH', '2019-06-15', NULL, 1),
            (3, 'HOAN', 'PHAM', '2019-07-15', 1, 1),
            (4, 'HIEU', 'DINH', '2019-05-15', NULL, 1),
            (5, 'DUY', 'NGUYEN', '2019-05-15', NULL, 1),
            (6, 'HA', 'NGUYEN', '2019-05-20', 2, 1),
            (7, 'NGOC', 'LY', '2019-07-15', 2, 1);

-- -------------------------------------------------------------------------------------------------------------------------- QUESTION B

DROP PROCEDURE IF EXISTS question_b;
DELIMITER $$
CREATE PROCEDURE question_b()
BEGIN
	DECLARE count_work_done INT;
    DECLARE count_project_module INT;
    DECLARE count_project INT;
    
-- select work_done   
    SELECT COUNT(work_done_id) INTO count_work_done
	FROM work_done
	WHERE module_id IN (SELECT module_id 
					FROM project_modules
					WHERE project_id IN (SELECT project_id 
										FROM projects 
										WHERE project_completed_on >= NOW() - INTERVAL 3 MONTH));
-- xoa work_done 
    DELETE FROM work_done
    WHERE module_id IN (SELECT module_id 
					FROM project_modules
					WHERE project_id IN (SELECT project_id 
										FROM projects 
										WHERE project_completed_on >= NOW() - INTERVAL 3 MONTH ));
-- select project_module 								
    SELECT COUNT(module_id) INTO count_project_module
    FROM project_modules
	WHERE project_id IN (SELECT project_id 
						FROM projects 
						WHERE project_completed_on >= NOW() - INTERVAL 3 MONTH);
-- xoa project_module
	DELETE FROM project_modules
    WHERE project_id IN (SELECT project_id 
						FROM projects 
						WHERE project_completed_on >= NOW() - INTERVAL 3 MONTH);
-- select project
	SELECT COUNT(project_id) INTO count_project
    FROM projects 
	WHERE project_completed_on >= NOW() - INTERVAL 3 MONTH;
-- delete project
    DELETE FROM projects 
    WHERE project_completed_on >= NOW() - INTERVAL 3 MONTH;
    
    SELECT count_project, count_project_module, count_work_done;
    
END$$
DELIMITER ;
-- ------------------------------------------------------------------------------------------------------------------------------------QUESTION C 
DROP PROCEDURE IF EXISTS question_c;
DELIMITER $$
CREATE PROCEDURE question_c()
BEGIN
	SELECT *
    FROM project_modules
    WHERE project_modules_completed_on IS NULL;
END $$
DELIMITER ;
-- -----------------------------------------------------------------------------------------------------------------------------------QUESTION D
DROP PROCEDURE IF EXISTS question_d;
DELIMITER $$
CREATE PROCEDURE question_d()
BEGIN
	SELECT e.*
    FROM employee e
    JOIN work_done wd ON e.employee_id = wd.employee_id
    WHERE e.supervisor_id IS NULL;
 
END $$
DELIMITER ;


-- tao view work_done , question b
CREATE OR REPLACE VIEW v_word_done AS
SELECT work_done_id 
FROM work_done
WHERE module_id IN (SELECT module_id 
					FROM project_modules
					WHERE project_id IN (SELECT project_id 
										FROM projects 
										WHERE project_completed_on IS NULL));
                                        
-- tao view project_module , question b
CREATE OR REPLACE VIEW v_project_modules AS 
SELECT module_id FROM project_modules
WHERE project_id IN (SELECT project_id FROM projects 
WHERE    project_completed_on IS NULL);

-- tao view project , question b

CREATE OR REPLACE VIEW v_projects AS
SELECT * FROM projects 
WHERE    project_completed_on IS NULL;
-- --------------------------------------------------------------------------------------------------------------- QUESTION B- BRIEF
DROP PROCEDURE IF EXISTS question_b_1;
DELIMITER $$
CREATE PROCEDURE question_b_1()
BEGIN
	DECLARE count_word_done INT;
    DECLARE count_project_module INT;
    DECLARE count_project INT;
    
	SELECT COUNT(work_done_id) FROM v_work_done;
END $$
DELIMITER ;
-- tra ve tt nhan vien tham gia lam - co nguoi giao viec, in them thong tin cua nguoi giao viec
