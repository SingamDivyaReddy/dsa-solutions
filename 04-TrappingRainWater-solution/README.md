# Trapping Rain Water

This repository provides a solution to the **Trapping Rain Water** problem. Given an elevation map where the width of each bar is `1`, the goal is to calculate the amount of water trapped after raining.

## Problem Statement

Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

### Examples

- **Example 1**  
  **Input**: `height = [0,1,0,2,1,0,1,3,2,1,2,1]`  
  **Output**: `6`  
  **Explanation**: In this elevation map, `6` units of water are trapped.

- **Example 2**  
  **Input**: `height = [4,2,0,3,2,5]`  
  **Output**: `9`

### Constraints

- `n == height.length`
- `1 <= n <= 2 * 10^4`
- `0 <= height[i] <= 10^5`