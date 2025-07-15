# Write your MySQL query statement below
select product.product_name, sales.year, sales.price
from Sales sales
inner join Product product
on product.product_id = sales.product_id