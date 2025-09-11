"""
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
"""


def upDownPattern(n):
    upSpace = 2 * (n - 1)
    for i in range(1, n + 1):
        # Stars
        for j in range(1, i + 1):
            print("*", end="")
        # Space
        for j in range(upSpace):
            print(" ", end="")
        # Star
        for j in range(1, i + 1):
            print("*", end="")
        print()
        upSpace -= 2

    downSpace = 2
    for i in range(n, 1, -1):
        # Strars
        for j in range(1, i):
            print("*", end="")
        # Space
        for j in range(downSpace):
            print(" ", end="")
        # Stars
        for j in range(1, i):
            print("*", end="")
        print()
        downSpace += 2


n = int(input("-> "))
upDownPattern(n)

"""
more generalized method

# def pattern(n):
#     # Upper part
#     for i in range(1, n + 1):
#         stars = i
#         spaces = 2 * (n - i)
#         print("*" * stars + " " * spaces + "*" * stars)
#
#     # Lower part
#     for i in range(n - 1, 0, -1):
#         stars = i
#         spaces = 2 * (n - i)
#         print("*" * stars + " " * spaces + "*" * stars)
#
#
# # Example
# pattern(5)
"""
