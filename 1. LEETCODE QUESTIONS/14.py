"""
PROBLEM NO. - 217 --> Contains Duplicate:

PROBLEM LINK - https://leetcode.com/problems/contains-duplicate/

Given an integer array nums, return true if any value appears at least twice in the array, and
return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true
"""

"""
Method - 1 using count method:- 

# def containsDuplicate(nums: [int]):
#     for i in nums:
#         if nums.count(i) > 1:
#             return True
#         else:
#             return False
# print(containsDuplicate([1, 1, 1, 3, 3, 4, 3, 2, 4, 2]))
"""


# Method - 2
def containsDuplicate(nums: list[int]) -> bool:
    seen = set()
    for num in nums:
        if num in seen:
            return True
        seen.add(num)
    return False


print(containsDuplicate([1, 2, 3, 1]))
print(containsDuplicate([1, 2, 3, 4]))
print(containsDuplicate([1, 1, 1, 3, 3, 4, 3, 2, 4, 2]))
