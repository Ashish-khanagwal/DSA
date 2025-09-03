"""
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
"""


def pattern(n):
    start: int = 1
    for i in range(n):
        if i % 2 == 0:
            start = 1
        else:
            start = 0
        for j in range(i + 1):
            print(start, end="")
            start = 1 - start
        print()


n = int(input("-> "))
pattern(n)
