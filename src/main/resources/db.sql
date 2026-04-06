CREATE DATABASE sociomart;

USE sociomart;

CREATE TABLE users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(100),
    phone VARCHAR(15),
    society_name VARCHAR(100),
    society_token VARCHAR(50),
    address TEXT,
    role VARCHAR(20)
);