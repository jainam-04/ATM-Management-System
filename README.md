# ATM Management System

This is a simple **ATM Management System** built using **Java AWT**, **Swing**, **JDBC** for database connectivity, and **MySQL** for data storage. The application allows users to simulate basic ATM functionalities such as account creation, withdrawal, deposit, balance inquiry, and more.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Contributing](#contributing)

## Features

- **Login Authentication**: User can log in with their credentials.
- **Account Management**: Create, delete, and manage user accounts.
- **Balance Inquiry**: Check account balance.
- **Withdrawal & Deposit**: Perform cash withdrawal and deposit operations.
- **Transaction History**: View history of all transactions.
- **Fast Cash**: Withdraw a predefined amount of cash in single click.
- **Pin Change**: Users can update their atm pin to enhance account security.
- **Exit**: Log out and exit the system securely.

## Technologies Used

- **Java AWT and Swing**: For creating the user interface.
- **JDBC (Java Database Connectivity)**: For database connectivity with MySQL.
- **MySQL**: For data storage and management.


## Setup Instructions

### Prerequisites

- **Java Development Kit (JDK)** installed.
- **MySQL** installed and running.
- A MySQL client or command line to create and manage the database.

### Steps

1. **Clone the repository:**

    ```bash
    git clone https://github.com/jainam-04/ATM-Management-System.git
    ```

2. **Set up the MySQL database:**
  - Create a new database in MySQL:
       ```sql
      CREATE DATABASE atm_management;
      ```

  - Use the following schema to create the necessary tables for the system:
      ```sql
        USE atm_management;

        CREATE TABLE bank (
            pin VARCHAR(10) NOT NULL,
            date PRIMARY KEY VARCHAR(50) NOT NULL,
            type VARCHAR(20) NOT NULL,
            amount VARCHAR(10) NOT NULL
        );

        CREATE TABLE login (
            formNo PRIMARY KEY VARCHAR(10) NOT NULL,
            cardNo VARCHAR(20) NOT NULL,
            pin VARCHAR(10) NOT NULL
        );

        CREATE TABLE signup (
            formNo PRIMARY KEY VARCHAR(10) NOT NULL,
            name VARCHAR(45) NOT NULL,
            fathername VARCHAR(45) NOT NULL,
            dob VARCHAR(20) NOT NULL,
            gender VARCHAR(10) NOT NULL,
            email VARCHAR(50) NOT NULL,
            marriedStatus VARCHAR(10) NOT NULL,
            address VARCHAR(50) NOT NULL
            city VARCHAR(20) NOT NULL,
            pin VARCHAR(10) NOT NULL,
            state VARCHAR(20) NOT NULL
        );

      CREATE TABLE signup2 (
            formNo PRIMARY KEY VARCHAR(10) NOT NULL,
            religion VARCHAR(20) NOT NULL,
            category VARCHAR(20) NOT NULL,
            income VARCHAR(10) NOT NULL,
            education VARCHAR(20) NOT NULL,
            occupation VARCHAR(20) NOT NULL,
            panNo VARCHAR(20) NOT NULL,
            aadharNo VARCHAR(15) NOT NULL,
            seniorCitizen VARCHAR(10) NOT NULL,
            existingAccount VARCHAR(10) NOT NULL
      );

      CREATE TABLE signup3 (
            formNo PRIMARY KEY VARCHAR(10) NOT NULL,
            accountType VARCHAR(30) NOT NULL,
            cardNo VARCHAR(20) NOT NULL,
            pin VARCHAR(10) NOT NULL,
            facility VARCHAR(100) NOT NULL
      );
    ```

  3. **Configure database connection:**
     
     - In your Java project, update the **JDBC** connection settings in your code to connect to the MySQL database.

       ```java
        String url = "jdbc:mysql://localhost:3306/atm_management";
        String username = "your_mysql_username";
        String password = "your_mysql_password";
        ```

  4. **Compile and run the project:**

      - Use your IDE (like Eclipse or IntelliJ IDEA) or the terminal to compile and run the project.

        ```bash
          javac -cp ".:mysql-connector-java-8.0.XX.jar" ATMSystem.java
          java -cp ".:mysql-connector-java-8.0.XX.jar" ATMSystem
        ```

## Usage

1. **Login**: Enter your account number and PIN to log in.
2. **Balance Inquiry**: View your current balance.
3. **Withdrawal**: Withdraw an amount from your account (ensure sufficient balance).
4. **Deposit**: Deposit an amount to your account.
5. **Transaction History**: View all past transactions.
6. **Log out**: Securely exit the system.

## Screenshots

  1. **Login Screen**
  
      ![Login](https://github.com/user-attachments/assets/f2c3132f-963e-4207-9bf2-694ff7678fe9)
  
  2. **Main Screen**

      ![MainScreen](https://github.com/user-attachments/assets/4f02c590-64d8-4943-a436-0df61070fa4d)

  3. **Deposit**
  
      ![Deposit](https://github.com/user-attachments/assets/c051a3c4-c901-4995-b2ed-b7c3fea8caf4)
  
  4. **Withdrawal**
  
      ![Withdrawal](https://github.com/user-attachments/assets/d3b851c9-cbc4-4c39-ba70-2d91afd240a9)
  
  5. **Balance**
  
      ![Balance](https://github.com/user-attachments/assets/485a8fc2-1088-49ba-887b-673bf71f9f4d)
  
  6. **Mini-Statement**
  
      ![MiniStatement](https://github.com/user-attachments/assets/d5649fd8-f407-457c-9718-337e8c026bdd)
  
  7. **Fast Cash**
  
      ![FastCash](https://github.com/user-attachments/assets/9e772b46-eeb7-425c-a8eb-92371c0d1757)
  
  8. **Change Pin**
  
      ![ChangePin](https://github.com/user-attachments/assets/a3353dbb-e898-4a77-bfc8-ef0fb4adab23)

## Contributing

  Contributions are welcome! Please open an issue or submit a pull request for any bugs or features.


