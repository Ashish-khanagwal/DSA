"""
A
BB
CCC
DDDD
EEEEE
"""


def pattern(n):
    a: int = 65
    for i in range(1, n + 1):
        for j in range(1, i + 1):
            print(chr(a), end="")
        print()
        a += 1


n = int(input("-> "))
pattern(n)
