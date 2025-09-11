"""
PROBLEM -> Divisors of a Number

You are given an integer n. You need to find all the divisors of n.
Return all the divisors of n as an array or list in a sorted order.

A number which completely divides another number is called it's divisor.


Examples:
Input: n = 6

Output = [1, 2, 3, 6]

Explanation: The divisors of 6 are 1, 2, 3, 6.

Input: n = 8

Output: [1, 2, 4, 8]

Explanation: The divisors of 8 are 1, 2, 4, 8.
"""

"""
def divisor(n: int) -> list: 
    l = [] 
    for i in range(1, n + 1): 
        if n % i == 0: 
            l.append(i) 
    return l 
print(divisor(6)) 
print(divisor(8))

above solution works correctly, but it’s not optimal.

- You check every number from 1 to n.
- That means time complexity = O(n).
- For big n (like 10^9), this is very slow.
"""

"""
Optimal approach (using √n):
👉 Idea: divisors come in pairs.
Example: if 36 % 6 == 0, then both 6 and 36//6 = 6 are divisors.
So, you only need to loop till √n.
"""


def divisor(n: int) -> list:
    l = []
    for i in range(1, int(n**0.5) + 1):
        if n % i == 0:
            """
            then we actually get two divisors: i, n // i
            n = 36, i = 2 → divisors are 2 and 36 // 2 = 18
            """
            l.append(i)
            if i != n // i:  # -> avoid duplicate when n is a perfect square
                l.append(n // i)
    return sorted(l)


print(divisor(6))
print(divisor(8))
print(divisor(36))
