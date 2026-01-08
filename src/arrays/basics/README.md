# Arrays – Basics (Java)

This folder contains my foundational practice of array concepts in Java.
The focus is on understanding how arrays work internally, handling edge cases,
and building strong logical thinking before moving to patterns and advanced problems.

No built-in collections are used. All operations are implemented using
basic loops and conditionals.

---

## Files Included

### 1. ArrayBasics.java
Covers the core fundamentals of arrays:
- Array creation and initialization
- 0-based indexing
- Difference between array length (capacity) and logical size
- Safe traversal using loops
- Common beginner mistakes (documented in comments)

---

### 2. ArrayCRUD.java
Implements basic CRUD operations on a fixed-size array:
- Create (insert at end)
- Read (traversal using logical size)
- Update (modify value at a given index)
- Delete (logical delete using element shifting)

Key learning:
- Arrays have fixed capacity
- Logical size must be managed manually
- Delete operation shifts elements but does not shrink the array

---

### 3. ArrayInsertAtIndex.java
Demonstrates insertion at a specific index:
- Right-shifting elements to make space
- Handling invalid index and full array cases
- Insertion at beginning, middle, and end
- Clear separation between capacity and index validity

---

### 4. ReverseArray.java
Implements array reversal logic:
- Two-pointer approach
- In-place reversal (no extra array)
- Understanding swaps and pointer movement

---

### 5. LinearSearch.java
Implements linear search on an array:
- Sequential traversal
- Returning index of the target element
- Handling element-not-found cases

---

### 6. MinMax.java
Finds the minimum and maximum elements in an array:
- Single traversal approach
- Avoids sorting
- Reinforces comparison-based logic

---

### 7. IsSorted.java
Checks whether an array is sorted in non-decreasing order:
- Pairwise comparison of adjacent elements
- Early exit on detecting disorder
- Foundation for binary search and optimization problems

---

### 8. SecondLargestElement.java
Finds the second largest **distinct** element in an array:
- Single-pass solution
- State tracking using `largest` and `secondLargest`
- Handles edge cases like duplicates and small arrays

---

### 9. CountEvenOdd.java
Counts the number of even and odd elements:
- Single traversal
- Conditional logic using modulus operator
- Forms the base for frequency and counting problems

---

## Key Takeaways
- Arrays use 0-based indexing
- `arr.length` represents capacity, not the number of used elements
- Logical size management is essential in array operations
- Many array problems rely on traversal + condition-based decisions
- Strong array basics are critical before moving to patterns like
  Binary Search, Two Pointers, and Sliding Window

This folder represents **Day 1–Day 3** of my Data Structures & Algorithms
learning journey in Java and focuses on building a solid foundation.
