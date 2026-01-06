# Arrays – Basics (Java)

This folder contains my initial practice of array fundamentals in Java.
The focus here is on understanding how arrays work internally, not on using
built-in collections.

## Files Included

### 1. ArrayBasics.java
Covers the core fundamentals of arrays:
- Array creation
- 0-based indexing
- Difference between array length and logical size
- Traversing arrays safely using loops
- Common beginner mistakes (commented in code)

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
- Delete operation does not shrink the array

---

### 3. ArrayInsertAtIndex.java
Demonstrates insertion at a specific index:
- Element shifting from right to left
- Handling edge cases (invalid index, full array)
- Inserting at beginning, middle, and end
- Clear separation of capacity vs index validity

---

## Key Takeaways
- Arrays use 0-based indexing
- `arr.length` represents capacity, not used elements
- Logical size is critical for correct array operations
- Shifting elements is required for insert and delete operations

This folder is part of my Data Structures & Algorithms learning journey in Java.
