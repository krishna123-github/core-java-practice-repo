/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  krishna
 * Created: 30-Nov-2022
 */

Select salary from employee where salary < (Select max(e1.salary) from employee e1)


SELECT DISTINCT P1.NAME AS CHILD,
       (SELECT NAME FROM PEOPLE PM WHERE ID=T.PID AND PM.GENDER='F') AS MOTHER,
       (SELECT NAME FROM PEOPLE PP WHERE ID=T.PID AND PP.GENDER='M') AS FATHER FROM 

(SELECT R.CID,NAME,R.PID,P.GENDER FROM PEOPLE P,RELATIONS R WHERE P.ID=R.PID) T
, PEOPLE P1
WHERE T.CID=P1.ID;

