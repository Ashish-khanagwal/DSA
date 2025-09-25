'''
PROBLEM -> Second Largest

PROBLEM LINK -> https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&sortBy=submissions

Given an array of positive integers arr[], return the second largest element from the array. 
If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.
'''

def getSecondLargest(nums):
  largest = second_largest = float('-inf')
  for i in range(len(nums)):
    if nums[i] > largest:
      second_largest = largest
      largest = nums[i]
    elif nums[i] > second_largest and nums[i] != largest:
      second_largest = nums[i]

  return second_largest if second_largest != float('-inf') else -1

print(getSecondLargest([12, 35, 1, 10, 34, 1]))
print(getSecondLargest([10, 5, 10]))
print(getSecondLargest([10, 10, 10]))