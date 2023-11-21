# Day 2: Check if a Number is a Palindrome - November 20, 2023

## Problem Overview
The challenge is to determine whether a given integer is a palindrome. A palindrome is a number that reads the same forward and backward.

## Key Concepts
- **String Manipulation:** Using string operations to reverse and compare numbers.
- **Mathematical Logic:** Employing arithmetic operations to reverse half of the number for comparison, optimizing for space complexity.
- **Edge Case Consideration:** Handling specific cases like negative numbers and numbers ending with zero.

## Solutions
### 1. String Conversion
   - **Approach:** Convert the number to a string and then compare it with its reverse.
   - **Time Complexity:** O(n), where n is the number of digits.
   - **Space Complexity:** O(n), due to string conversion.

### 2. Reversing Half of the Number
   - **Approach:** Reverse the second half of the number and compare it with the first half. Special handling for negative numbers and numbers ending in zero.
   - **Time Complexity:** O(log n), significantly more efficient for large numbers.
   - **Space Complexity:** O(1), as it avoids extra space used in string conversion.

## Programming Languages
- Python
- Java

## Learning Outcomes
- Demonstrates the application of both string manipulation and mathematical operations in problem-solving.
- Emphasizes the importance of considering different approaches based on time and space complexity.
- Enhances understanding of how to tackle edge cases in algorithms.
