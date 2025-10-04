'''
PROBLEM 238 -> Product of Array Except Self

PROBLEM LINK -> https://leetcode.com/problems/product-of-array-except-self/

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all 
the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Constraints:
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
'''

from typing import List

'''
def productExceptSelf(nums: List[int]) -> List[int]:
  n = len(nums)
  prefix = [0]*n
  suffix = [0]*n
  answer = [0]*n
  prefix[0] = 1
  suffix[n-1] = 1
  for i in range(1, n):
    prefix[i] = prefix[i-1] * nums[i-1]
  
  for i in range(n-2, -1, -1):
    suffix[i] = suffix[i+1] * nums[i+1]

  for i in range(n):
    answer[i] = prefix[i] * suffix[i]

  return answer
'''

def productExceptSelf(nums: List[int]) -> List[int]:
  n = len(nums)
  answer = [0]*n
  answer[0] = 1
  suffix = 1
  for i in range(1, n):
    answer[i] = answer[i-1] * nums[i-1]

  for i in range(n-1, -1, -1):
    answer[i] *= suffix
    suffix *= nums[i]
    
  return answer
  
print(productExceptSelf([1,2,3,4]))
print(productExceptSelf([-1,1,0,-3,3]))