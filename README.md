# 🖼️ Image Storage Using JDBC

A simple Java project that demonstrates how to store an image in a MySQL database using JDBC.

## 📌 Features

- Connects to MySQL using JDBC
- Loads MySQL JDBC Driver
- Reads an image from the local system
- Stores the image as a BLOB in the database
- Uses `PreparedStatement` to prevent SQL Injection
- Handles database resources using exception handling

## 🛠️ Technologies Used

- Java
- JDBC
- MySQL
- IntelliJ IDEA

## 📂 Project Structure

```
ImageThroughJDBC/
│── src/
│   └── imagethroughjdbc.java
│── README.md
```

## 🗄️ Database Setup

Create a database:

```sql
CREATE DATABASE image_table;
```

Create a table:

```sql
CREATE TABLE images (
    id INT PRIMARY KEY AUTO_INCREMENT,
    image LONGBLOB
);
```

## ⚙️ Configuration

Update the database credentials in the Java file.

```java
String url = "jdbc:mysql://localhost:3306/image_table";
String username = "root";
String password = "your_password";
```

Also update the image path according to your system.

```java
FileInputStream fis = new FileInputStream("path_to_image");
```

## ▶️ How to Run

1. Clone this repository.
2. Open the project in IntelliJ IDEA.
3. Add the MySQL Connector/J JAR to the project.
4. Start the MySQL server.
5. Create the database and table.
6. Update the database credentials.
7. Run the Java program.

## 📷 Working

- Establishes a connection with MySQL.
- Reads the selected image from the local machine.
- Stores the image into the database as a BLOB.
- Displays a success message after insertion.

## 🚀 Future Improvements

- Retrieve and display stored images.
- Store multiple images.
- Add image upload using Swing or JavaFX.
- Integrate with Spring Boot REST APIs.
- Add image compression before storage.


# 💳 JDBC Transaction Handling System

A Java project demonstrating **database transaction management** using JDBC and MySQL. This project simulates a secure bank fund transfer between two accounts while maintaining data consistency using **Commit** and **Rollback** operations.

---

## 🚀 Features

- Transfer money between two bank accounts
- Uses JDBC for database connectivity
- MySQL database integration
- Transaction management using `setAutoCommit(false)`
- Commit transaction when both operations succeed
- Rollback transaction if any operation fails
- Uses `PreparedStatement` to prevent SQL Injection

---

## 🛠️ Technologies Used

- Java
- JDBC
- MySQL
- IntelliJ IDEA

---

## 📂 Project Structure

```
TransactionHandling/
│── transactionHandling.java
│── README.md
```

---

## 🗄️ Database Schema

### Database

```sql
CREATE DATABASE mydata;
```

### Table

```sql
CREATE TABLE account(
    id INT PRIMARY KEY AUTO_INCREMENT,
    account_No VARCHAR(20) UNIQUE,
    account_Holder VARCHAR(100),
    balance DECIMAL(10,2) UNSIGNED
);
```

### Sample Data

```sql
INSERT INTO account(account_No, account_Holder, balance)
VALUES
('123456789876','Alice',50000),
('123454329876','Bob',30000);
```

---

## ⚙️ How It Works

1. Establishes a connection with the MySQL database.
2. Disables auto-commit mode.
3. Deducts money from the sender's account.
4. Credits money to the receiver's account.
5. If both queries execute successfully:
   - Commit the transaction.
6. Otherwise:
   - Rollback the transaction.

---

## 📸 Transaction Flow

```
Start Transaction
        │
        ▼
Withdraw Amount
        │
        ▼
Deposit Amount
        │
        ▼
 ┌───────────────┐
 │ Both Success? │
 └───────┬───────┘
         │
   Yes   │   No
         │
         ▼
     Commit
         │
         ▼
   Transaction Successful

         OR

      Rollback
         │
         ▼
    Transaction Failed
```

---

## ▶️ How to Run

1. Clone the repository

```bash
git clone <repository-link>
```

2. Open the project in IntelliJ IDEA.

3. Create the MySQL database and table.

4. Update the database credentials inside the Java file.

```java
private static String url = "jdbc:mysql://localhost:3306/mydata";
private static String username = "root";
private static String password = "your_password";
```

5. Add the MySQL JDBC Driver.

6. Run `transactionHandling.java`.

---

## 📚 Concepts Covered

- JDBC
- Database Transactions
- Commit
- Rollback
- Auto Commit
- PreparedStatement
- SQL Update Queries
- Exception Handling
- MySQL Connectivity

---

## 🎯 Future Improvements

- Check for insufficient balance before withdrawal
- Custom transfer amount using user input
- Transaction history
- Account authentication
- Logging
- GUI using Java Swing or JavaFX
- Spring Boot REST API version

---

## 👨‍💻 Author

**Supragya Rai**

If you found this project helpful, feel free to ⭐ the repository.
