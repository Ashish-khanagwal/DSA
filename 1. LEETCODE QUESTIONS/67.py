'''
PROBLEM 567 -> Permutation in String

PROBLEM LINK -> https://leetcode.com/problems/permutation-in-string/

Given two strings s1 and s2, return true if s2 contains a permutation of s1, or 
false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.


Example 1:
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").

Example 2:
Input: s1 = "ab", s2 = "eidboaoo"
Output: false

Constraints:
1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.
'''
def checkInclusion(s1: str, s2: str) -> bool:
  n = len(s1)
  m = len(s2)

  if n > m:
    return False
  
  hashmap = {}
  for s in s1:
    hashmap[s] = hashmap.get(s, 0) + 1

  window_map = {}
  for r in range(n):
    window_map[s2[r]] = window_map.get(s2[r], 0) + 1

  if window_map == hashmap:
    return True

  for i in range(n, m):
    l = s2[i - n]
    window_map[l] -= 1

    if window_map[l] == 0:
      del window_map[l]

    r = s2[i]
    window_map[r] = window_map.get(r, 0) + 1

    if window_map == hashmap:
      return True
  
  return False

print(checkInclusion("ab", "eidbaooo"))
print(checkInclusion("ab", "eidboaoo"))