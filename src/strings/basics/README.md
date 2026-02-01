# Strings Basics (Java)

This folder contains **core string concepts and fundamental string-based problems** implemented in Java.  
The goal is to build **strong string logic**, understand **immutability**, and prepare for **DSA & interview questions**.

---

## 📁 Folder: `strings.basics`

### 1️⃣ `StringIntro.java`
**Concepts Covered:**
- String literal vs `new String()`
- String Constant Pool (SCP)
- `==` vs `.equals()`
- Why Strings are immutable

📌 *Important theory question for interviews*

---

### 2️⃣ `StringMethods.java`
**Concepts Covered:**
- Common String methods:
    - `length()`
    - `charAt()`
    - `substring()`
    - `toLowerCase()`, `toUpperCase()`
    - `equals()` vs `equalsIgnoreCase()`

📌 *Used in almost every string problem*

---

### 3️⃣ `StringVsBuilderVsBuffer.java`
**Concepts Covered:**
- String (Immutable)
- StringBuilder (Mutable, Fast, Not thread-safe)
- StringBuffer (Mutable, Thread-safe)
- Performance comparison in loops

📌 *Very frequently asked interview question*

---

### 4️⃣ `CharArrayConversion.java`
**Concepts Covered:**
- Converting String to `char[]`
- Manual traversal of characters
- Difference between String and character array

📌 *Foundation for low-level string manipulation*

---

### 5️⃣ `ReverseString.java`
**Concepts Covered:**
- Two-pointer technique
- In-place reversal
- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

🔗 LeetCode: 344 – Reverse String

---

### 6️⃣ `PalindromeCheck.java`
**Concepts Covered:**
- Left–Right pointer approach
- Case-insensitive comparison
- Ignore non-alphanumeric characters

🔗 LeetCode: 125 – Valid Palindrome

---

### 7️⃣ `CountCharacters.java`
**Concepts Covered:**
- Character frequency using `int[26]`
- ASCII character math
- Case-insensitive counting
- Ignore non-letter characters

📌 *Base for anagram & hashing problems*

---

### 8️⃣ `RemoveSpaces.java`
**Concepts Covered:**
- Removing spaces without built-in methods
- String vs StringBuilder performance
- Manual traversal

📌 *Tests understanding of immutability*

---

### 9️⃣ `ToggleCase.java`
**Concepts Covered:**
- ASCII value manipulation
- Convert uppercase ↔ lowercase
- Ignore digits and symbols

📌 *Asked when built-in methods are restricted*

---

### 🔟 `AnagramCheck.java`
**Concepts Covered:**
- Frequency array technique
- Increment for first string, decrement for second
- Efficient anagram validation

🔗 LeetCode: 242 – Valid Anagram

---

## 🧠 Patterns Used
- Two Pointers
- Frequency Array
- ASCII Character Logic
- String Immutability Optimization

---

## 🎯 Objective
- Build **strong string fundamentals**
- Write **clean and interview-ready Java code**
- Prepare for advanced topics:
    - Sliding Window
    - HashMap-based string problems
    - Pattern-based DSA questions

---

## 🚀 Next Step
Move to:
- Sliding Window on Strings
- HashMap String Problems
- Advanced String Patterns