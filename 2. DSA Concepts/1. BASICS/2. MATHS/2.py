"""
PROBLEM - Reverse a number
You are given an integer n. Return the integer formed by placing the digits of n in reverse order.

Examples:
Input: n = 25

Output: 52

Explanation: Reverse of 25 is 52.

Input: n = 123

Output: 321

Explanation: Reverse of 123 is 321.
"""


def reverseNum(n: int) -> int:
    l = []
    while n > 0:
        l.append(n % 10)
        n = n // 10
    m = "".join(map(str, l))
    new_n = int(m)
    return new_n


print(reverseNum(25))
print(reverseNum(123))
