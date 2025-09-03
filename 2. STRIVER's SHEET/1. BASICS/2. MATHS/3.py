"""
PROBLEM - GCD of two numbers

You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers.
Return the GCD of the two numbers.
The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.

Examples:
Input: n1 = 4, n2 = 6

Output: 2

Explanation: Divisors of n1 = 1, 2, 4, Divisors of n2 = 1, 2, 3, 6

Greatest Common divisor = 2.

Input: n1 = 9, n2 = 8

Output: 1

Explanation: Divisors of n1 = 1, 3, 9 Divisors of n2 = 1, 2, 4, 8.

Greatest Common divisor = 1.
"""

"""
But the time complexity will be high time complexity O(n)

def GCD(n1, n2):
    l = set()
    p = []

    for i in range(1, n1 + 1):
        if n1 % i == 0:
            l.add(i)

    for j in range(1, n2 + 1):
        if n2 % j == 0:
            if j in l:
                p.append(j)

    greatest = p[0]
    for n in p:
        if n > greatest:
            greatest = n
    return greatest


print(GCD(432, 216))
"""

# Euclidean Algorithm


def GCD(n1, n2):
    while n1 > 0 and n2 > 0:
        if n1 > n2:
            n1 = n1 % n2
        else:
            n2 = n2 % n1
    if n1 == 0:
        return n2
    return n1


print(GCD(20, 15))
print(GCD(36, 108))
print(GCD(432, 216))
print(GCD(108, 108))
