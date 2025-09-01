"""
Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.


Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
"""

# import math
#
#
# def mySqrt(x: int) -> int:
#     if n < 2:
#         return n
#
#
#
# print(mySqrt(8))

# prime numbers = 2, 3, 5, 7, 9, 11, 13, 17, 19, 23...
# Check if it is a prime number.
# Factors they are own and one. n, n*1

# def primenum(n):
#     isPrime = False
#     if n <= 1:
#         return "neither prime nor composite"
#     for i in range(2, n):
#         if n % i == 0:
#             isPrime = True
#             break
#     if isPrime:
#         print(f"{n} is not a prime number")
#     else:
#         print(f"{n} is a prime number")
#
#
# n = int(input("Enter a number: "))
# # x = int(input("Enter square of number"))
# primenum(n, 4)
