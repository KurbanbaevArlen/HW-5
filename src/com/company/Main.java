package com.company;

public class Main {

    public static void main(String[] args) {
        /*
CREATE TABLE products (
    id SERIAL PRIMARY KEY,
     product_name VARCHAR(30) NOT NULL,
     company VARCHAR(20) NOT NULL,
      product_count INT DEFAULT 0,
       price NUMERIC NOT NULL,
         isDiscounted BOOL);

INSERT INTO products (product_name, company, product_count, price, isDiscounted)
VALUES ('iPhone X', 'Apple', 3, 76000, false),
       ('iPhone 8', 'Apple', 2, 71000, true),
       ('iPhone 7', 'Apple', 5, 42000, true),
       ('Galaxy S9', 'Samsung', 2, 46000, false),
       ('Galaxy S8 Plus', 'Samsung', 1, 56000, true),
       ('Desire 12', 'HTC', 5, 28000, true),
       ('Wildfire E2 Plus','HTC',3,20000,false),
       ('Wildfire E3','HTC',1,30000,true),
       ('Nokia 9', 'HMD Global', 6, 38000, true);


select company, price from products where company = 'Apple' and price < 75000;

select * from products where price >= 46000;

select * from products where price > 56000;

select product_name from products where price < 25000;

SELECT MIN(price) as min_price FROM products WHERE company like '%';

select * from products where not isDiscounted;

select * from products where isDiscounted;

select * from products  order by price desc;

select SUM(price) FROM products;

select * from products where  product_count <= 2 order by company;
         */
    }
}
