# Employee Class README

## Overview

This project involves creating a Java class named `Employee`, which inherits from the class `Person`. The `Employee` class introduces additional attributes and methods specific to employees.

## Step 1: Inheriting from `Person`

To establish an inheritance relationship between `Employee` and `Person`, follow these steps:

### 1.1 - Extending `Person`

In the `Employee` class header, complete the `extends` statement to extend the `Person` class.

### 1.2 - Constructor

Write the constructor for the `Employee` class. Don't forget to call the `super` constructor to initialize the attributes inherited from `Person`.

### 1.3 - Private Class Variables

Create two private class variables:
- `int id`: Stores the employee's ID.
- `double hourlyPay`: Stores the employee's hourly pay.

### 1.4 - Getters and Setters

Implement the following getters and setters for the private variables:
- `getId()`: Returns the employee's ID.
- `getHourlyPay()`: Returns the employee's hourly pay.
- `setId(int id)`: Sets a new value for the employee's ID.
- `setHourlyPay(double hourlyPay)`: Sets a new value for the employee's hourly pay.

## Step 2: `getRaise` Method

Complete the `getRaise` method in the `Employee` class to provide a raise to the employee by increasing their total hourly pay by 15%. The method should also update the `hourlyPay` class variable and return the new hourly pay.

## Step 3: `payDay` Method

In the `Employee` class, complete the `payDay` method, which calculates the employee's earnings for the week. The calculation includes:

- Calculating regular pay based on the employee's hourly rate.
- Accounting for overtime pay if the employee worked more than 40 hours (overtime hours are paid at 1.5 times the normal rate).
- Returning the total pay for the week.

## Step 4: Override `toString` Method

In the `Employee` class, override the `toString` method to provide a comprehensive representation of the employee. The updated `toString` method includes:

- Employee's name.
- Employee's height.
- Employee's hourly pay.
- Employee's ID.

## Testing

To test the `Employee` class, create instances of `Employee` objects, set their attributes, call the methods, and print the results. This will help ensure that the class functions correctly according to the provided instructions.

---

This README provides a step-by-step guide to implementing and testing the `Employee` class. Follow the instructions for each step to successfully complete the project and ensure the class functions as expected. Good luck with your project!
