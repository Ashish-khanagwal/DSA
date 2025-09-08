"""
PROBLEM 219 -> Contains Duplicate II

PROBLEM LINK -> https://leetcode.com/problems/contains-duplicate-ii/

Easy

Given an integer array nums and an integer k, return true if there are two distinct indices
i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
"""

# def containsNearbyDuplicate(nums: list[int], k: int) -> bool:
#     freq = {}
#     for i in range(len(nums)):
#         if nums[i] not in freq:
#             freq[nums[i]] = []
#         freq[nums[i]].append(i)
#     for indices in freq.values():
#         for i in range(1, len(indices)):
#             difference = indices[i] - indices[i - 1]
#             if difference <= k:
#                 return True
#     return False


# Below is solved using sliding window and hash-set.

def containsNearbyDuplicate(nums: list[int], k: int) -> bool:
    seen = set()
    l = 0

    for r in range(len(nums)):
        if r - l > k:
            seen.remove(nums[l])
            l += 1
        if nums[r] in seen:
            return True
        seen.add(nums[r])
    return False


print(containsNearbyDuplicate([1, 2, 3, 1], 3))
print(containsNearbyDuplicate([1, 0, 1, 1], 1))
print(containsNearbyDuplicate([1, 2, 3, 1, 2, 3], 2))
