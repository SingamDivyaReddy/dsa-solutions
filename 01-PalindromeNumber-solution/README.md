# Palindrome Number Checker

This project provides a function to check if a given integer is a palindrome. A number is considered a palindrome if it reads the same forward and backward.

## Problem Statement

Given an integer `x`, return `true` if `x` is a palindrome and `false` otherwise.

### Examples

#### Example 1
**Input:** `x = 121`  
**Output:** `true`  
**Explanation:** `121` reads as `121` from left to right and from right to left.

#### Example 2
**Input:** `x = -121`  
**Output:** `false`  
**Explanation:** From left to right, it reads `-121`. From right to left, it becomes `121-`, so it is not a palindrome.

#### Example 3
**Input:** `x = 10`  
**Output:** `false`  
**Explanation:** Reads `01` from right to left, so it is not a palindrome.

### Constraints
* `-2^31 <= x <= 2^31 - 1`