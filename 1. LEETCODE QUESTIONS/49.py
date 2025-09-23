'''
PROBLEM 485 -> Max Consecutive Ones

PROBLEM LINK -> https://leetcode.com/problems/max-consecutive-ones/

Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2
'''

def findMaxConsecutiveOnes(nums: list[int]) -> int:
  count = 0
  maxx = 0
  for i in nums:
    if i == 1:
      count += 1
    else:
      count = 0
    maxx = max(maxx, count)
  return maxx

print(findMaxConsecutiveOnes([1,1,0,1,1,1]))
print(findMaxConsecutiveOnes([1,0,1,1,0,1]))