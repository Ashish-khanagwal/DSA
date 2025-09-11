'''
PROBLEM 345 -> Reverse Vowels of a String

PROBLEM LINK -> https://leetcode.com/problems/reverse-vowel-of-a-string/

Given a string s, reverse only all the vowel in the string and return it.

The vowel are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, 
more than once.

Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowel in s are ['I', 'e', 'e', 'A']. On reversing the vowel, s becomes "AceCreIm".

Example 2:
Input: s = "leetcode"
Output: "leotcede"
'''

def reverseVowels(s):
  l = 0
  r = len(s) - 1

  vowel = set('aeiouAEIOU')
  temp = list(s)
  
  while l < r:
      if temp[l] not in vowel:
          l += 1
      elif temp[r] not in vowel:
          r -= 1
      else:
          temp[l], temp[r] = temp[r], temp[l]
          l += 1
          r -= 1
      
  s = "".join(ch for ch in temp)
  return s


print(reverseVowels("IceCreAm"))
print(reverseVowels("leetcode"))