A desktop-based Employee Management System  developed using Java Swing and MySQL. The application provides a graphical interface for managing employee information with database connectivity.

## Features

* 🔐 User Login
* 👤 Add Employee
* ✏️ Update Employee Details
* 🗑️ Remove Employee
* 📋 View Employee Information
* 🏠 Home/Dashboard
* 🗄️ MySQL Database Connectivity
* 🎨 Custom Swing UI with styled buttons, borders, icons, and layouts

## Technologies Used

* **Java**
* **Java Swing**
* **JDBC**
* **MySQL**
* **MySQL Workbench**
* **NetBeans**
* **Git & GitHub**

## Project Structure

```text
Employee Management System
│
├── src/
│   └── employee/
│       └── management/
│           └── system/
│               ├── AddEmployee.java
│               ├── Con.java
│               ├── Home.java
│               ├── Login.java
│               ├── RemoveEmployee.java
│               ├── RoundedButton.java
│               ├── Splash.java
│               ├── UpdateEmployee.java
│               └── ViewEmployee.java
│
├── nbproject/
├── .gitignore
├── build.xml
└── manifest.mf
```

## Database

The application uses **MySQL** to store and manage employee information.

Database connectivity is handled using **JDBC** through the `Con.java` class.

Before running the application, configure the MySQL connection details in the database connection class according to your local MySQL setup.

## How to Run

### 1. Clone the repository

```bash
git clone https://github.com/tiwaripallavii0018/Employee-Management-System.git
```

### 2. Open the project

Open the project in **NetBeans IDE**.

### 3. Configure MySQL

Make sure MySQL is installed and running through MySQL Workbench or the MySQL server.

Create the required database and update the database credentials in `Con.java`.

### 4. Run the application

Run the project from NetBeans.

The application will launch with the login screen.

## Application Modules

### Login

Provides user authentication before accessing the employee management system.

### Add Employee

Allows users to enter and store new employee information in the database.

### Update Employee

Allows existing employee information to be modified.

### Remove Employee

Allows employee records to be deleted from the database.

### View Employee

Displays stored employee information.

