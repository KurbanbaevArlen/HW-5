package com.company;

public class HW {
    /*
select brand,model,price from cars;   --1

select count(brand) from cars;        --2

select * from cars where brand = 'Hyundai';--3

select * from cars where color in ('Blue','Red');--4

select * from cars where year_of_issue between '2000' and '2010'; --5

select count(brand) from cars where brand = 'Chevrolet';  --6

select AVG(year_of_issue) FROM cars; --7

select * from cars where brand in ('Audi', 'Toyota','Kia' ,'Ford');---8

select * from cars where model like 'T%';--9

select * from cars where model like '%e';--10

select * from cars where brand like '_____';--11

select sum(price) as mercedes_price from cars where brand = 'Mercedes-Benz'; --12

select MAX(price) AS max_price,MIN(price)as min_price  FROM cars; --13

select * from cars where brand not in('Toyota'); --14

select   MAX(price) as max_prices from cars HAVING count(brand) > 10;   --15??? бутуро албадым

select  * from cars where year_of_issue =  2010 and id = 5 or id = 15;  --16??? бутуро албадым

select * from cars where year_of_issue not between '1995' and '2005' order by year_of_issue;  --17

select color, count(*) as models_count from cars group by color order by count(*) desc limit 1; --18

     */
}
