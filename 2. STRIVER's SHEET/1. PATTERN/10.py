"""
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
"""


def pattern1(n):
    for i in range(1, n + 1):
        for j in range(i):
            print("* ", end="")
        print()


def pattern2(n):
    for i in range(n - 1, 0, -1):
        for j in range(i):
            print("* ", end="")
        print()


n = int(input("-> "))
pattern1(n)
pattern2(n)


# def anothermethod(n):
#     for i in range(1, 2 * n + 1):
#         stars: int = i
#         if i > n:
#             stars = 2 * n - i
#         for j in range(stars):
#             print("* ", end="")
#         print()
#
#
# anothermethod(n)
