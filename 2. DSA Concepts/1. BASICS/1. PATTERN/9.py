"""
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
"""


def pattern1(n):
    for i in range(n):
        for j in range(n - i - 1):
            print(" ", end="")
        for j in range(2 * i + 1):
            print("*", end="")
        for j in range(n - i - 1):
            print(" ", end="")
        print()


def pattern2(n):
    for i in range(n, 0, -1):
        for j in range(n - i):
            print(" ", end="")
        for j in range(2 * i - 1):
            print("*", end="")
        for j in range(n - i):
            print(" ", end="")
        print()


n = int(input("-> "))
pattern1(n)
pattern2(n)
