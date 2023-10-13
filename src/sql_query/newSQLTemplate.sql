/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  krishna
 * Created: 09-Oct-2022
 */
-- 1. Find second highest salary of employee
SELECT up.* FROM demo_db.user up
WHERE  up.salary = (SELECT max(u.salary) from demo_db.user u 
                     WHERE u.salary NOT IN (select max(u1.salary) from user u1) )

-- OR
SELECT up.* FROM demo_db.user up
WHERE  up.salary = (SELECT max(u.salary) from demo_db.user u 
                     WHERE u.salary < (select max(u1.salary) from user u1) )


-- 2. Employee Table -- Id -- Name -- Salary -- Department id Find one employee from each department who is getting the highest salary within his department. Discuss further on server side pagination, boundary cases like 2 emp getting the same salary in the same department which is highest etc.
-- Knows about server side pagination
-- Able to provide query for the problem including the boundary cases - like 2 employees getting same salary in a department which is highest.
-- Knows group by and inner queries
SELECT DeptID, MAX(Salary) FROM EmpDetails GROUP BY DeptID

-- Get Employee of highest salary
SELECT e.depId, e.name, e.salary FROM employee e
INNER JOIN 
(SELECT depId, MAX(Salary) salary FROM employee GROUP BY depID) e2
ON(e2.depId = e.depId AND e2.salary = e.salary)