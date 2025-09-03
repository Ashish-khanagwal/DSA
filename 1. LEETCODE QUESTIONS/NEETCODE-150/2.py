"""
PRPBLEM NO. - 242 -> Valid Anagram

PROBLEM LINK - https://leetcode.com/problems/valid-anagram/

Given two strings s and t, return true if t is an anagram of s, and
false otherwise.

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
"""

"""
METHOD - 1 --> Here we used List.

def isAnagram(s: str, t: str) -> bool:
    s, t = s.lower(), t.lower()
    if len(s) != len(t):
        return False

    charCounts = [0] * 26

    for i in range(len(s)):
        charCounts[ord(s[i]) - ord("a")] += 1
        charCounts[ord(t[i]) - ord("a")] -= 1

    for count in charCounts:
        if count != 0:
            return False
    return True


print(isAnagram("Rat", "tar"))
"""


# Using Dictionary (Hashmap)
def isAnagram(s: str, t: str) -> bool:
    s, t = s.lower(), t.lower()
    if len(s) != len(t):
        return False

    freq = {}
    for c in s:
        freq[c] = freq.get(c, 0) + 1

    for c in t:
        freq[c] = freq.get(c, 0) - 1

    return all(v == 0 for v in freq.values())


print(isAnagram("rat", "tar"))
print(isAnagram("anagram", "nagaram"))
