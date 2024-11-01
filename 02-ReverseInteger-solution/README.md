# Reverse Integer

This repository contains a solution to the **Reverse Integer** problem, where the goal is to reverse the digits of a signed 32-bit integer and handle edge cases like overflow or underflow.

## Problem Statement

Given a signed 32-bit integer `x`, return `x` with its digits reversed. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-2^31, 2^31 - 1]`, return `0`.

### Examples

- **Example 1**  
  **Input**: `x = 123`  
  **Output**: `321`

- **Example 2**  
  **Input**: `x = -123`  
  **Output**: `-321`

- **Example 3**  
  **Input**: `x = 120`  
  **Output**: `21`

### Constraints

- `-2^31 <= x <= 2^31 - 1`