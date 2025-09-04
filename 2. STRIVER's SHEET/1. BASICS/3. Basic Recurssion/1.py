"""
PROBLEM - Sum of N natural numbers

READ -> https://takeuforward.org/data-structure/sum-of-first-n-natural-numbers/

Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.

Examples:
Input : N = 4

Output : 10

Explanation : first four natural numbers are 1, 2, 3, 4.

Sum is 1 + 2 + 3 + 4 => 10.

Input : N = 2

Output : 3

Explanation : first two natural numbers are 1, 2.

Sum is 1 + 2 => 3.
"""

"""
PARAMETERISED WAY

def naturalSum(i, sum):
    if i < 1:
        print(sum)
        return
    naturalSum(i - 1, sum + i)


if __name__ == "__main__":
    n = int(input("-> "))
    naturalSum(n, 0)
"""

"""
FUNCTIONAL WAY
"""


def f(n):
    if n == 0:
        return 0
    return n + f(n - 1)


if __name__ == "__main__":
    n = int(input("-> "))
    print(f(n))
