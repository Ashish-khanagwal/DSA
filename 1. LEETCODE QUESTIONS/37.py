'''
PROBLEM 88 -> Merge Sorted Array

PROBLEM LINK -> https://leetcode.com/problems/merge-sorted-array/

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
and two integers m and n, representing the number of elements in nums1 and nums2 
respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored 
inside the array nums1. To accommodate this, nums1 has a length of m + n, 
where the first m elements denote the elements that should be merged, and the 
last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].

Example 3:
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
'''

'''
def merge(num1, m, num2, n):
  l, r, = 0, 0
  i = 0

  if m == 0:
    temp = num2

  L_len = len(num1)
  R_len = len(num2) 
  temp = [0]* (m+n)

  while l < m and r < R_len:
    if num1[l] < num2[r]:
      temp[i] = num1[l]
      l += 1
    else:
      temp[i] = num2[r]
      r += 1
    i += 1

  if num1[l] != 0:
    while l < L_len:
      temp[i] = num1[l]
      l+=1
      i += 1
  while r < R_len:
    temp[i] = num2[r]
    r+= 1
    i += 1
  print(temp)

merge([1,2,3,0,0,0], 3, [2,5,6], 3)
merge([1], 1, [], 0)
merge([0], 0, [1], 1)
'''

def merge(nums1, m , nums2, n):
  p1 = m - 1
  p2 = n - 1
  p = m + n - 1

  while p1 >= 0 and p2 >= 0:
    if nums1[p1] > nums2[p2]:
      nums1[p] = nums1[p1]
      p1 -= 1
    else:
      nums1[p] = nums2[p2]
      p2 -= 1
    p -= 1
    
  while p2 >= 0:
    nums1[p] = nums2[p2]
    p2 -= 1
    p -= 1
  print(nums1)


merge([1,2,3,0,0,0], 3, [2,5,6], 3)
merge([1], 1, [], 0)
merge([0], 0, [1], 1)