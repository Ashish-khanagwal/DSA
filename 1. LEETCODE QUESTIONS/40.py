'''
PROBLEM 75 -> Sort Colors

PROBLEM LINK -> https://leetcode.com/problems/sort-colors/

Given an array nums with n objects colored red, white, or blue, sort them in-place so that 
objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, 
respectively.

You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
'''

'''
USING COUNTING SORT

def sortColors(nums):
  n = len(nums)
  maxx = max(nums)
  counts = [0]* (maxx+1)

  for i in nums:
    counts[i] += 1

  i = 0
  for c in range(maxx+1):
    while counts[c] > 0:
      nums[i] = c
      i += 1
      counts[c] -= 1
  return nums


print(sortColors([2,0,2,1,1,0]))
print(sortColors([2,0,1]))
'''

'''
## DNF (Dutch National Flag) Algorithm

- Single pass (O(n)): Each element is checked at most once.
- In-place (O(1)): No extra memory needed.
- Better than counting sort because we dont need additional arrays.
- Better than general sorting because we dont waste time with unnecessary comparisons.
'''

def sortColors(nums):
  l, r = 0, len(nums)-1
  i = 0

  while i <= r:
    if nums[i] == 0:
      nums[i], nums[l] = nums[l], nums[i]
      l += 1
    elif nums[i] == 2:
      nums[i], nums[r] = nums[r], nums[i]
      r -= 1
      i -= 1
    i += 1
  return nums

print(sortColors([2,0,2,1,1,0]))
print(sortColors([2,0,1]))