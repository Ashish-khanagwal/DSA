'''
PROBLEM 658 -> Find K Closest Elements

PROBLEM LINK -> https://leetcode.com/problems/find-k-closest-elements/

Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the 
array. The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:

|a - x| < |b - x|, or
|a - x| == |b - x| and a < b

Example 1:
Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]

Example 2:
Input: arr = [1,1,2,3,4,5], k = 4, x = -1
Output: [1,1,2,3]

Constraints:
1 <= k <= arr.length
1 <= arr.length <= 104
arr is sorted in ascending order.
-104 <= arr[i], x <= 104
'''
from typing import List

def findClosestElements(arr: List[int], k: int, x: int) -> List[int]:
  l, r = 0, len(arr) - k
  
  while l < r: 
    m = (l + r) // 2

    if x - arr[m] > arr[m + k] - x:
      l = m + 1
    else:
      r = m

  return arr[l:l+k]

print(findClosestElements([1,2,3,4,5], 4, 3))
print(findClosestElements([1,1,2,3,4,5], 4, -1))