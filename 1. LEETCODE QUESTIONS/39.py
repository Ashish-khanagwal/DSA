'''
PROBLEM 229 -> Majority Element II

PROBLEM LINK -> https://leetcode.com/problems/majority-element-ii/

Given an integer array of size n, find all elements that appear more than ⌊n/3⌋ times.

Example 1:
Input: nums = [3,2,3]
Output: [3]

Example 2:
Input: nums = [1]
Output: [1]

Example 3:
Input: nums = [1,2]
Output: [1,2]
'''

'''
MISRA GRIES ALGORITHM 

from collections import Counter

def misra_gries(nums):
  k = 3
  # Step 1: first pass - find candidates
  counters = {}

  for x in nums:
    if x in counters:
      counters[x] += 1
    elif len(counters) < k-1:
      counters[x] = 1
    else:
      # decrement all counters
      to_remove = []
      for key in counters:
        counters[key] -= 1
        if counters[key] == 0:
          to_remove.append(key)
      for key in to_remove:
        del counters[key]

  # Step 2: verify real counts
  # Reset counts for only the candidates
  real_counts = Counter()
  for x in nums:
    if x in counters:
      real_counts[x] += 1

  n = len(nums)
  result = [x for x in real_counts if real_counts[x] > n // k]
  return result

print(misra_gries([3,2,3]))
print(misra_gries([1]))
print(misra_gries([1, 2]))
'''

from collections import defaultdict
def majorityElement(nums):
  k = 3
  count = defaultdict(int)
  for n in nums:
    count[n] += 1

    if len(count) <= k-1:
      continue
    
    new_count = defaultdict(int)
    for n, c in count.items():
      if c > 1:
        new_count[n] = c - 1
    count = new_count
  
  res = []
  for n in count:
    if nums.count(n) > len(nums) // k:
      res.append(n)
  return res

print(majorityElement([3,2,3]))
print(majorityElement([1]))
print(majorityElement([1, 2]))