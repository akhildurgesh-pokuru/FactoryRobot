# Factory Robot Hazard Analyzer

## Project Overview

The **Factory Robot Hazard Analyzer** is a Java-based application designed to evaluate the potential hazard risk associated with factory robots based on three important parameters:

- **Arm Precision** – Measures the precision of the robot arm.
- **Worker Density** – Represents the number of workers in the robot's operational area.
- **Machinery State** – Indicates the current condition of the machinery.

The application accepts user inputs, validates the provided values, maps machinery conditions to corresponding risk factors, and calculates a hazard risk score.

This project demonstrates fundamental and advanced Java concepts, including Object-Oriented Programming (OOPS), exception handling, modular programming, method abstraction, and unit testing.

## Objectives

- Develop a modular Java application for factory robot hazard analysis.
- Implement hazard risk calculation using a mathematical formula.
- Validate user inputs to prevent invalid data.
- Implement custom exceptions for handling safety-related errors.
- Apply OOPS principles to improve code reusability and maintainability.
- Write unit tests to verify the correctness of individual components.

## Technology Stack

| Technology | Purpose |
|---|---|
| Java 17 | Core programming language |
| Maven | Project and dependency management |
| JUnit 5 | Unit testing framework |
| IntelliJ IDEA | Development environment |
| Git & GitHub | Version control and source code management |

## Use Case Implementation

The project is developed incrementally through eight use cases (UC1–UC8).

### UC1 – Display Static Hazard Message
- Creates the main application class.
- Displays the system name on program execution.
- Demonstrates Java classes, main method, and print statements.

### UC2 – Accept Robot Hazard Inputs
- Accepts arm precision from the user.
- Accepts worker density.
- Accepts machinery state.
- Displays the entered values.
- Demonstrates Scanner and primitive data types.

### UC3 – Calculate Hazard Risk Score (Without Validation)
- Implements the hazard risk calculation formula.
- Calculates and displays the risk score.
- Demonstrates arithmetic operations and method return values.

### UC4 – Introduce Validation Using Conditional Logic
- Validates arm precision.
- Checks worker density.
- Checks machinery state.
- Uses if-else statements to handle invalid inputs.

### UC5 – Refactor Validation into a Separate Method
- Moves validation and calculation logic into a separate method.
- Keeps the main method minimal.
- Demonstrates method abstraction and separation of concerns.

### UC6 – Introduce Custom Exception
- Implements a custom `RobotSafetyException` class.
- Handles invalid inputs using `throw` and `throws`.
- Uses try-catch blocks for exception handling.

### UC7 – Machinery State Risk Mapping
- Implements a separate machinery risk mapping class.
- Maps machinery states to corresponding risk factors.
- Supports Worn, Faulty, and Critical states.
- Handles unsupported states using exceptions.

### UC8 – Fully Modular and OOPS-Compliant Hazard Analyzer
- Integrates all the major functionalities.
- Separates input collection, validation, calculation, and machinery mapping.
- Implements encapsulation and modular design.
- Provides a complete hazard analysis application.

## Hazard Risk Calculation

The application calculates the hazard risk score using the following formula:

**Hazard Risk Score = (1 - Arm Precision) × 15 + (Worker Density × Machinery Risk Factor)**

### Machinery Risk Factor Mapping

| Machinery State | Risk Factor |
|---|---:|
| Worn | 1.3 |
| Faulty | 2.0 |
| Critical | 3.0 |

### Input Validation Rules

| Parameter | Validation |
|---|---|
| Arm Precision | Must be between 0.0 and 1.0 |
| Worker Density | Must be greater than or equal to 0 |
| Machinery State | Must be Worn, Faulty, or Critical |

Machinery state comparisons are case-sensitive.

## OOPS Concepts Demonstrated

**1. Encapsulation**
- Keeps business logic within dedicated classes.
- Protects implementation details through controlled method access.

**2. Abstraction**
- Exposes methods such as `calculateHazardRisk()` without requiring the caller to understand the internal implementation.

