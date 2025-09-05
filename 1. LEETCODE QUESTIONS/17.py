"""
PROBLEM 125 -> Valid Palindrome

PROBLEM LINK -> https://leetcode.com/problems/valid-palindrome/

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
removing all non-alphanumeric characters, it reads the same forward and backward.
Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
"""

"""
USING Recursion

def isPalindrome(i: int, s: str):
    temp = "".join(ch.lower() for ch in s if ch.isalnum())
    if i >= len(temp) / 2:
        return True
    if temp[i] != temp[len(temp) - i - 1]:
        return False
    return isPalindrome(i + 1, temp)
"""

"""
Two Pointers
"""


def isPalindrome(s: str) -> bool:
    l, r = 0, len(s) - 1
    while l < r:
        while l < r and not s[l].isalnum():
            l += 1
        while l < r and not s[r].isalnum():
            r -= 1

        if s[l].lower() != s[r].lower():
            return False

        l += 1
        r -= 1
    return True


if __name__ == "__main__":
    print(isPalindrome("A man, a plan, a canal: Panama"))
    print(isPalindrome("race a car"))
    print(isPalindrome(" "))
    print(isPalindrome("madam"))
