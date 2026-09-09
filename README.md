# 📚 BookStore – Before SOLID Principles

> 🏪 A simple Java-based BookStore application developed **before applying SOLID design principles**.

---

## 📌 Project Overview

The **BookStore** project is a console-based Java application developed to demonstrate the basic functionality of a bookstore system.

This version represents the **original implementation before SOLID principles are applied**. It is intentionally kept as the starting point for identifying design problems and later refactoring the system using SOLID principles.

The project allows users to manage books and perform basic bookstore operations through a simple console interface.

---

## 🎯 Project Purpose

The main purpose of this project is to:

* 🧩 Demonstrate the original procedural implementation
* 🔍 Identify maintainability and design problems
* 🛠️ Provide a baseline for SOLID refactoring
* 📖 Compare the system before and after applying SOLID principles
* 🎓 Support the requirements of **Pearson BTEC International Level 3 – Unit 20: Applied Programming and Design Principles**

---

## ✨ Main Features

| Feature              | Description                                   |
| -------------------- | --------------------------------------------- |
| 📖 Add Books         | Add new books to the bookstore                |
| 📋 View Books        | Display available books                       |
| 💰 Book Prices       | Store and display book prices                 |
| 🛒 Purchase Books    | Select books for purchase                     |
| 🧾 Purchase Records  | Keep track of selected books                  |
| 💻 Console Interface | Interact with the system through the terminal |

---

## 🛠️ Technologies Used

* ☕ **Java**
* 📦 **Maven**
* 🧠 **Object-Oriented Programming Concepts**
* 🖥️ **IntelliJ IDEA**
* 🔧 **Git & GitHub**

---

## 📂 Project Structure

```text
BookStore_before_SOLID/
│
├── 📄 .gitignore
├── 📄 pom.xml
│
├── 📁 .idea/
│   └── IntelliJ IDEA configuration files
│
└── 📁 src/
    └── 📁 main/
        └── 📁 java/
            └── 📁 org/
                └── 📁 example/
                    └── ☕ Main.java
```

---

## ⚙️ How to Run

### 1️⃣ Clone the repository

```bash
git clone https://github.com/adeeshabhanukahettiarachchi-hub/BookStore_before_SOLID.git
```

### 2️⃣ Open the project

Open the project using **IntelliJ IDEA** or another Java-compatible IDE.

### 3️⃣ Build the project

Using Maven:

```bash
mvn clean install
```

### 4️⃣ Run the application

Run:

```text
Main.java
```

The application will start in the console.

---

## 🧪 Example Application Flow

```text
=================================
        📚 BOOK STORE
=================================

1. Add Book
2. View Books
3. Purchase Book
4. View Purchases
5. Exit

Enter your choice:
```

---

## ⚠️ Current Design Limitations

Since this is the **Before SOLID** version, the application contains several design limitations that can make future development more difficult.

### 🔴 High Responsibility

A single class contains multiple responsibilities such as:

* 📖 Book management
* 🛒 Purchase management
* 💻 User interaction
* 💾 Data handling

### 🔴 Tight Coupling

Different parts of the application are closely connected, making individual components harder to modify independently.

### 🔴 Difficult Maintenance

Changes to one functionality may require modifications in several parts of the code.

### 🔴 Limited Extensibility

Adding new functionality can require changes to existing code instead of simply adding new components.

### 🔴 Poor Separation of Concerns

Business logic, data handling and user-interface logic are not clearly separated.

---

## 🔄 SOLID Refactoring

This project acts as the **baseline implementation** for a later refactoring process.

The next version of the project will apply the five SOLID principles:

| Principle                                  | Meaning                                                           |
| ------------------------------------------ | ----------------------------------------------------------------- |
| 🟢 **S – Single Responsibility Principle** | A class should have one main responsibility                       |
| 🔵 **O – Open/Closed Principle**           | Software should be open for extension but closed for modification |
| 🟣 **L – Liskov Substitution Principle**   | Subtypes should be replaceable for their base types               |
| 🟠 **I – Interface Segregation Principle** | Classes should not depend on interfaces they do not use           |
| 🔴 **D – Dependency Inversion Principle**  | High-level modules should depend on abstractions                  |

---

## 📊 Before vs After

```text
        BEFORE SOLID
              │
              ▼
     ┌─────────────────┐
     │   Main.java     │
     │                 │
     │ Book Management │
     │ Purchase Logic  │
     │ User Input      │
     │ Data Handling   │
     └─────────────────┘
              │
              ▼
       Tight Coupling
```

After refactoring, responsibilities will be separated into appropriate classes and abstractions.

---

## 🎓 Academic Context

This project was developed as part of:

**Pearson BTEC International Level 3 in Information Technology**

**Unit 20 – Applied Programming and Design Principles**

The project is used as the **original implementation** for analysing software design issues and demonstrating improvements achieved through the application of SOLID principles.

---

## 👨‍💻 Author

**Adeesha Bhanuka Hettiarachchi**

💻 Software Engineering Student
📚 BTEC International Level 3 in Information Technology

---

## 📜 License

This project is developed for **educational and academic purposes**.

---

⭐ **BookStore – Before SOLID**

> 🚀 Starting point for improving software design through SOLID principles.
