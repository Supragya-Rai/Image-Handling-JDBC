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

## 👨‍💻 Author

**Supragya Rai**

If you found this project helpful, feel free to ⭐ this repository.
