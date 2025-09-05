"""
PROBLEM 2239 -> Find Closest number to zero

PROBLEM LINK -> https://leetcode.com/problems/find-closest-number-to-zero/

Given an integer array nums of size n, return the number with the value closest to 0 in nums.
If there are multiple answers, return the number with the largest value.

Example 1:

Input: nums = [-4,-2,1,4,8]
Output: 1
Explanation:
The distance from -4 to 0 is |-4| = 4.
The distance from -2 to 0 is |-2| = 2.
The distance from 1 to 0 is |1| = 1.
The distance from 4 to 0 is |4| = 4.
The distance from 8 to 0 is |8| = 8.
Thus, the closest number to 0 in the array is 1.
Example 2:

Input: nums = [2,-1,1]
Output: 1
Explanation: 1 and -1 are both the closest numbers to 0, so 1 being larger is returned.
"""


def findClosestNumber(nums: list[int]):
    closest = nums[0]
    for i in nums:
        if abs(i) < abs(closest):
            closest = i

    if closest < 0 and abs(closest) in nums:
        return abs(closest)
    else:
        return closest


if __name__ == "__main__":
    print(findClosestNumber([-4, -2, 1, 4, 8]))
    print(findClosestNumber([2, -1, 1]))
    print(findClosestNumber([-4, 3, -3, 2, -4]))
