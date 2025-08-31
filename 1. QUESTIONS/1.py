"""
Subtract the Product and Sum of Digits of an Integer
"""

"""
# n = 234
# digit = list(str(n))
# digit = [int(ch) for ch in str(n)]

This is how convert 
"""


def subtractSumAndProduct(n: int) -> int:

    digit = [int(ch) for ch in str(n)]
    p = 1
    s = 0
    for i in digit:
        p *= i
        s += i
    result = p - s
    return result


print(subtractSumAndProduct(4421))