**3. Single Responsibility Principle**
- Assigns individual responsibilities to separate classes.
- Separates input handling, validation, risk mapping, and calculation.

**4. Extensibility**
- Allows additional machinery states and risk factors to be incorporated into the mapping logic.

**5. Exception Handling**
- Uses custom exceptions to handle invalid safety conditions.
- Provides meaningful error messages.

## Project Structure

```text
FactoryRobotHazardAnalyzer/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/factoryrobot/
│   │           ├── uc1/
│   │           ├── uc2/
│   │           ├── uc3/
│   │           ├── uc4/
│   │           ├── uc5/
│   │           ├── uc6/
│   │           ├── uc7/
│   │           └── uc8/
│   │               ├── FactoryRobotHazardAnalyzer.java
│   │               ├── RobotHazardAuditor.java
│   │               ├── RobotSafetyException.java
│   │               └── MachineryRiskMapper.java
│   │
│   └── test/
│       └── java/
│           └── com/factoryrobot/
│               ├── uc1/
│               ├── uc2/
│               ├── uc3/
│               ├── uc4/
│               ├── uc5/
│               ├── uc6/
│               ├── uc7/
│               └── uc8/
│
├── pom.xml
├── README.md
└── .gitignore
```

## Sample Execution

**Input:**

```text
Factory Robot Hazard Analyzer

Enter arm precision: 0.85
Enter worker density: 10
Enter machinery state: Worn
```

**Output:**

```text
Hazard Analysis Result

Arm Precision: 0.85
Worker Density: 10
Machinery State: Worn
Hazard Risk Score: 15.25
```

**Example of Invalid Input:**

```text
Enter arm precision: 1.5
Enter worker density: 10
Enter machinery state: Worn
```

**Output:**

```text
Robot Safety Error: Arm precision must be between 0 and 1
```

## How to Run the Project

### Prerequisites

Ensure that the following are installed:

- Java Development Kit (JDK 17 or later)
- Apache Maven
- IntelliJ IDEA or any Java-supported IDE
- Git

### Step 1 – Clone the Repository

```bash
git clone <YOUR_GITHUB_REPOSITORY_URL>
```

### Step 2 – Navigate to the Project Directory

```bash
cd FactoryRobotHazardAnalyzer
```

### Step 3 – Build the Project

```bash
mvn clean compile
```

### Step 4 – Run the Application

Open the project in IntelliJ IDEA and execute:

`FactoryRobotHazardAnalyzer.java`

### Step 5 – Execute Unit Tests

Run all JUnit 5 test cases using:

```bash
mvn clean test
```

## Testing

JUnit 5 is used to verify the correctness of the application's functionality.

The test cases cover:

- Valid hazard risk calculations.
- Invalid arm precision values.
- Negative worker density.
- Valid machinery state mapping.
- Unsupported machinery states.
- Case-sensitive machinery state validation.
- Null machinery state.
- Boundary values for arm precision.
- Zero worker density.

## Learning Outcomes

Through this project, the following concepts are explored:

- Java fundamentals and object-oriented programming.
- Method abstraction and modularity.
- Input validation and defensive programming.
- Custom checked exceptions.
- Business logic encapsulation.
- JUnit 5 unit testing.
- Maven dependency management.
- Version control using Git and GitHub.

## Future Enhancements

- Integrate real-time factory sensor data.
- Introduce additional machinery conditions and configurable risk factors.
- Implement risk classification levels such as Low, Medium, High, and Critical.
- Develop a REST API using Spring Boot.
- Store hazard analysis results in a database.
- Build a dashboard for visualizing robot hazard reports.

## Conclusion

The Factory Robot Hazard Analyzer demonstrates how Java and Object-Oriented Programming principles can be applied to develop a modular, maintainable, and extensible hazard analysis application.

By progressively implementing eight use cases, the project illustrates the evolution from basic Java programming to a fully modular application with custom exception handling, structured business logic, and unit testing.

---

**Developed using Java 17 | Maven | JUnit 5**
