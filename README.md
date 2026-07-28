#  Library Management System

A Java-based library management application designed to simplify common library operations such as managing books, tracking availability, and supporting interactions between librarians and members.

This project demonstrates how software can be used to solve everyday administrative challenges by replacing manual record-keeping with a structured, object-oriented system.

> **Portfolio Note:** This project was originally developed as part of my Higher Certificate in Information Systems coursework and has since been refined as part of my professional portfolio.

##  Overview

The Library Management System is designed to simulate the core operations of a library.

The application allows librarians to manage books while members can browse and borrow available books. The project demonstrates the use of Java classes, inheritance, exception handling, collections, and Object-Oriented Programming concepts.

---
## The Problem

Small libraries that rely on manual record-keeping can face challenges such as:

- Difficulty tracking available books
- Time-consuming borrowing and return processes
- Human error when maintaining records
- Limited organization of library resources

These issues can make it harder for librarians to manage collections efficiently and provide a good experience for members.

## The Solution

This application provides a simple, menu-driven system that enables librarians and members to perform common library tasks through a structured console interface.

Key capabilities include:

- Managing library books
- Viewing available books
- Borrowing books
- Returning books
- Separating librarian and member functionality
- Preventing invalid operations through exception handling

## Skills Demonstrated

This project demonstrates practical software development skills, including:

- Object-Oriented Programming (OOP)
- Class design and code organization
- Custom exception handling
- Problem decomposition
- Console application development
- Java programming

## Features

### Librarian

- View all books
- Add new books
- Remove books
- Manage library inventory

### Member

- Login as a member
- View available books
- Borrow books
- Return books

### General

- Console-based interface
- Menu-driven navigation
- Object-Oriented design
- Exception handling
- Data validation

---

## Technologies Used

- Java
- Apache NetBeans IDE
- Object-Oriented Programming (OOP)

---

## Project Structure



```text
LibraryManagementSystem/
│
├── src/
│   ├── Book.java
│   ├── BookNotAvailableException.java
│   ├── Librarian.java
│   ├── LibrarySystem.java
│   ├── Member.java
│   └── User.java
│
├── test/
│
├── nbproject/
│   ├── private/
│   ├── build-impl.xml
│   ├── genfiles.properties
│   ├── project.properties
│   └── project.xml
│
├── build/
│
├── build.xml
└── manifest.mf
```

---

## Getting Started

### Prerequisites

Before running the project, ensure you have:

- Java Development Kit (JDK 17 or later recommended)
- Apache NetBeans IDE

---

### Installation

Clone the repository

```bash
git clone https://github.com/Hope-sketch/library-management-system-java.git
```

Navigate to the project folder

```bash
cd library-management-system-java
```

Open the project in Apache NetBeans.

Select:

```
File
→ Open Project
```

Choose the **LibraryManagementSystem** folder.

Run the project.

---

## Running the Application

Once the project is opened in NetBeans:

1. Clean and Build the project.
2. Click **Run Project** (F6).
3. Follow the prompts displayed in the console.

---



After running the project, the application starts with the following menu:

```text
===== LIBRARY MANAGEMENT SYSTEM =====

1. Login as Librarian
2. Login as Member
3. Exit

****************************************
```it
```
Select one of the available options to continue.
---

##  Concepts Demonstrated

This project demonstrates:

- Object-Oriented Programming
- Encapsulation
- Inheritance
- Polymorphism
- Exception Handling
- Collections
- Menu-driven applications
- User interaction through the console

---

##  Screenshots

Screenshots will be added in a future update.

---

##  Future Improvements

Potential enhancements include:

- Graphical User Interface (GUI)
- Database integration using MySQL or SQL Server
- User authentication
- Password encryption
- Search functionality
- Book reservations
- Due date tracking
- Fine calculation
- Reporting system

---

##  Learning Outcomes

Through this project, I gained practical experience with:

- Designing object-oriented applications
- Structuring Java projects
- Creating reusable classes
- Working with collections
- Implementing exception handling
- Building console applications
- Applying software development best practices

---

## Author

**Njabulo Hope Makana**

Aspiring Software Developer

-  Portfolio: https://hope-sketch.github.io/NjabuloHopeMakanaPortfolio/
-  GitHub: https://github.com/Hope-sketch

---

## License

This project is shared for educational and portfolio purposes.

Please do not submit this work as your own academic assignment.

---

## Please Support

If you found this project interesting, consider giving it a star on GitHub.

Feedback and suggestions are always welcome.
