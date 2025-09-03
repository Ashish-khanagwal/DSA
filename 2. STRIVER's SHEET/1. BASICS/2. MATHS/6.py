"""
PROBLEM -> Check for Prime Number

You are given an integer n. You need to check if the number is prime or not.
Return true if it is a prime number, otherwise return false.

A prime number is a number which has no divisors except 1 and itself.

Examples:
Input: n = 5

Output: true

Explanation: The only divisors of 5 are 1 and 5 , So the number 5 is prime.

Input: n = 8

Output: false

Explanation: The divisors of 8 are 1, 2, 4, 8, thus it is not a prime number.
"""


def isPrime(n: int):
    prime = True
    if n <= 1:
        return "Neither prime nor composite"
    elif n > 1:
        for i in range(2, n):
            if n % i == 0:
                prime = False
                break
        return prime


print(isPrime(0))
print(isPrime(2))
print(isPrime(5))
print(isPrime(8))
print(isPrime(9))
print(isPrime(11))
print(isPrime(12))
