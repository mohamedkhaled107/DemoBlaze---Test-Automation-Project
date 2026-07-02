# 🛒 DemoBlaze Test Automation Framework

A scalable UI test automation framework built for the **DemoBlaze E-Commerce** web application using **Java, Selenium WebDriver, TestNG, and Maven**.

The framework follows modern automation design principles including **Page Object Model (POM)**, **Fluent Interface**, **Factory Pattern**, and **Bot Pattern** to produce clean, maintainable, and reusable test code.

---

## 🚀 Project Overview

This project automates the main user journeys of the DemoBlaze website, including:

- User Registration
- User Login
- Product Search
- Product Categories
- Add Product to Cart
- Cart Validation
- Place Order
- Logout

The framework is designed to be easy to maintain, scalable for future features, and suitable as a portfolio project demonstrating automation testing best practices.

---

# 🛠 Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager
- Allure Reports
- Extent Reports
- JSON (Test Data)

---

# 🏗 Framework Design

The project is built using several design patterns:

- ✅ Page Object Model (POM)
- ✅ Fluent Pattern
- ✅ Factory Pattern
- ✅ Bot Pattern

---

# 📂 Project Structure

```
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───demoblaze
│   │   │           ├───customListeners
│   │   │           │       CustomListeners.java
│   │   │           │       
│   │   │           ├───pages
│   │   │           │       CartPage.java
│   │   │           │       HomePage.java
│   │   │           │       LoginPage.java
│   │   │           │       PlaceOrderPage.java
│   │   │           │       ProductPage.java
│   │   │           │       RegisterPage.java
│   │   │           │       
│   │   │           └───utils
│   │   │                   ElementActions.java
│   │   │                   JsonReader.java
│   │   │                   ScreenShot.java
│   │   │                   WaitsUtils.java
│   │   │                   
│   │   └───resources
│   └───test
│       └───java
│           ├───com
│           │   └───demoblaze
│           │       └───tests
│           │               BaseTest.java
│           │               CartTest.java
│           │               E2e.java
│           │               HomeTest.java
│           │               LoginTest.java
│           │               ProductTest.java
│           │               RegisterTest.java
│           │               
│           └───testdata
│                   login-data.json
│                   
├───target
│   ├───classes
│   │   ├───com
│   │   │   └───demoblaze
│   │   │       └───pages
│   │   │               CartPage.class
│   │   │               HomePage.class
│   │   │               LoginPage.class
│   │   │               PlaceOrderPage.class
│   │   │               ProductPage.class
│   │   │               RegisterPage.class
│   │   │               
│   │   └───utils
│   │           ElementActions.class
│   │           JsonReader.class
│   │           WaitsUtils.class
│   │           
│   ├───generated-sources
│   │   └───annotations
│   ├───generated-test-sources
│   │   └───test-annotations
│   └───test-classes
│       └───com
│           └───demoblaze
│               └───tests
│                       BaseTest.class
│                       CartTest.class
│                       E2e.class
│                       HomeTest.class
│                       LoginTest.class
│                       ProductTest.class
│                       RegisterTest.class
│                       
└───test-output
    └───screenshots
```

---

# ✅ Test Coverage

### Authentication

- Register with valid user
- Register with existing user
- Login with valid credentials
- Login with invalid credentials
- Logout

### Products

- Browse Categories
- Select Product
- Verify Product Details

### Cart

- Add Product
- Remove Product
- Verify Cart Contents

### Checkout

- Complete Purchase
- Validate Purchase Confirmation


---

# 📋 Test Design

- Test Scenarios
- Expected Results
- Bug Validation
- Assertions
- Reusable Test Data

---

# 📸 Screenshots on Failure

Whenever a test fails, the framework automatically:

- Captures Screenshot
- Attaches Screenshot to Allure Report

---

# 📈 Reporting

The project supports:

- Allure Reports
- Extent Reports
- TestNG Reports

---

# 📦 Test Data

The framework supports external test data using JSON files.

Example:

```json
{
  "validUser": {
    "username": "testuser400",
    "password": "Test@123"
  },
  "invalidUser": {
    "username": "wronguser",
    "password": "Wrong@123"
  },
  "emptyUsername": {
    "username": "",
    "password": "Test@123"
  },
  "emptyPassword": {
    "username": "testuser",
    "password": ""
  },
  "emptyCredentials": {
    "username": "",
    "password": ""
  }
}
```
