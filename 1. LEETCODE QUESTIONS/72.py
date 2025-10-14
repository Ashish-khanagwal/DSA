'''
PROBLEM 49 -> Group Anagrams

PROBELM LINK -> https://leetcode.com/problems/group-anagrams/

Given an array of strings strs, group the anagrams together. You can return the answer in any 
order.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:
There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]


Constraints:
1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
'''
from typing import List

def groupAnagrams(strs: List[str]) -> List[List[str]]:
  if len(strs) <= 1:
    return [strs]
  
  groups = {}

  for s in range(len(strs)):
    freq = [0]* 26
    
    for ch in strs[s]:
      freq[ord(ch) - ord('a')] += 1

    key = tuple(freq)

    if key in groups:
      groups[key].append(strs[s])
    else:
      groups[key] = [strs[s]]
      
  sorted_groups = sorted(groups.values(), key=lambda g: len(g))

  return sorted_groups

print(groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
print(groupAnagrams([""]))
print(groupAnagrams(["a"]))