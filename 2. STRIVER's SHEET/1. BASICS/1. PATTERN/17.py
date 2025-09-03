"""
   A
  ABA
 ABCBA
ABCDCBA
"""


def pattern(n):
    for i in range(1, n + 1):
        for j in range(n - i):
            print(" ", end="")
        a: int = 65
        b = (2 * i - 1) // 2
        for j in range(1, 2 * i):
            print(chr(a), end="")
            if j <= b:
                a = a + 1
            else:
                a = a - 1
        for j in range(n - i):
            print(" ", end="")
        print()


n = int(input("-> "))
pattern(n)
