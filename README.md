FizzBuzz Project
================

This repository contains a solution to the classic **FizzBuzz** problem, implemented using **Test-Driven Development (TDD)** with **Java** and **Gradle**.

This is a solution to the [FizzBuzz Kata](https://www.codurance.com/katas/fizzbuzz) from [**Codurance**](https://www.codurance.com).

About
-----

The **FizzBuzz** problem is a common programming challenge. We need to convert an integer to a string, with the following exceptions:

-   For numbers divisible by **3**, convert it to `Fizz`.
-   For numbers divisible by **5**, convert it to `Buzz`.
-   For numbers divisible by both **3 and 5**, convert it to `FizzBuzz`.

In this project, the solution is implemented using **Test-Driven Development (TDD)**, meaning the tests are written before the code, ensuring the solution is robust, correct, and maintainable.

Test-Driven Development Approach
------------

This project follows the 3 Laws of **Test-Driven Development (TDD)** approach:

1.  Write no production code except to pass a failing test.
2.  Write only enough of a test to demonstrate a failure. (Not compiling is also a valid failure.)
3.  Write only enough production code to pass the test.

Once the test is passing, the code is refactored for clarity and efficiency.
The tests ensure that the `FizzBuzz` implementation behaves as expected, including edge cases like numbers divisible by both 3 and 5.

Technologies Used
-----------------

-   **Java**: The primary programming language used to implement the solution.
-   **Gradle**: A powerful build tool used for dependency management and running tests.
-   **JUnit 5**: The testing framework used to write unit tests for the FizzBuzz solution.

How to Run the Tests
--------------------

Follow these steps to run the tests on your local machine:

1.  **Clone the Repository**:

    ```
    git clone https://github.com/deep-muni/fizz-buzz-tdd-kata
    cd fizz-buzz-tdd-kata
    ```
2.  Make sure you have Java and Gradle installed.

3. Run the Tests with Gradle: `./gradlew test`

Project Structure
-----------------

Here's an overview of the project's structure:

bash

Copy code

```
fizz-buzz-tdd-kata/
├── build.gradle
├── gradlew
├── gradlew.bat
├── .gitignore
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/kata/fizzbuzz 
│   │           └── FizzBuzzNumber.java
│   └── test/
│       └── java/
│           └── com/kata/fizzbuzz 
│               └── FizzBuzzNumberShould.java
└── README.md
```

### Key Files:

-   `FizzBuzzNumber.java`: The main class that contains the logic for the FizzBuzz solution.
-   `FizzBuzzNumberShould.java`: The test class that contains all the unit tests for validating the solution.
-   `build.gradle`: Gradle build file for managing dependencies, tasks, and test configurations.