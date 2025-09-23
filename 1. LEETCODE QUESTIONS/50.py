'''
PROBLEM 34 -> Find First and Last Position of Element in Sorted Array

PROBLEM LINK -> https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

Given an array of integers nums sorted in non-decreasing order, find the starting and ending 
position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.


Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
'''
from typing import List

def searchRange(nums: List[int], target: int) -> List[int]:
  l, r = 0, len(nums) - 1
  found = -1
  
  while l <= r:
    m = (l + r) // 2
    if nums[m] == target:
      found = m
      break
    elif nums[m] < target:
      l = m + 1
    else:
      r = m - 1
  
  if found == -1:
    return [-1, -1]
  
  l = found
  while l > 0 and nums[l-1] == target:
    l -= 1
  
  r = found
  while r < len(nums) - 1 and nums[r+1] == target:
    r += 1

  return [l, r]

print(searchRange([5,7,7,8,8,10], 8))
print(searchRange([5,7,7,8,8,10], 6))
print(searchRange([], 0))