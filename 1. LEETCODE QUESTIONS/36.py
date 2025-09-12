'''
PROBLEM 189 -> Rotate Array

PROBLEM LINK -> https://leetcode.com/problems/rotate-array/

Given an integer array nums, rotate the array to the right by k steps, where k is 
non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
'''

'''
THIS METHOD IS GOOD BUT NOT OPTIMAL, T.C = O(n*k) IN BIG ARRAYS K CAN BE LARGE, WHICH WILL
TAKE AMPLE AMOUNT OF TIME.

def rotate(nums, k):
  while k > 0:
    last = nums.pop()
    nums.insert(0, last)
    k -= 1
  print(nums)

rotate([1,2,3,4,5,6,7], 3)
rotate([-1,-100,3,99], 2)
'''

def rotate(nums, k):
  n = len(nums)
  k %= n

  def reverse(start, end):
    while start < end:
      nums[start], nums[end] = nums[end], nums[start]
      start += 1
      end -= 1
  
  # reverse the whole array
  reverse(0, n-1)

  # reverse till k-1
  reverse(0, k-1)

  # reverse from k till n-1
  reverse(k, n-1)

  print(nums)

rotate([1,2,3,4,5,6,7], 3)
rotate([-1,-100,3,99], 2)