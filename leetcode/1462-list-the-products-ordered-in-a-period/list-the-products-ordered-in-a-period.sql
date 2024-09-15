# Write your MySQL query statement below
WITH ans AS
(SELECT product_id, SUM(unit) AS feb
FROM Orders 
WHERE YEAR(order_date) = 2020
AND MONTH(order_date) = 2
GROUP BY product_id) SELECT p.product_name, feb AS unit
FROM ans a 
LEFT JOIN Products p
ON a.product_id = p.product_id
WHERE feb >= 100