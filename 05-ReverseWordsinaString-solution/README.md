# Reverse Words in a String

This repository contains a solution to the **Reverse Words in a String** problem. Given a string `s`, the goal is to reverse the order of words while removing extra spaces.

## Problem Statement

Given an input string `s`, reverse the order of the words. A word is defined as a sequence of non-space characters. The words in `s` will be separated by at least one space.

- **Return**: A string of the words in reverse order, concatenated by a single space.
- **Note**: `s` may contain leading or trailing spaces or multiple spaces between words. The returned string should contain a single space separating the words, with no leading or trailing spaces.

### Examples

- **Example 1**  
  **Input**: `s = "the sky is blue"`  
  **Output**: `"blue is sky the"`

- **Example 2**  
  **Input**: `s = "  hello world  "`  
  **Output**: `"world hello"`  
  **Explanation**: The reversed string should not contain leading or trailing spaces.

- **Example 3**  
  **Input**: `s = "a good   example"`  
  **Output**: `"example good a"`  
  **Explanation**: Multiple spaces between words are reduced to a single space in the output.

### Constraints

- `1 <= s.length <= 10^4`
- `s` contains English letters (upper and lowercase), digits, and spaces `' '`.
- There is at least one word in `s`.