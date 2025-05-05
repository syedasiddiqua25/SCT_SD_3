## Sample Output

 Welcome to the sudoku solver! 
 Type initial values separated by spaces, 
with zeros for blank spots. 
  Enter row values:  5 3 0 0 7 0 0 0 0 
  Enter row values:  6 0 0 1 9 5 0 0 0
  Enter row values:  0 9 8 0 0 0 0 6 0
  Enter row values:  8 0 0 0 6 0 0 0 3
  Enter row values:  4 0 0 8 0 3 0 0 1
  Enter row values:  7 0 0 0 2 0 0 0 6
  Enter row values:  0 6 0 0 0 0 2 8 0 
  Enter row values:  0 0 0 4 1 9 0 0 5
  Enter row values:  0 0 0 0 8 0 0 7 9 
Initial state:
+-------+-------+-------+
| 5 3 _ | _ 7 _ | _ _ _ |
| 6 _ _ | 1 9 5 | _ _ _ |
| _ 9 8 | _ _ _ | _ 6 _ |
+-------+-------+-------+
| 8 _ _ | _ 6 _ | _ _ 3 |
| 4 _ _ | 8 _ 3 | _ _ 1 |
| 7 _ _ | _ 2 _ | _ _ 6 |
+-------+-------+-------+
| _ 6 _ | _ _ _ | 2 8 _ |
| _ _ _ | 4 1 9 | _ _ 5 |
| _ _ _ | _ 8 _ | _ 7 9 |
+-------+-------+-------+
Solved state:
+-------+-------+-------+
| 5 3 4 | 6 7 8 | 9 1 2 |
| 6 7 2 | 1 9 5 | 3 4 8 |
| 1 9 8 | 3 4 2 | 5 6 7 |
+-------+-------+-------+
| 8 5 9 | 7 6 1 | 4 2 3 |
| 4 2 6 | 8 5 3 | 7 9 1 |
| 7 1 3 | 9 2 4 | 8 5 6 |
+-------+-------+-------+
| 9 6 1 | 5 3 7 | 2 8 4 |
| 2 8 7 | 4 1 9 | 6 3 5 |
| 3 4 5 | 2 8 6 | 1 7 9 |
+-------+-------+-------+
<pre><code>## 🖥️ Sample Output ``` Welcome to the sudoku solver! Type initial values separated by spaces, with zeros for blank spots. Enter row values: 5 3 0 0 7 0 0 0 0 Enter row values: 6 0 0 1 9 5 0 0 0 Enter row values: 0 9 8 0 0 0 0 6 0 Enter row values: 8 0 0 0 6 0 0 0 3 Enter row values: 4 0 0 8 0 3 0 0 1 Enter row values: 7 0 0 0 2 0 0 0 6 Enter row values: 0 6 0 0 0 0 2 8 0 Enter row values: 0 0 0 4 1 9 0 0 5 Enter row values: 0 0 0 0 8 0 0 7 9 Initial state: +-------+-------+-------+ | 5 3 _ | _ 7 _ | _ _ _ | | 6 _ _ | 1 9 5 | _ _ _ | | _ 9 8 | _ _ _ | _ 6 _ | +-------+-------+-------+ | 8 _ _ | _ 6 _ | _ _ 3 | | 4 _ _ | 8 _ 3 | _ _ 1 | | 7 _ _ | _ 2 _ | _ _ 6 | +-------+-------+-------+ | _ 6 _ | _ _ _ | 2 8 _ | | _ _ _ | 4 1 9 | _ _ 5 | | _ _ _ | _ 8 _ | _ 7 9 | +-------+-------+-------+ Solved state: +-------+-------+-------+ | 5 3 4 | 6 7 8 | 9 1 2 | | 6 7 2 | 1 9 5 | 3 4 8 | | 1 9 8 | 3 4 2 | 5 6 7 | +-------+-------+-------+ | 8 5 9 | 7 6 1 | 4 2 3 | | 4 2 6 | 8 5 3 | 7 9 1 | | 7 1 3 | 9 2 4 | 8 5 6 | +-------+-------+-------+ | 9 6 1 | 5 3 7 | 2 8 4 | | 2 8 7 | 4 1 9 | 6 3 5 | | 3 4 5 | 2 8 6 | 1 7 9 | +-------+-------+-------+ ``` </code></pre>
