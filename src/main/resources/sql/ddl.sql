
-- Create Schema --
CREATE DATABASE IF NOT EXISTS covid;
SET @@global.time_zone='+00:00';

ALTER USER 'root'@'localhost' IDENTIFIED BY 'covidpassword';

#Stop and Start MySql DB for changes to reflect

USE covid;

DROP TABLE IF EXISTS `covid`.`users`;

-- Create users table -- 

CREATE TABLE `covid`.`users` (
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NULL,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `phone` INT NULL,
  PRIMARY KEY (`username`));
  
  
  -- Create facility table -- 

CREATE TABLE `covid`.`facility` (
  `id` MEDIUMINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `companyname` VARCHAR(100) NULL,
  `address` VARCHAR(100) NOT NULL,
  `bedcapacity` INT NULL,
  `inspectiondate` TIMESTAMP NULL,
  `status` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
  
  
--  Facility Audit Tables --    

CREATE TABLE `covid`.`facilityAudit` (
  `id` MEDIUMINT NOT NULL AUTO_INCREMENT,
  `facilityid` MEDIUMINT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `companyname` VARCHAR(100) NULL,
  `address` VARCHAR(100) NOT NULL,
  `bedcapacity` INT NULL,
  `inspectiondate` TIMESTAMP NULL,
  `status` VARCHAR(45) NOT NULL,
   `modifiedby` VARCHAR(45) NULL,
   `modifieddate` TIMESTAMP NULL,
  PRIMARY KEY (`id`));
  