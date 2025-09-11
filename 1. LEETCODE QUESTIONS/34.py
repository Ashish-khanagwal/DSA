'''
PROBLEM 680 -> Valid Palindrome II

PROBLEM LINK -> https://leetcode.com/problems/valid-palindrome-ii/

Given a string s, return true if the s can be palindrome after deleting at most one character 
from it.

Example 1:
Input: s = "aba"
Output: true

Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

Example 3.
Input: s = "abc"
Output: false
'''

def validPalindrome(s: str):

  if s == "" or len(s) == 1:
    return True

  def is_Palindrome(l, r):
    while l < r:
      if s[l] != s[r]:
        return False
      l += 1
      r -= 1
    return True
  
  l, r, = 0, len(s) -1
  while l < r:
    if s[l] != s[r]:
      return is_Palindrome(l+1, r) or is_Palindrome(l, r-1)
    l += 1
    r -= 1
  return True


print(validPalindrome("z"))
print(validPalindrome("zryxeededexyz"))
print(validPalindrome("eceec"))
print(validPalindrome("aba"))
print(validPalindrome("abca"))
print(validPalindrome("abc"))