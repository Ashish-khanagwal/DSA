"""
ABCDE
ABCD
ABC
AB
A
"""


def pattern(n):
    a: int = 65
    for i in range(n, 0, -1):
        for j in range(a, a + i):
            print(chr(j), end="")
        print()


n = int(input("-> "))
pattern(n)
