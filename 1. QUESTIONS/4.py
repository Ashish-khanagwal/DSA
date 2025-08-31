"""
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).


Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
"""


def reverse(x: int) -> int:
    if x < -(2**31) or x > 2**31 - 1:
        return 0
    if x == 0:
        return 0
    num = list(str(x))
    if "0" in num[-1]:
        num.pop()
    if "-" in num:
        sign = num[0]
        new_num = num
        new_num.pop(0)
        reverse_x = sign + "".join(new_num[::-1])
        reverse_x = int(reverse_x)
        if reverse_x < -(2**31) or reverse_x > 2**31 - 1:
            return 0
    else:
        reverse_x = "".join(num[::-1])
        reverse_x = int(reverse_x)
        if reverse_x < -(2**31) or reverse_x > 2**31 - 1:
            return 0
    return reverse_x


print(reverse(102))
print(reverse(120))
print(reverse(321))
print(reverse(-1230))


# x = -123
# num = list(str(x))
# if "0" in num:
#     zero = num.pop()
# if "-" in num:
#     sign = num[0]
#     new_num = num
#     new_num.pop(0)
#     reverse_x = sign + "".join(new_num[::-1])
# else:
#     reverse_x = "".join(num[::-1])
# print(reverse_x)
