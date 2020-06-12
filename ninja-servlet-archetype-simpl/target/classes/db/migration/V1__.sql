-- the first script for migration


create table logindetail (
id bigint UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    idnumber varchar(20),
    name varchar(20),
    email varchar(20)
    
    
);

create table stock(
	id bigint UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    itemid int,
    itemname varchar(20),
    Quantity int,
    price int

);


