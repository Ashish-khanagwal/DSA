'''
PROBLEM 560 -> Subarray Sum Equals K

PROBLEM LINK -> https://leetcode.com/problems/subarray-sum-equals-k/

Given an array of integers nums and an integer k, return the total number of subarrays whose sum 
equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2

Constraints:
1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107
'''

from typing import List

def subarraySum(nums: List[int], k: int) -> int:
  count = 0
  prefix_sum = 0
  prefix_map = {0: 1}  # base case: one way to have sum = 0

  for num in nums:
    prefix_sum += num
    if prefix_sum - k in prefix_map:
        count += prefix_map[prefix_sum - k]
    prefix_map[prefix_sum] = prefix_map.get(prefix_sum, 0) + 1

  return count

print(subarraySum([1,1,1], 2))
print(subarraySum([1,2,3], 3))