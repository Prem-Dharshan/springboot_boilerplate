-- Create the database if it does not already exist
CREATE DATABASE IF NOT EXISTS sb_boilerplate;

-- Use the newly created or existing database
USE sb_boilerplate;

-- Create the table for storing organization data
CREATE TABLE IF NOT EXISTS t_organization (
                                              id INT AUTO_INCREMENT PRIMARY KEY,
                                              name VARCHAR(64) NOT NULL,
                                              description TEXT

);

-- Grant privileges to the specified user
-- Replace 'root' and 'psg@123' with your actual username and password
# GRANT ALL PRIVILEGES ON sb_boilerplate.* TO 'root'@'localhost' IDENTIFIED BY 'psg@123';
#
# -- Apply the privileges
# FLUSH PRIVILEGES;
