'''
PROBLEM 27 -> Remove Element

PROBLEM LINK -> https://leetcode.com/problems/remove-element/

Given an integer array nums and an integer val, remove all occurrences of val in nums 
in-place. The order of the elements may be changed. Then return the number of elements in
nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, 
you need to do the following things:

- Change the array nums such that the first k elements of nums contain the elements which are
not equal to val. The remaining elements of nums are not important as well as the size of
nums.
- Return k.

Custom Judge:
The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

Example 1:
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
'''

def removeElement(nums: list[int], val: int) -> int:
  l = 0
  for i in range(len(nums)):
    if nums[i] != val:
      nums[l] = nums[i]
      l += 1
  return l

'''
def removeElement(nums: list[int], val: int) -> int: 
  l = 0 r = len(nums) - 1 
  while l <= r: 
    if nums[r] == val: 
      nums.remove(nums[r]) 
      r -= 1 
    if nums[l] == val: 
      nums.remove(nums[l]) 
      l += 1 
    l += 1 
    r -= 1 
  return len(nums)

🔴 Problem in before Approach

- You were trying to shrink the array with remove(), which changes indices → dangerous with 
two pointers.

- Instead, with two pointers, the correct trick is to swap the unwanted value with the last
element and shrink the array from the end.

- This way, we don’t need remove() at all.


def removeElement(nums: list[int], val: int) -> int:
    l, r = 0, len(nums) - 1
    while l <= r:
        if nums[l] == val:
            nums[l] = nums[r]   # overwrite with last element
            r -= 1              # shrink the array
        else:
            l += 1              # move forward if element is fine
    return l
'''

print(removeElement([3, 3], 3))
print(removeElement([1], 1))
print(removeElement([3,2,2,3], 3))
print(removeElement([0,1,2,2,3,0,4,2], 2))