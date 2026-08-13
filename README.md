# Employee Management System

A desktop-based **Employee Management System** developed using **Java Swing** with **MySQL database connectivity through JDBC**.

The application provides a graphical interface for managing employee records and performing essential employee management operations such as adding, viewing, updating, and removing employee information.

## ✨ Features

* 🔐 **Login System** for controlled access
* 👤 **Add Employee** with employee details
* 📋 **View Employee** information
* ✏️ **Update Employee** details
* 🗑️ **Remove Employee** records
* 🗄️ **MySQL Database Integration** using JDBC
* 🎨 Custom graphical user interface using Java Swing
* 🖼️ Custom buttons, icons, and UI components
* 🏠 Dedicated home/dashboard screen
* ⚡ Splash screen for application startup

## 🛠️ Technologies Used

| Technology          | Usage                        |
| ------------------- | ---------------------------- |
| **Java**            | Core application development |
| **Java Swing**      | Graphical User Interface     |
| **JDBC**            | Database connectivity        |
| **MySQL**           | Data storage                 |
| **MySQL Workbench** | Database management          |
| **NetBeans**        | Development environment      |
| **Git & GitHub**    | Version control              |

## 🏗️ Application Structure

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

## 🗃️ Database

The application uses **MySQL** for storing employee information.

Database connectivity is implemented using **JDBC**, with the connection handled through:

```text
Con.java
```

### Database Setup

1. Install MySQL Server and MySQL Workbench.
2. Create the database required by the application.
3. Create the required employee table(s).
4. Open:

```text
src/employee/management/system/Con.java
```

5. Update the database connection details according to your local MySQL configuration.

For example:

```java
Connection c = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/YOUR_DATABASE",
    "YOUR_USERNAME",
    "YOUR_PASSWORD"
);
```

> Replace the database name, username, and password with your own local configuration.

## 🚀 How to Run

### Prerequisites

Make sure you have:

* Java JDK installed
* MySQL Server installed
* MySQL Workbench installed
* NetBeans IDE installed

### 1. Clone the Repository

```bash
git clone https://github.com/tiwaripallavii0018/Employee-Management-System.git
```

### 2. Open in NetBeans

Open **NetBeans IDE** and select:

```text
File → Open Project
```

Select the cloned `Employee-Management-System` folder.

### 3. Configure MySQL

Start your MySQL server and configure the database credentials inside:

```text
Con.java
```

Make sure the database and required tables exist before running the application.

### 4. Run the Application

Run the project from NetBeans.

The application starts with the **Splash Screen** and then proceeds to the **Login Screen**.

## 📱 Application Modules

### 🔐 Login

Provides a login interface before accessing the employee management system.

### 🏠 Home

Acts as the main dashboard from which different employee management operations can be accessed.

### 👤 Add Employee

Allows users to enter employee details and store them in the database.

### 📋 View Employee

Displays employee information stored in the database.

### ✏️ Update Employee

Allows existing employee information to be modified.

### 🗑️ Remove Employee

Allows employee records to be removed from the database.

## 🔄 CRUD Operations

The system implements the core **CRUD** operations:

```text
Create  → Add Employee
Read    → View Employee
Update  → Update Employee
Delete  → Remove Employee
```

## 🎨 User Interface

The application is built using **Java Swing** and includes customized UI elements such as:

* Custom rounded buttons
* Icons
* Multiple application screens
* Form-based employee management
* Navigation between modules
* Splash screen


GitHub: [@tiwaripallavii0018](https://github.com/tiwaripallavii0018)

---

⭐ **If you find this project useful, consider giving it a star!**
