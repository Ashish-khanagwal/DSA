"""
READ
https://takeuforward.org/recursion/print-1-to-n-using-recursion/
"""


def f(i, n):
    if i > n:
        return
    print(i)
    f(i + 1, n)


if __name__ == "__main__":
    n = int(input("-> "))
    f(1, n)
