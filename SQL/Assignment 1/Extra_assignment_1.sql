DROP DATABASE IF EXISTS extra_assignment;
CREATE DATABASE extra_assignment;
USE extra_assignment;
DROP TABLE IF EXISTS fresher_training_management;
CREATE TABLE fresher_training_management (
	trainee_id INT PRIMARY KEY AUTO_INCREMENT,
    fullname	VARCHAR(128) NOT NULL,
    birth_date	DATE,
    gender	ENUM('Male', 'Female', 'Unknown'),
    et_iq	INT CHECK (et_iq > 0 AND et_iq <= 20) NOT NULL,
    et_gmath	INT CHECK (et_gmath > 0 AND et_gmath <= 20) NOT NULL,
    et_english	INT CHECK (et_english > 0 AND et_english <= 50) NOT NULL,
    training_class	INT NOT NULL,
    evaluation_note	VARCHAR(255) 
);

ALTER TABLE fresher_training_management
ADD COLUMN vti_account INT NOT NULL UNIQUE KEY;

DROP TABLE IF EXISTS data_type1;
CREATE TABLE data_type1(
	id		MEDIUMINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	`name`	VARCHAR(255),
    `code`	CHAR(5),
    modified_date	TIMESTAMP
);
-- ENUM GENDER NEEDS NULL VALUE IN DATA TYPE
DROP TABLE IF EXISTS data_type2;
CREATE TABLE data_type2(
	id		MEDIUMINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	`name`	NVARCHAR(255),
    birth_date	DATE,
    gender	ENUM('0','1'),
    is_deleted_flag	ENUM('0', '1')
);
