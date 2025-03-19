# Multiplication tables project

## Description
A Java application that generates the multiplication table for a given integer.

## Features
- Reads an integer `n` from standard input.
- Prints the multiplication table from `1` to `10`.
- Includes automated tests with JUnit 5 and Allure reporting.
- Configured with GitHub Actions to run tests weekly and send results via email.

## Requirements
- Java 11+
- Maven 3+
- **Allure CLI** (optional for local report generation)

## 🔧 Installation

### Clone the repository
```sh
git clone https://github.com/your-username/multiplication.git
```
```sh
cd multiplication
```

### Run the program
```sh
mvn compile exec:java
```

### Run the tests
```sh
mvn test
```

### Generate Allure report
```sh
mvn allure:report
```
```sh
allure serve target/allure-results
```

## ⚙️ CI/CD Automation
This project is integrated with GitHub Actions, running tests every Sunday at 10:30 AM UTC, and sending results via email.


