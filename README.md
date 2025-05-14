# E2E-TestFramework-SwagLabs-BDD
End-to-end test automation framework for Swag Labs using Java, Selenium, Cucumber (BDD), and TestNG. Designed for maintainability and CI/CD readiness, featuring parallel execution, custom reports, and external config support.
# SwagLabs_Ecom_Automation (BDD Framework)

![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)


[![Certifications & Awards](https://img.shields.io/badge/Certifications%20%26%20Awards-10-blue)](https://github.com/Prasad8400/My_AwardsAndCertifications/blob/main/My_AwardsAndCertifications.md)

[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white)](https://www.java.com/)
[![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=flat&logo=selenium&logoColor=white)](https://www.selenium.dev/)
[![TestNG](https://img.shields.io/badge/TestNG-FF6C37?style=flat&logo=testng)](https://testng.org/)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apachemaven)](https://maven.apache.org/)
[![Cucumber](https://img.shields.io/badge/Cucumber-BDD-green?style=flat&logo=cucumber)](https://cucumber.io/)

This project is a robust, scalable **Selenium WebDriver automation framework** built for testing the [Swag Labs](https://www.saucedemo.com/) e-commerce platform using **Java 17**, **Cucumber (BDD)**, **TestNG**, and **Maven**.

It leverages the **Page Object Model (POM)** design pattern for maintainability and supports cross-browser execution with detailed reporting.

## 🚀 Features

- ✅ BDD with Cucumber (Gherkin syntax)
- ✅ Page Object Model (POM) design
- ✅ Parallel test execution with TestNG
- ✅ Browser support (Chrome, Firefox)
- ✅ External configuration via `config.properties`
- ✅ Detailed HTML report generation
- ✅ Maven for dependency and build management
- ✅ Java 17 and Eclipse IDE

## 📂 Project Structure

src
├── main
│ └── resources
├── test
│ ├── java
│ │ ├── base/ # WebDriver setup and BaseTest
│ │ ├── pages/ # Page Object classes
│ │ ├── steps/ # Cucumber step definitions
│ │ ├── testRunners/ # Cucumber TestNG runner
│ │ └── utils/ # Report & Config utilities
│ └── resources
│ ├── features/ # Cucumber feature files
│ └── config.properties # External config


## 🛠 Tech Stack

| Tool                | Description                            |
|---------------------|----------------------------------------|
| Java 17             | Language                               |
| Selenium WebDriver  | Browser Automation                     |
| Cucumber            | BDD Framework                          |
| TestNG              | Test Execution                         |
| Maven               | Build & Dependency Management          |
| Eclipse IDE         | Development Environment                |

## 📈 Reporting

The framework supports rich HTML reporting via external Report Manager (`utils/ReportManager.java`) and is configured for scalable test result output.

## 💼 Skills Demonstrated

- ✅ Test automation framework design
- ✅ Page Object Model (POM) implementation
- ✅ Behavior-Driven Development with Cucumber
- ✅ CI/CD readiness using Maven
- ✅ Cross-browser automation setup
- ✅ External configuration management
- ✅ TestNG parallel test setup
- ✅ Extensive use of Object-Oriented Programming (OOP) principles:
    🔹Encapsulation – Data hiding and getter/setter usage in page classes
    🔹Abstraction – Reusable base classes and utility methods
    🔹Inheritance – Common test setup inherited from base test class
    🔹Polymorphism – Method overriding (e.g., WebDriver setup across browsers)

## 🚀 Getting Started

```bash
# Clone the repo
git clone https://github.com/your-username/SwagLabs_Ecom_Automation.git

# Navigate to project directory
cd SwagLabs_Ecom_Automation

# Run tests with Maven
mvn clean test
```

## 🔧 Configuration

src/test/resources/config.properties

## 📬 Contact

- 📧 Email: prasadsutar6544@gmail.com  
- 💼 LinkedIn: [linkedin.com/in/prasadsutar8400](https://www.linkedin.com/in/prasadsutar8400/)
