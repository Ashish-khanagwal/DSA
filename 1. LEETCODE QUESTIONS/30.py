'''
PROBLEM 912 -> SORT AN ARRAY

PROBLEM LINK -> https://leetcode.com/problems/sort-an-array/

Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) 
time complexity and with the smallest space complexity possible.

Example 1:
Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).

Example 2:
Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessarily unique.
'''

'''
# time complexity - O(n log n)
# space complexity - O(n)
def sortArray(nums: list[int]) -> list[int]:
  n = len(nums)
  
  if n == 1:
    return nums
  
  m = len(nums) // 2

  L = nums[:m]
  R = nums[m:]

  L = sortArray(L)
  R = sortArray(R)

  L_len = len(L)
  R_len = len(R)

  l, r = 0, 0
  sortedArr = [0]*n
  i = 0

  while l < L_len and r < R_len:
    if L[l] < R[r]:
      sortedArr[i] = L[l]
      l += 1
    else:
      sortedArr[i] = R[r]
      r += 1
    i += 1
  while l < L_len:
    sortedArr[i] = L[l]
    l += 1
    i += 1
  while r < R_len:
    sortedArr[i] = R[r]
    r += 1
    i += 1
  return sortedArr

print(sortArray([5,1,1,2,0,0]))
print(sortArray([5,2,3,1]))

But not an ideal solution for the problem as the space complexity is not smallest, hence
the HEAP SORT will be ideal here with space complextiy - O(1).
'''