# Password Strength Checker

A simple Java console application that evaluates password strength based on five criteria.

## Features

- Calculates a password score from 0 to 5.
- Checks password length, uppercase letters, lowercase letters, digits, and special characters.
- Classifies passwords as Weak, Medium, or Strong.
- Validates empty and whitespace-only passwords.
- Handles invalid input using exceptions.
- Includes automated unit tests using JUnit 5.

## Technologies Used

- Java 21
- Maven
- JUnit 5

## Password Scoring

The application awards one point for each of the following criteria:

1. At least 12 characters.
2. At least one uppercase letter.
3. At least one lowercase letter.
4. At least one digit.
5. At least one special character.

The total score determines the displayed strength:

- **0–1:** Weak
- **2–3:** Medium
- **4–5:** Strong

## How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure JDK 21 is configured.
4. Run `Main.java`.
5. Enter a password when prompted.

## Running the Tests

Run `PasswordCheckerTest.java` in IntelliJ IDEA, or open a terminal in the project directory and execute:

```bash
mvn test
```

## Project Structure

```text
PasswordStrengthChecker/
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   └── java/
    │       ├── Main.java
    │       └── PasswordChecker.java
    └── test/
        └── java/
            └── PasswordCheckerTest.java
```

## Future Improvements

The following features are planned for future versions of the project:

- **Detailed password feedback:** Explain which password requirements are met and which are missing.
- **Improved strength evaluation:** Explore more advanced rules for evaluating password security.
- **Additional unit tests:** Cover more edge cases and invalid inputs.
- **Graphical user interface (GUI):** Replace or complement the console interface with a graphical interface.
- **Common password detection:** Identify frequently used passwords.
- **Password entropy:** Explore how entropy can help estimate password guessability.

## Learning Objectives

This project was created as a Java learning exercise to practice:

- Methods and conditional statements.
- String handling and regular expressions.
- Input validation and exception handling.
- Object-oriented programming basics.
- Automated unit testing with JUnit 5.

## Disclaimer

This project is an educational exercise. Its password strength score is a simplified indicator and should not be treated as a complete measure of password security.