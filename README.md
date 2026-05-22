# Library Management System

A simple console-based Library Management System developed using Core Java and Java Collections Framework.

This project is designed for beginners to understand how backend applications work internally using programming logic, collections, objects, and CRUD operations.

The main goal of this project is not only to manage books, but also to understand how real backend systems handle data and business logic.

---

# Features

- Add Book
- View Books
- Search Book
- Issue Book
- Return Book
- Delete Book

---

# Technologies Used

- Java
- OOPs Concepts
- ArrayList
- Scanner Class

---

# Project Structure

```text
src/
 └── com.library
      ├── Book.java
      └── LibraryManagement.java
```

---

# Project Flow

```text
User Input
    ↓
Menu Selection
    ↓
Business Logic Execution
    ↓
Data Stored in ArrayList
    ↓
Output Displayed in Console

<img width="1920" height="1020" alt="image" src="https://github.com/user-attachments/assets/4659a539-3aae-43ac-9544-f023bdd594dd" />

```

---

# File Explanation

## 1. Book.java

This class represents a single book object.

Each object contains:

- Book ID
- Book Name
- Author Name
- Book Status

Example:

```java
int id;
String name;
String author;
boolean issued;
```

---

## Why this class is created?

Instead of creating multiple separate variables again and again, we create one reusable blueprint called `Book`.

This follows:
- Object-Oriented Programming
- Real-world object modeling

Example:

```java
Book b = new Book(1, "Java", "James");
```

This creates a real book object in memory.

---

# Constructor Explanation

```java
public Book(int id, String name, String author)
```

Purpose:
- Initializes book object values
- Automatically assigns data during object creation

Without constructor:
- Values must be assigned manually

---

# Boolean issued Variable

```java
boolean issued;
```

Purpose:
- Tracks whether a book is available or issued

Example:

| Value | Meaning |
|---|---|
| true | Book is issued |
| false | Book is available |

This introduces an important backend concept called:

```text
State Management
```

Real applications also manage object states like:
- Order Delivered
- Payment Pending
- Seat Booked
- Product Available

---

# display() Method

```java
public void display()
```

Purpose:
- Prints book information

Why created?
- Avoids duplicate printing code
- Improves code reusability

---

# 2. LibraryManagement.java

This is the main application class.

It controls the entire application flow.

Responsibilities:
- Taking user input
- Managing books
- Executing CRUD operations
- Handling business logic

---

# Scanner Explanation

```java
Scanner sc = new Scanner(System.in);
```

Purpose:
- Takes input from user

Without Scanner:
- User cannot interact with application

---

# ArrayList Explanation

```java
ArrayList<Book> books = new ArrayList<>();
```

Purpose:
- Stores multiple book objects dynamically

Why ArrayList?

Because:
- Size grows dynamically
- Easy to add/remove/search objects

---

# Real-World Understanding

In this project:
```text
ArrayList stores data temporarily
```

In real backend applications:
```text
Database stores data permanently
```

But logic remains almost same.

---

# while(true) Loop

```java
while(true)
```

Purpose:
- Keeps application running continuously

Without loop:
- Program stops after one operation

This creates:
```text
Menu-driven application
```

---

# switch-case Explanation

```java
switch(choice)
```

Purpose:
- Executes operation based on user selection

Example:

| Choice | Operation |
|---|---|
| 1 | Add Book |
| 2 | View Books |
| 3 | Search Book |
| 4 | Issue Book |
| 5 | Return Book |
| 6 | Delete Book |

---

# CRUD Operations Explanation

---

## 1. Add Book (CREATE)

Logic:

```java
books.add(b);
```

Purpose:
- Stores new book object inside ArrayList

Flow:

```text
User enters data
    ↓
Book object created
    ↓
Object added into ArrayList
```

---

## 2. View Books (READ)

Logic:

```java
for(Book book : books)
```

Purpose:
- Traverse all books one by one

Why loop is needed?
Because:
- ArrayList contains multiple book objects

---

## 3. Search Book

Logic:

```java
if(book.id == searchId)
```

Purpose:
- Finds matching book using ID

This teaches:
```text
Searching logic used in backend systems
```

---

## 4. Issue Book

Logic:

```java
if(!book.issued)
```

Purpose:
- Allows issuing only available books

If already issued:
- Application prevents duplicate issuing

This is called:
```text
Business Logic Validation
```

---

# Real-world similarity

Same logic used in:
- Hotel room booking
- Movie ticket booking
- Product inventory systems

---

## 5. Return Book

Logic:

```java
book.issued = false;
```

Purpose:
- Changes book state from issued → available

This teaches:
```text
State transition handling
```

---

## 6. Delete Book

Logic:

```java
books.remove(book);
```

Purpose:
- Removes object from collection

This teaches:
```text
Data management operations
```

---

# Backend Concepts Learned

After completing this project, beginners understand:

- How objects work
- How collections store data
- How CRUD operations work
- How business logic is implemented
- How backend systems process requests
- How object states are managed

---

# Real Industry Connection

This project follows the same backend thinking used in real applications.

| This Project | Real Industry |
|---|---|
| ArrayList | Database |
| Console UI | Frontend/Web UI |
| Scanner Input | API Request |
| display() | JSON Response |
| Book Object | Entity/DTO |
| CRUD Logic | REST APIs |

---

# Important Understanding

Although technology changes later:
- JDBC
- Spring
- Spring Boot
- Microservices

The core backend thinking remains similar.

That is why this project is important for beginners.

---

# Future Improvements

Possible upgrades:

- File Handling
- Database Integration using JDBC
- Login System
- Spring Boot REST API
- Web-based Frontend

---

# How to Run

1. Clone repository
2. Open in Eclipse or IntelliJ IDEA
3. Run `LibraryManagement.java`

---

# Author

Aaruu1709
