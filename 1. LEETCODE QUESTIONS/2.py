"""
PROBLEM - 1 -> Two Sum

PROBLEM LINK -> https://leetcode.com/problems/two-sum/

Given an array of integers nums and an integer target, return indices of the two numbers such that
they add up to target.

EXAMPLE:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
"""


'''
This solution does gives the answer but it is O(n^2) time complexity

def twoSum(nums: list[int], target: int) -> list[int]:
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                num = [i, j]
                return [i, j]


print(twoSum([2,7,11,15], 9))
print(twoSum([3, 2, 4], 6))
print(twoSum([3, 3], 6))
'''

def twoSum(nums: list[int], target: int) -> list[int]:
    hashmap = {}
    for i, num in enumerate(nums):
        value = target - num
        if value in hashmap:
            return [hashmap[value], i]
        hashmap[num] = i
    return []


print(twoSum([2, 7, 11, 15], 9))
print(twoSum([3, 2, 4], 6))
print(twoSum([3, 3], 6))