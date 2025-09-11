'''
PROBLEM 2785 -> Sort Vowels in a String

PROBLEM LINK -> https://leetcode.com/problems/sort-vowels-in-a-string/

Given a 0-indexed string s, permute s to get a new string t such that:

All consonants remain in their original places. More formally, if there is an index i with 
0 <= i < s.length such that s[i] is a consonant, then t[i] = s[i].
The vowels must be sorted in the nondecreasing order of their ASCII values. 
More formally, for pairs of indices i, j with 0 <= i < j < s.length such that s[i] and s[j] are vowels, 
then t[i] must not have a higher ASCII value than t[j]. Return the resulting string.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in lowercase or uppercase. 
Consonants comprise all letters that are not vowels.

Example 1:
Input: s = "lEetcOde"
Output: "lEOtcede"
Explanation: 'E', 'O', and 'e' are the vowels in s; 'l', 't', 'c', and 'd' are all consonants. The vowels are sorted according to their ASCII values, and the consonants remain in the same places.

Example 2:
Input: s = "lYmpH"
Output: "lYmpH"
Explanation: There are no vowels in s (all characters in s are consonants), so we return "lYmpH".
'''

'''
VERSION - 1

Time Complexity: O(n log n) — dominated by sorting the vowels.
Space Complexity: O(n) — for the list of characters to rebuild the string.

def sortVowels(s):
  vowels = set("aeiouAEIOU")
  v = sorted([c for c in s if c in vowels], key=ord)
  it = iter(v)
  f = []
  for c in s:
    if c not in vowels:
      f.append(c)
    else:
      f.append(next(it))
  t = "".join(ch for ch in f)
  return t

print(sortVowels("lEetcOde"))
print(sortVowels("lYmpH"))
'''

'''
VERSION - 2

PRECISE WAY

def sortVowels(s):
  vowels = set("aeiouAEIOU")
  v = sorted([c for c in s if c in vowels], key=ord)
  it = iter(v)
  return "".join(next(it) if c in vowels else c for c in s)

print(sortVowels("lEetcOde"))
print(sortVowels("lYmpH"))
'''

'''
VERSION - 3

BEST WAY -> COUNTING SORT
Time: O(n) (linear, practically)
Space: O(n)
'''

def sortVowels(s):
  vowels_set = set("aeiouAEIOU")
  # Step 1: Collect vowels from s
  vowels = [c for c in s if c in vowels_set]
  
  # Step 2: Counting sort based on ASCII values
  if not vowels:
    return s      # no vowels, return original
  
  min_ascii = min(ord(c) for c in vowels)
  max_ascii = max(ord(c) for c in vowels)
  k = max_ascii - min_ascii + 1

  count = [0]*k
  for c in vowels:
    count[ord(c) - min_ascii] += 1

  # Step 3: Reconstruct sorted vowels
  sorted_vowels = []
  for i in range(k):
    sorted_vowels.extend([chr(i + min_ascii)] * count[i])

  # Step 4: Replace vowels in original string
  it = iter(sorted_vowels)
  result = [next(it) if c in vowels_set else c for c in s]

  return "".join(result)

print(sortVowels("lEetcOde"))
print(sortVowels("lYmpH"))