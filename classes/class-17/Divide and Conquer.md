---
aliases:
- "D&C"
tags: 
---
# Divide and Conquer
Is an algorithm paradigm.  
This paradigm solves problems by employing the following strategy:
1. [[#Divide]]
2. [[#Conquer]]
3. [[#Combine]]

## Divide
Take the problem and divide it into smaller sub-problems.

## Conquer
Solve this sub problems recursively.

## Combine
Take the sub-problems's results as the solution for the main problem.

## Examples of Algorithms That Use This Paradigm
1. **[Quicksort](https://www.geeksforgeeks.org/quick-sort/)**
2. **[Merge Sort](https://www.geeksforgeeks.org/merge-sort/)**
3. **[Closest Pair of Points](https://www.geeksforgeeks.org/closest-pair-of-points-using-divide-and-conquer-algorithm/)**
4. **[Strassen’s Algorithm](https://www.geeksforgeeks.org/strassens-matrix-multiplication/)**
5. **[Cooley–Tukey Fast Fourier Transform (FFT) algorithm](http://en.wikipedia.org/wiki/Cooley%E2%80%93Tukey_FFT_algorithm)**

## Practical Example
### Problem
*"Give the following plot of land, divide it into smaller but even plots of land"*. Let's use the following plot to analyze and solve the problem.  
![[Pasted image 20220902105126.png|center]]

### First Analysis
We know the following divisions are wrong for different reasons.  

![[Pasted image 20220902105231.png|center]]  
If we are to solve this issue basing ourselves on the D&C paradigms, we must:
1. Define the base case (*The simplest possible case*)
2. Divide the main problem until it resembles the base case.

### Step 1 - Define Base Case
We could consider our base case to be a rectangular plot of land which perimeter is defined as $3l$. It would look something like this:  
![[D&C - 1.excalidraw|center]]  
![[D&C - 2.excalidraw|600|center]]

### Step 3 - Recursively Divide Main Problem to Base Case
Taking our main problem, we could try to test if it is already our base case, meaning its shortest side is half of the other.  
![[D&C - 3.excalidraw|center|600]]  
In this practical example, starting with a plot of 1680x640, our base case is a plot of 160×80 meaning the biggest even plot of land is one of 80×80.  
![[Pasted image 20220902120616.png|center]]

The steps we took to find our base case is our algorithm.

### Summary
What we've done is find the GCD (Greatest Common Divider) of the 2 sides, as this is the greatest number that can divide evenly both sides. The algorithm to find the GCD is better explained in [here](https://www.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm).

# Sources
1. [Grokking Algorithms](https://learning.oreilly.com/library/view/grokking-algorithms/9781617292231/)
2. [GfG](https://www.geeksforgeeks.org/divide-and-conquer/)
3. [Khan Academy](https://www.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm).
