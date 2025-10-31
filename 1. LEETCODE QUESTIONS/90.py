'''
PROBLEM 3289 -> The Two Sneaky Numbers of Digitville

PROBLEM LINK -> https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville

In the town of Digitville, there was a list of numbers called nums containing integers from 0 to 
n - 1. Each number was supposed to appear exactly once in the list, however, two mischievous numbers 
sneaked in an additional time, making the list longer than usual.

As the town detective, your task is to find these two sneaky numbers. Return an array of size two 
containing the two numbers (in any order), so peace can return to Digitville.

Example 1:
Input: nums = [0,1,1,0]
Output: [0,1]
Explanation:
The numbers 0 and 1 each appear twice in the array.

Example 2:
Input: nums = [0,3,2,1,3,2]
Output: [2,3]
Explanation:
The numbers 2 and 3 each appear twice in the array.

Example 3:
Input: nums = [7,1,5,4,3,4,6,0,9,5,8,2]
Output: [4,5]
Explanation:
The numbers 4 and 5 each appear twice in the array.

Constraints:
2 <= n <= 100
nums.length == n + 2
0 <= nums[i] < n
The input is generated such that nums contains exactly two repeated elements.
'''

from typing import List

def getSneakyNumbers(nums: List[int]) -> List[int]:
    n = len(nums) - 2
    sum_nums = sum(nums)
    sum_sq = sum(x * x for x in nums)

    # Expected sums
    expected_sum = n * (n - 1) // 2
    expected_sq_sum = (n - 1) * n * (2 * n - 1) // 6

    # Differences
    x = sum_nums - expected_sum       # a + b
    y = sum_sq - expected_sq_sum      # a² + b²

    # Find ab using the formula
    ab = ((x * x) - y) // 2

    # Now solve quadratic: t² - x*t + ab = 0
    import math
    a = (x + math.isqrt(x * x - 4 * ab)) // 2
    b = x - a

    return [b, a]

print(getSneakyNumbers([0,1,1,0]))
print(getSneakyNumbers([0,3,2,1,3,2]))
print(getSneakyNumbers([7,1,5,4,3,4,6,0,9,5,8,2]))