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


def twoSum(nums: [int], target: int) -> [int]:
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                num = [i, j]
                print(num)


nums = [2, 0, 2, 4]
target = 4
twoSum(nums, target)
