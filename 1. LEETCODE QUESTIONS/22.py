"""
PROBLEM 1304 -> Find N Unique Integers Sum up to Zero

PROBLEM LINK -> https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

Given an integer n, return any array containing n unique integers such that they add up to 0.

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
"""


def sumZero(n: int) -> list[int]:
    arr = []
    for i in range(1, (n // 2) + 1):
        arr.append(i)
        arr.append(-i)
    if n % 2 == 1:
        arr.append(0)
    return arr


print(sumZero(5))
print(sumZero(3))
