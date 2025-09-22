'''
PROBLEM 283 -> Move Zeroes

PROBLEM LINK -> https://leetcode.com/problems/move-zeroes/

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of 
the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
'''

def moveZeroes(nums: list[int]):
  l = 0
  for i in range(len(nums)):
    if nums[i] != 0:
      nums[l] = nums[i]
      l += 1
    
  for i in range(l, len(nums)):
    nums[i] = 0
  return nums

print(moveZeroes([0, 0, 3, 4, 0, 7, 8, 0]))
print(moveZeroes([0,1,0,3,12]))
print(moveZeroes([0]))