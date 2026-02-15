# 📘 Cyclic Sort Pattern

This folder contains **all major Cyclic Sort problems**, solved using a **single core idea** with different interpretations.

Cyclic Sort is not about sorting for output —  
it is about **placing elements at their correct indices** to reveal missing or duplicate values.

* * *

## 🔹 What is Cyclic Sort?

Cyclic Sort is an **in-place sorting technique** used when:

-   Elements are integers

-   Values lie in a **known continuous range**

-   Each value has a **direct index mapping**


### Index Mapping Rule

-   Range `[1, n]` → correct index = `value - 1`

-   Range `[0, n]` → correct index = `value`


* * *

## 🔹 When to Use Cyclic Sort

Use this pattern when the problem asks for:

-   Missing numbers

-   Duplicate numbers

-   Smallest missing positive

-   Misplaced elements


❌ Do NOT use when:

-   Numbers are arbitrary

-   Values are not index-mappable

-   Floating point values exist


* * *

## 🔹 Generic Cyclic Sort Template

```java
int i = 0;
while (i < arr.length) {
    // 1. Calculate where the element SHOULD be
    int correct = arr[i] - 1; // Or arr[i] for [0, n] range

    // 2. Swap if it's not in the right place
    // Note: The second check prevents infinite loops with duplicates
    if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
        swap(arr, i, correct);
    } else {
        i++;
    }
}
```
* * *

## 🔹 Time & Space Complexity

| Metric | Complexity |
| --- | --- |
| Time | **O(n)** |
| Space | **O(1)** (in-place) |
| Extra Space | Only for output (if required) |

Why O(n)?

-   Every element is swapped **at most once** to its correct position.


* * *

## 📂 Problems Covered

| Class Name | Problem Type | Key Output |
| --- | --- | --- |
| `MissingNumber` | Missing number | One missing |
| `DisappearedNumbersInArray` | Missing numbers | Multiple missing |
| `DuplicateNumber` | Duplicate number | One duplicate |
| `FindDuplicates` | Duplicate numbers | Multiple duplicates |
| `SetMismatch` | Duplicate + missing | One each |
| `FirstMissingPositive` | Hard variant | Smallest missing positive |

* * *

## 🔹 Core Idea Across All Problems

> The cyclic sort algorithm **never changes**.  
> Only the **interpretation of the final array** changes.

After cyclic sort:

-   If `arr[i] == i + 1` → correct

-   If `arr[i] != i + 1` → indicates missing or duplicate


* * *

## 🔹 Difficulty Progression

### Easy

-   Missing Number

-   Disappeared Numbers  
    👉 Just place elements and scan for mismatches


### Medium

-   Duplicate Number

-   Find Duplicates

-   Set Mismatch  
    👉 Duplicates block placement — detect failures


### Hard

-   First Missing Positive  
    👉 Ignore invalid values (`≤ 0` or `> n`) and apply cyclic sort selectively


* * *

## 🔹 Key Interview Insight

Before coding, ask:

1.  Are values in a fixed range?

2.  Can values be mapped to indices?

3.  Is the problem about missing / duplicate elements?


If **YES**, cyclic sort should be your **first approach**.

* * *

## 🔹 Why Cyclic Sort is Important

-   One pattern → many problems

-   No extra memory

-   Clean and optimal

-   Frequently asked in interviews


Mastering this pattern eliminates:

-   Unnecessary hash sets

-   Extra arrays

-   Brute force solutions


* * *

## ✅ Status

✔ Cyclic Sort pattern **fully covered**  
✔ All major variants implemented  
✔ Ready for interviews and revision