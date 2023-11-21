# Day 2: Check if a Number is a Palindrome

## Problem Statement
Write a function to check whether a given integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

### Examples
- **Input:** `121`
- **Output:** `true` (121 is the same forward and backward)

- **Input:** `-121`
- **Output:** `false` (the reverse of -121 is 121-, which is not the same)

### Constraints
- The integer is a 32-bit integer.

## Solution Approaches
1. **String Conversion Method:** Convert the number to a string and compare it with its reverse.
2. **Half Reversal Method:** Reverse the second half of the number and compare it with the first half, considering edge cases like negative numbers and numbers ending with 0.

## Learning Objectives
- Understanding and applying string manipulation techniques.
- Utilizing mathematical operations to solve problems without converting to a string, thus optimizing space complexity.
- Handling edge cases in algorithmic design.
