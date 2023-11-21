# Day 2: Check if a Number is a Palindrome - November 20, 2023

## Problem Overview
The task is to create a function that checks whether a given integer is a palindrome. A number is considered a palindrome if it remains the same when its digits are reversed.

## Key Concepts
- **String Reversal:** Understanding how to reverse a string in Python.
- **Mathematical Logic:** Employing arithmetic operations for reverse number calculation.
- **Efficient Algorithm Design:** Focusing on time and space complexity in solution approaches.
- **Edge Case Handling:** Addressing special cases, such as negative numbers and numbers ending with zero.

## Solutions
### 1. String Conversion Method
   - **Approach:** Convert the number to a string and compare it with its reverse.
   - **Time Complexity:** O(n), where n is the number of digits in the number.
   - **Space Complexity:** O(n), due to additional space used for the string.

### 2. Reversing Half of the Number
   - **Approach:** Reverse only the second half of the number and compare it with the first half, checking edge cases like negative numbers.
   - **Time Complexity:** O(log n), as only half of the digits are processed.
   - **Space Complexity:** O(1), using constant space.

## Programming Languages
- Python
- Java

## Learning Outcomes
- Demonstrates string manipulation techniques and their applications.
- Highlights the importance of efficient algorithm design, especially in terms of space complexity.
- Showcases the ability to handle edge cases in algorithmic problem-solving.

