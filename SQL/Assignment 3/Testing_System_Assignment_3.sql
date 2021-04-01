USE testing_system_assignment;
-- 1 nhan vien phong sale
CREATE OR REPLACE VIEW sale_employee AS
SELECT a.account_id, a.username
FROM `account` a
JOIN department d ON a.department_id = d.department_id
WHERE d.department_name = 'Sale'
ORDER BY a.account_id;


-- 2 cac account tham gia vao nhieu group nhat
CREATE OR REPLACE VIEW account_in_group AS
SELECT MAX(_count), account_id
FROM
( SELECT account_id, COUNT(group_id) AS _count
FROM group_account
GROUP BY account_id ) AS A;

SELECT account_id, COUNT(group_id) AS _count
FROM group_account
GROUP BY account_id;

-- 3 cau hoi co content > 300 chu va xoa no di
CREATE OR REPLACE VIEW content_11 AS
    SELECT 
        *
    FROM
        question
    WHERE
        CHAR_LENGTH(content) > 11;
        
SELECT A.question_id
FROM	(SELECT * FROM testing_system_assignment.content_11) AS A ;

COMMIT;
DELETE FROM exam_question 
WHERE
    question_id IN (SELECT 
        A.question_id
    FROM
        (SELECT 
            *
        FROM
            testing_system_assignment.content_11) AS A);
            
COMMIT;
DELETE FROM answer 
WHERE
    question_id IN (SELECT 
        A.question_id
    FROM
        (SELECT 
            *
        FROM
            testing_system_assignment.content_11) AS A);
            
COMMIT;
DELETE FROM question 
WHERE
    question_id IN (SELECT 
        A.question_id
    FROM
        (SELECT 
            *
        FROM
            testing_system_assignment.content_11) AS A);
            
            
--  4 tao view chua ds cac phong ban co nhieu nhan vien nhat
CREATE OR REPLACE VIEW dept_with_max_employee AS
    SELECT 
        A.department_id, MAX(A._count), d.department_name
    FROM
        (SELECT 
            department_id, COUNT(account_id) AS _count
        FROM
            `account`
        GROUP BY department_id) AS A
            JOIN
        department d ON A.department_id = d.department_id;
        
-- 5 tao view chua tat ca cau hoi co chua user ho nguyen
CREATE OR REPLACE VIEW question_user_nguyen AS
    SELECT 
        q.*, a.username, a.fullname
    FROM
        question q
            JOIN
        `account` a ON q.creator_id = a.account_id
    WHERE
        a.fullname LIKE ('%nguyen%');
SELECT * FROM testing_system_assignment.question_user_nguyen;

    

