'''
PROBLEM -> Missing in Array

PROBLEM LINK -> https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&sortBy=submissions

You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 
to n (inclusive). This array represents a permutation of the integers from 1 to n with one 
element missing. Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.

Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.

Input: arr[] = [1]
Output: 2
Explanation: Only 1 is present so the missing element is 2.
'''

def missingNum(arr):
  res = 0
  for i in range(len(arr)):
    res ^= i ^ arr[i]

  return res ^ len(arr)

print(missingNum([1, 2, 3, 5]))
print(missingNum([8, 2, 4, 5, 3, 7, 1]))
print(missingNum([1]))