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
'''

'''
But not an ideal solution for the problem as the space complexity is not smallest, hence
the HEAP SORT will be ideal here with 
space complextiy - O(1)
time complexity - O(n log n)
'''

def heapify(arr, n, i):
  largest = i
  left = 2*i+1
  right = 2*i+2

  if left < n and arr[left] > arr[largest]:
    largest = left
  if right < n and arr[right] > arr[largest]:
    largest = right
  if largest != i:
    arr[i], arr[largest] = arr[largest], arr[i]
    heapify(arr, n , largest)

def heapSort(arr):
  n = len(arr)

  # Building max heap
  for i in range(n//2-1, -1, -1):
    heapify(arr, n, i)

  # Building sored array by extracting element one by one
  for i in range(n-1, 1, -1):
    arr[0], arr[i] = arr[i], arr[0]
    heapify(arr, i, 0)

  return arr

print(heapSort([5,1,1,2,0,0]))
print(heapSort([5,2,3,1]))
print(heapSort([-4,0,7,4,9,-5,-1,0,-7,-1]))


'''
import heapq
HEAP SORT
Time Complexity - O(n log n )
Space Complexity - O(n)

def heapSort(arr):
  heapq.heapify(arr)
  n = len(arr)
  new_list = [0] * n

  for i in range(n):
    minn = heapq.heappop(arr)
    new_list[i] = minn

  return new_list

print(heapSort([1, 3, 5, 7, 9, 2, 4, 6, 8, 0]))
'''