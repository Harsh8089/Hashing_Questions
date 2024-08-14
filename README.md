## Q-1

Given 2 arrays named as `serverLoad` & `serverCapacity` of length n1 and n2 respectively, the goal is to minimise total cost of the server.
<br>
Total cost of server is calculated as `dot product` of 2 initial arrays.
<br>
In order to minimise the cost of server, you can `swap` the position of elements in `serverCapacity` only. 
<br>
In case multiple sequences result in the same minimum total cost, return the sequence
that is `lexicographically smallest`.

Constraints: <br>
1 <= n1, n2 <= 10^5

`Test Case-1`: <br>
Input: serverLoad = [3, 1, 2], serverCapacity = [4, 5, 6] <br> Output: [4, 6, 5] <br>
Explanation:<br>The total cost of server is calculated as - 3 * 4 + 1 * 5 + 2 * 6 = 29. <br>But there exist a sequence - [4, 6, 5] for which the total cost of server is minimum.  

`Test Case-2`: <br>
Input: serverLoad = [6, 3, 8, 1], serverCapacity = [1, 4, 3, 9] <br> Output: [3, 4, 1, 9] <br>

`Test Case-3`: <br>
Input: serverLoad = [7, 2, 7, 3], serverCapacity = [5, 1, 4, 6] <br> Output: [1, 6, 4, 5] <br>
Explanation:<br> There exist multiple sequence which can minimise total cost.  <br> 1st sequence - [1, 6, 4, 5] <br> 2nd sequence - [4, 6, 1, 5] <br> Since element at 0th index of sequence-1 is smaller than element at 0th index of sequence-2, the output would be sequence-1  

`Input Format for Test Case-3`: <br>
```
4 4 
7 2 7 3
5 1 4 6
```
`Output Format for Test Case-3`: <br>
```
1 6 4 5
```
## Q-2

