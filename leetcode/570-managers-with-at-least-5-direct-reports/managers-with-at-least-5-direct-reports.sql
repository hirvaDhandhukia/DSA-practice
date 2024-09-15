# Write your MySQL query statement below
SELECT e.name AS name FROM (SELECT managerId
FROM employee
GROUP BY managerId 
HAVING COUNT(*) >= 5) m
JOIN employee e on m.managerId = e.id;