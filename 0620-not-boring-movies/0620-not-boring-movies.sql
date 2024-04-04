/* Write your PL/SQL query statement below */

select * 

from Cinema 

where  mod(id,2)=1 and description !='boring'

ORDER BY rating desc;