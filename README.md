# IT-3003-Student-Database
# Student Database App

A simple Java application to manage student records using MySQL.  
The app allows you to **Add, View, Update, and Delete** student details from the database.

---

## Features

- Add new students
- View all students
- Update existing students
- Delete students
- Console-based interactive menu

---

## Technical Requirements

- Java 8 or later
- MySQL database (or XAMPP MySQL)
- MySQL Connector/J (JDBC driver)

---

## Setup Instructions

1. **Install MySQL** or start **XAMPP** and ensure MySQL is running.  
2. **Import the database**:
   - Open `phpMyAdmin` (http://localhost/phpmyadmin)  
   - Click **Import**, choose `database.sql`, and execute  
   - This will create `studentdb` and the `students` table with sample data

3. **Download JDBC driver**:  
   - [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)  
   - Place the `.jar` file in your project folder

4. **Configure DBConnection.java**:  
   ```java
   private static final String DB_URL = "jdbc:mysql://localhost:3306/studentdb";
   private static final String DB_USERNAME = "root";
   private static final String DB_PASSWORD = ""; // empty if default
