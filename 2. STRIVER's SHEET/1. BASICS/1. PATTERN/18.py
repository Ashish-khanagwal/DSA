"""
E
D E
C D E
B C D E
A B C D E
"""


def pattern(n):
    for i in range(n):
        a = 69
        for j in range(a - i, a + 1):
            print(chr(j), end="")
        print()


n = int(input("-> "))
pattern(n)
