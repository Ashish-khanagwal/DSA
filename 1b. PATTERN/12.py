"""
1             1
1 2         2 1
1 2 3     3 2 1
1 2 3 4 4 3 2 1
"""


def pattern(n):
    space: int = 2 * (n - 1)
    for i in range(1, n + 1):
        # Number
        for j in range(1, i + 1):
            print(j, end="")
        # Space
        for j in range(1, space + 1):
            print(" ", end="")
        # Number
        for j in range(i, 0, -1):
            print(j, end="")
        print()
        space -= 2


n = int(input("-> "))
pattern(n)
