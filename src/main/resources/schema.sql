DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS deal;
DROP TABLE if EXISTS car;
DROP TABLE IF EXISTS ads;

CREATE TABLE car(
id int AUTO_INCREMENT PRIMARY KEY ,
plate_number VARCHAR(25) NOT NULL UNIQUE,
color VARCHAR(50),
model  VARCHAR(50) NOT NULL,
year INT NOT NULL CHECK (year > 1900));


CREATE TABLE user(
id int AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(20) NOT NULL ,
surname VARCHAR(50),
contact VARCHAR(255) NOT NULL);

CREATE TABLE deal(
id int AUTO_INCREMENT PRIMARY KEY ,
ads_id INT NOT NULL
);

CREATE TABLE ads(
id int AUTO_INCREMENT PRIMARY KEY ,
user_id INT NOT NULL  ,
car_id  INT NOT NULL,
price INT NOT NULL check (price > 0) ,
deal_id INT ,
FOREIGN KEY(user_id)  REFERENCES user(ID),
FOREIGN KEY (deal_id) REFERENCES deal(ID),
FOREIGN KEY (car_id) REFERENCES car(ID),
UNIQUE(car_id, deal_id));

ALTER TABLE deal ADD CONSTRAINT ads_id FOREIGN KEY(ads_id) REFERENCES ads(ID);