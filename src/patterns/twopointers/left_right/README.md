# Two Pointers – Left Right Pointer Pattern

This pattern is used when we need to process elements from both ends of a data structure
(mainly arrays or strings) by moving two pointers towards each other.

It is especially effective when:
- The input is sorted
- We need to reverse or compare from both ends
- We want to avoid extra space

---

## Core Idea

- Initialize two pointers:
    - `left` → start of array/string
    - `right` → end of array/string
- Move pointers based on problem conditions
- Continue until `left < right`

---

## Pointer Movement Rules

- If both elements are valid → process/compare them
- If left element is invalid → move `left++`
- If right element is invalid → move `right--`
- If both are invalid → move both pointers

---

## Problems Covered

### 1️⃣ Pair Sum in Sorted Array
**Problem:**  
Check if there exists a pair whose sum equals the target.

**Key Insight:**
- If current sum is greater than target → move `right--`
- If current sum is smaller than target → move `left++`

**Related Problem:**
- LeetCode 167 – Two Sum II (Input Array Is Sorted)

---

### 2️⃣ Reverse String
**Problem:**  
Reverse a character array in-place.

**Key Insight:**
- Swap characters at `left` and `right`
- Move both pointers inward

**Related Problem:**
- LeetCode 344 – Reverse String

---

### 3️⃣ Valid Palindrome
**Problem:**  
Check whether a string is a palindrome considering only alphanumeric characters
and ignoring cases.

**Key Insight:**
- Skip non-alphanumeric characters
- Convert string to lowercase for case-insensitive comparison
- Compare characters using two pointers

**Related Problem:**
- LeetCode 125 – Valid Palindrome

---

## Time & Space Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

## When to Use This Pattern

- Sorted arrays
- String manipulation (palindrome, reverse)
- Pair-based problems
- Problems requiring in-place operations

---