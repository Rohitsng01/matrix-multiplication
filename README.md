# Matrix Multiplication

## Overview
A Java program that performs matrix operations including **addition** and **multiplication** on two matrices of the same dimensions.

## Features
- ✅ Matrix Addition - Adds corresponding elements of two matrices
- ✅ Matrix Multiplication - Multiplies corresponding elements
- ✅ Matrix Display - Formatted output with tab-separated values
- ✅ User Input - Interactive console-based input for matrix elements

## Requirements
- Java JDK 8 or higher

## How to Run

### Compile
```bash
javac Exp2.java
```

### Execute
```bash
java Exp2
```

### Input Example
```
Enter number of rows: 2
Enter number of columns: 2
Matrix1[0][0] = 1
Matrix1[0][1] = 2
Matrix1[1][0] = 3
Matrix1[1][1] = 4
Matrix2[0][0] = 5
Matrix2[0][1] = 6
Matrix2[1][0] = 7
Matrix2[1][1] = 8
```

### Output Example
```
Matrix 1:
1	2	
3	4	

Matrix 2:
5	6	
7	8	

Sum of two matrices:
6	8	
10	12	

Product of two matrices:
19	22	
43	50	
```

## Code Structure

### Main Components
1. **Matrix Input** - Two-dimensional arrays populated from user input
2. **Matrix Addition** - Element-wise addition
3. **Matrix Multiplication** - Standard matrix multiplication algorithm
4. **Display Method** - `displayMatrix()` helper function for formatted output

## File Structure
```
.
├── Exp2.java
└── README.md
```

## Notes
- Both matrices must have the same dimensions for addition
- Matrix multiplication follows standard linear algebra rules
- Scanner resource is properly closed after use

## License
Educational purposes - Lab Assignment

---
**Lab 2 Experiment 2**
