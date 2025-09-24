'''
PROBLEM 540 -> Single Element in a Sorted Array

PROBLEM LINK -> 

You are given a sorted array consisting of only integers where every element appears exactly twice,
except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

Example 1:
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

Example 2:
Input: nums = [3,3,7,7,10,11,11]
Output: 10
'''
from typing import List

def singleNonDuplicate(nums: List[int]) -> int:
  l, r = 0, len(nums) - 1
  while l < r:
    m = (l + r) // 2
    if m % 2 == 1:
      m -= 1
    if nums[m] == nums[m+1]:
      l = m + 2
    else:
      r = m
  return nums[l]

print(singleNonDuplicate([1,1,2,3,3,4,4,8,8]))
print(singleNonDuplicate([3,3,7,7,10,11,11]))