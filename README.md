# StudentCurdApp

## Description
StudentCurdApp is a Java-based CRUD (Create, Read, Update, Delete) application designed to manage student records using JDBC. It follows a layered architecture with a DAO (Data Access Object) pattern to ensure clean separation of concerns. The application interacts with a MySQL database for data storage and retrieval.

## Features
- Add new student records
- Retrieve student details
- Update existing student information
- Delete student records
- Uses JDBC for database connectivity
- Implements DAO and service layers for better modularity

## Technologies Used
- Java (JDK 21)
- MySQL Database
- JDBC (Java Database Connectivity)
- DAO Design Pattern
- IntelliJ IDEA (Development Environment)

## Project Structure
```
StudentCurdApp/
│── src/
│   ├── daofactory/
│   │   ├── StudentDaoFactory.java
│   ├── IStudentService/
│   │   ├── StudentServiceFactory.java
│   ├── JDBC/
│   │   ├── application2.properties
│   │   ├── JDBCStandardApp2.java
│   ├── JDBC_CURD_APP_Controller/
│   │   ├── TestApp.java
│   ├── JDBC_CURD_APP_dto/
│   │   ├── Student.java
│   ├── JDBC_CURD_APP_Persistence/
│   │   ├── IStudentDao.java
│   │   ├── StudentDaoImpl.java
│   ├── JDBC_CURD_APP_Service/
│   │   ├── IStudentService.java
│   │   ├── StudentServiceImpl.java
│── External Libraries/
│   ├── mysql-connector-j-9.1.0.jar
│── .gitignore
│── StudentCurdApp.iml
```

## Setup and Installation
1. Install Java JDK 21 and MySQL database.
2. Clone this repository or download the source code.
3. Configure the `application2.properties` file with your database credentials.
4. Add the MySQL Connector JAR to your project.
5. Run `TestApp.java` to start the application.

## Database Configuration
Ensure you have a MySQL database set up and create a `students` table using the following schema:
```sql
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    email VARCHAR(100)
);
```

## Author
**Ujjwal Dethe**


