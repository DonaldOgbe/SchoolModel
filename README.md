# School Model Application

A basic simulation of a school environment using Object-Oriented Programming principles in Java. This project demonstrates class hierarchies, interfaces, encapsulation, and TDD (Test-Driven Development) practices.

## 📅 Decagon curriculum

- ✅ Decagon curriculum Week 1 Complete: Introduction to Java OOP Introduction

## 🛠️ Features

- Represent real-world school members as Java classes
- Handle admissions, course assignments, and expulsions
- Use interfaces to define school-specific behaviors
- Apply object-oriented principles like inheritance and abstraction
- Implement unit testing using TDD

## 📄 Class Structure Overview

### Main Entry

- `SchoolModelApplication` (main method)

### 📦 Models

- `Person`: Base class for all individuals
- `Staff`: Inherits from `Person`
- `Principal`: Can admit and expel students
- `Teacher`: Can introduce themselves and assign courses
- `Student`: Represents enrolled students
- `Applicant`: Represents those applying to join the school
- `NonAcademicStaff`: Inherits from `Staff`

### 🔌 Interfaces

- `Introduce`: Allows staff to introduce themselves
- `AdmitApplicant`: Grants the ability to admit applicants
- `ExpelStudent`: Grants the ability to expel students
- `NewCourse`: Used by teachers to assign new courses

## 🧬 Running Tests

To run tests, use the IDE test runner or mvn test

```bash
  mvn test
```
- Unit tests are located in the `src/test` directory
- Covers behavior for admitting, expelling, introducing, and course assignment
- Follows TDD approach for reliable development

## 💻 Run Locally

```bash
# Compile
javac -d out src/main/java/**/*.java

# Run
java -cp out SchoolModelApplication
```

## 🔍 Example Usage

```java
Principal principal = new Principal("Mrs. Smith");
Applicant applicant = new Applicant("John Doe");
Student student = principal.admit(applicant);

Teacher teacher = new Teacher("Mr. Jones");
teacher.addCourse("Mathematics");
```
---

