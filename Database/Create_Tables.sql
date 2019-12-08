CREATE TABLE Airports (
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
airport_name VARCHAR(255) NOT NULL,
iata VARCHAR(255) NOT NULL,
inserted TIMESTAMP default CURRENT_TIMESTAMP
); 

CREATE TABLE Users (
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
email VARCHAR(255),
hash_password VARCHAR(255) NOT NULL,
first_name VARCHAR(255) NOT NULL,
last_name VARCHAR(255),
mobile LONG,
role ENUM('superadmin','airline_admin','user'), 
airline VARCHAR(255),
inserted TIMESTAMP default CURRENT_TIMESTAMP
); 

CREATE TABLE Login (
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
token VARCHAR(255) NOT NULL,
login_time TIMESTAMP default CURRENT_TIMESTAMP,
status ENUM('active','inactive') NOT NULL,
user_id INT,

FOREIGN KEY fk_login_user_id(user_id)
REFERENCES Users(id)
ON UPDATE CASCADE
ON DELETE RESTRICT


);

CREATE TABLE Flights (
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
flight_no VARCHAR(255),
source_id INT,
destination_id INT, 
price FLOAT,
seats INT,
dep_time DATETIME,
arr_time DATETIME,
created_by INT,
created_on TIMESTAMP default CURRENT_TIMESTAMP,
last_modified_by INT,
last_modified_time TIMESTAMP,
FOREIGN KEY fk_source_id(source_id)
REFERENCES Airports(id)
ON UPDATE CASCADE
ON DELETE RESTRICT, 
FOREIGN KEY fk_dest_id(destination_id)
REFERENCES Airports(id)
ON UPDATE CASCADE
ON DELETE RESTRICT, 
FOREIGN KEY fk_created_by(created_by)
REFERENCES Users(id)
ON UPDATE CASCADE
ON DELETE RESTRICT, 
FOREIGN KEY fk_last_modified_by(last_modified_by)
REFERENCES Users(id)
ON UPDATE CASCADE
ON DELETE RESTRICT
); 



CREATE TABLE Transactions (
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
user_id INT,
flight_id INT,
status ENUM('in_progress','success','failed'),
inserted TIMESTAMP default CURRENT_TIMESTAMP,

FOREIGN KEY fk_user_id(user_id)
REFERENCES Users(id)
ON UPDATE CASCADE
ON DELETE RESTRICT,
FOREIGN KEY fk_flight_id(flight_id)
REFERENCES Flights(id)
ON UPDATE CASCADE
ON DELETE RESTRICT

);

CREATE TABLE Searchs (
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
source_id INT,
dest_id INT,
user_id INT,
inserted TIMESTAMP default CURRENT_TIMESTAMP,
FOREIGN KEY fk_searchs_user_id(user_id)
REFERENCES Users(id)
ON UPDATE CASCADE
ON DELETE RESTRICT,
FOREIGN KEY fk_searchs_source_id(source_id)
REFERENCES Airports(id)
ON UPDATE CASCADE
ON DELETE RESTRICT,
FOREIGN KEY fk_searchs_dest_id(dest_id)
REFERENCES Airports(id)
ON UPDATE CASCADE
ON DELETE RESTRICT
);

CREATE TABLE Booking (
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
flight_id INT,
pax VARCHAR(255),
user_id INT,
transaction_id INT,

FOREIGN KEY fk_booking_user_id(user_id)
REFERENCES Users(id)
ON UPDATE CASCADE
ON DELETE RESTRICT,
FOREIGN KEY fk_booking_flight_id(flight_id)
REFERENCES Flights(id)
ON UPDATE CASCADE
ON DELETE RESTRICT,
FOREIGN KEY fk_booking_transaction_id(transaction_id)
REFERENCES Transactions(id)
ON UPDATE CASCADE
ON DELETE RESTRICT

);