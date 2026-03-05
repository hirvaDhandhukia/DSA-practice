-- select name from Customer 
-- where not referee_id = 2 or referee_id is null

-- can't use '=' with null condition

select name from Customer 
where referee_id != 2 or referee_id is null
