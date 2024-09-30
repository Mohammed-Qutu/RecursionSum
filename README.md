# RecursionSum

## Description
This Java project demonstrates recursion by calculating the sum of all integers from a given number `n` down to 0. The `Recursion` method recursively calls itself, adding the current number to the result of the next recursive call. This project showcases basic recursion principles and how it can simplify the implementation of iterative tasks in Java.

## Author
Written by Mohammed Qutu.

## Requirements
- Java 21.0.2 or later

## Usage
To run the program, compile the `RecursionSum.java` file and execute it. The program will compute and print the sum of all integers from a given number down to zero.

### Example Output
The sum of 5 is: 15

### Key Features:
- **Recursive Method**: The `Recursion()` method uses recursion to calculate the sum of integers from `n` down to zero.
- **Simple Recursion**: Demonstrates the basic concept of recursion by breaking down the sum of numbers into smaller subproblems.

### Methods:
- `Recursion(int n)`: Recursively computes the sum of numbers from `n` down to 0.

### Example:
```java
int sum = Recursion(5); // Outputs: 15
System.out.println("The sum of 5 is: " + sum);
