USE testing_system_assignment;

-- lay ra tat ca cac phong ban
SELECT department_id, department_name
FROM department
ORDER BY department_id ASC;

-- lay ra ID cua cac phong Sale
SELECT department_id
FROM department
WHERE department_name = 'Sale';

-- lay ra thong tin account co fullname dai nhat
SELECT fullname, LENGTH(fullname)
FROM `account`
WHERE LENGTH(fullname) = (SELECT MAX(CHAR_LENGTH(fullname)) FROM `account`);

-- Lay ra ten group tham gia truoc ngay 20/12/2019

SELECT group_name, create_date
FROM `group`
WHERE create_date < '2019-12-20'
ORDER BY create_date DESC;

-- lay ra ID cua question co 4 answer
SELECT question_id, COUNT(answer_id) AS number_of_answer
FROM answer
GROUP BY question_id
HAVING COUNT(answer_id) >= 4
ORDER BY question_id ASC;

-- lay ra 5 group duoc tao gan nhat
SELECT *
FROM `group`
ORDER BY create_date ASC
LIMIT 5;

-- xoa tat ca exam duoc tao truoc ngay 20/12/2019
COMMIT;
DELETE FROM exam
WHERE create_date < '2019-12-20';
SELECT *
FROM exam;

-- update thong tin account co id = 5 thanh ten " Nguyen Ba Loc", va email thanh "loc.nguyenba@vti.com.vn"

COMMIT;
UPDATE `account`
SET fullname = 'Nguyen Ba Loc', email = 'loc.nguyenba@vti.com.vn'
WHERE account_id = 5;

SELECT *
FROM `account`;

-- 10 lay ra danh sach nhan vien va phong ban cua ho

SELECT a.account_id, a.username, a.department_id, d.department_name
FROM `account` a
LEFT JOIN department d ON a.department_id = d.department_id
GROUP BY a.department_id
ORDER BY a.account_id ASC;
-- 11 Lay ra tat ca cac Developer
SELECT * 
FROM position
WHERE position_name = 'Dev'
ORDER BY position_id ASC;
 
-- 12 danh sach phong ban co hon 3 nhan vien
SELECT  a.department_id, d.department_name, COUNT(a.account_id) AS number_of_account
FROM `account` a
JOIN department d ON a.department_id = d.department_id
GROUP BY a.department_id
HAVING COUNT(a.account_id) > 3;

SELECT * 
FROM `account`;
SELECT *
FROM department;

-- 13 danh sach cua hoi duoc su dung nhieu nhat trong de thi ----------------------------------------------------- lay ra nhieu hon ket qua
SELECT *
FROM exam_question
GROUP BY exam_id
HAVING COUNT(question_id) = MAX(question_id)
ORDER BY exam_id;
-- ???
SELECT 
    eq.exam_id, eq.question_id
FROM
    exam_question eq
        JOIN
    question q ON eq.question_id = q.question_id
GROUP BY exam_id
HAVING COUNT(eq.question_id) = MAX(eq.question_id);

-- 14 thong ke xem moi category_question su dung bao nhieu question
SELECT cq.category_id, cq.category_name, COUNT(q.question_id) AS Number_of_question
FROM category_question cq
LEFT JOIN question q ON cq.category_id = q.category_id
GROUP BY cq.category_id;

-- 15 lay ra question co nhieu cau tra loi nhat ---------------------------------------------

SELECT question_id, COUNT(answer_id) AS count_t
FROM answer
GROUP BY question_id
HAVING COUNT(answer_id) =  2;

-- 16 tim chuc vu co it nguoi nhat-----------------------------------------------
SELECT p.position_id, position_name
FROM position p 
JOIN 
(SELECT A.position_id, MIN(A._count) AS _min
FROM
( SELECT COUNT(account_id) AS _count, position_id
FROM `account`
GROUP BY position_id ) A) AS B ON p.position_id = B.position_id;

-- 17 thong ke moi phong ban co bao nhieu Dev, Test, Scrum Master, PM
SELECT 
    d.department_id,
    d.department_name,
    a.position_id,
    p.position_name,
    COUNT(p.position_name)
FROM
    department d
        JOIN
    `account` a ON d.department_id = a.department_id
        JOIN
    `position` p ON a.position_id = p.position_id
GROUP BY d.department_id
ORDER BY d.department_id;

-- 18 lay ra thong tin chi tiet cua mot cua hoi
SELECT q.*, a.*
FROM question q
LEFT JOIN answer a ON q.question_id = a.question_id;

-- 19 lay ra so luong cua moi loai cau hoi
SELECT type_name, COUNT(type_name)
FROM type_question
GROUP BY type_name;

   
 









