'''
PROBLEM 611 -> Valid Triangle Number

PROBLEM LINK -> https://leetcode.com/problems/valid-triangle-number/

Given an integer array nums, return the number of triplets chosen from the array that can make 
triangles if we take them as side lengths of a triangle.


Example 1:
Input: nums = [2,2,3,4]
Output: 3
Explanation: Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3

Example 2:
Input: nums = [4,2,3,4]
Output: 4
'''

def triangleNumber(nums: list[int]):

  # SORTING THE LIST

  def mergeSort(nums):
    n = len(nums)
    m = n // 2

    if len(nums) == 1:
      return nums
    
    L = nums[:m]
    R = nums[m:]

    L = mergeSort(L)
    R = mergeSort(R)

    L_len = len(L)
    R_len = len(R)
    l, r = 0, 0
    sorted_arr = [0]*n
    i = 0

    while l < L_len and r < R_len:
      if L[l] < R[r]:
        sorted_arr[i] = L[l]
        l += 1
      else:
        sorted_arr[i] = R[r]
        r += 1
      i += 1

    while l < L_len:
      sorted_arr[i] = L[l]
      l += 1
      i += 1
    
    while r < R_len:
      sorted_arr[i] = R[r]
      r += 1
      i += 1
    
    return sorted_arr
  
  # LOGIC FOR FINDING TRIPLETS

  n = len(nums)
  count = 0
  for k in range(n-1, 1, -1):
    i = 0
    j = k - 1
    while i < j:
      if nums[i] + nums[j] > nums[k]:
        count += (j - i)
        j -= 1
      else:
        i += 1

  return count

print(triangleNumber([2, 2, 3, 4]))
print(triangleNumber([4, 2, 3, 4]))