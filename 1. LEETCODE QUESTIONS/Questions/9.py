"""
PROBLEM 20 -> Valid Parantheses

PROBLEM LINK -> https://leetcode.com/problems/valid-parentheses/

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false

Example 4:

Input: s = "([])"
Output: true

Example 5:

Input: s = "([)]"
Output: false
"""


def isValid(s: str) -> bool:
    mappedBrackets = {")": "(", "}": "{", "]": "["}

    stack = []

    for i in range(len(s)):
        c = s[i]

        if c not in mappedBrackets:
            stack.append(c)
        else:
            if not stack:
                return False
            topElement = stack.pop()
            if topElement != mappedBrackets.get(c):
                return False

    return not stack


print(isValid("()[]{}"))
print(isValid("([)]"))
print(isValid("(]"))
print(isValid("([])"))
