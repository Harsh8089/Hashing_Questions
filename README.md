## Q-1

Given 2 arrays named as `serverLoad` & `serverCapacity` of length n1 and n2 respectively, the goal is to minimise total cost of the server.
<br>
Total cost of server is calculated as `dot product` of 2 initial arrays.
<br>
In order to minimise the cost of server, you can `swap` the position of elements in `serverCapacity` only. 
<br>
In case multiple sequences result in the same minimum total cost, return the sequence
that is `lexicographically smallest`.

`Constraints`: <br>
1 <= n1, n2 <= 10^3
1 <= elements of serverLoad and serverCapacity <= 10^9

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

Given a string containing only `0`, `1` and `2`, find minimum operation required to convert a original string into a string with equal number of `0s` and `1s`. 
<br>
In one operation you can delete any character (`0`, `1` and `2`) from start of string or from the end of string.
If it's not possible to convert into string with equal number of `0s` and `1s`, print `-1`.
<br>
`Note`: The length of converted string (i.e with equal number of `0s` and `1s`) should be greater than 0. 

`Constraints`: <br>
1 <= length(string) <= 10^5

`Test Case-1`: <br>
Input: str = "01201" <br> Output:0  <br>
Explanation:<br> string str already contains equal number of 0's and 1's with a count = 2. 

`Test Case-2`: <br>
Input: str = "12011220112002" <br> Output: 1 <br>
Explanation:<br> Delete `1` from start of the string. Resulting string str = "2011220112002", where count of 0's = 4 and count of 1's = 4.

`Test Case-3`: <br>
Input: str = "220" <br> Output: 1<br>
Explanation:<br> Delete `0` from end of the string. Resulting string str = "22", where count of 0's = 0 and count of 1's = 0.

`Test Case-4`: <br>
Input: str = "00" <br> Output: -1<br>
Explanation:<br> It's not possible to convert into string with equal number of 0's and 1's.
