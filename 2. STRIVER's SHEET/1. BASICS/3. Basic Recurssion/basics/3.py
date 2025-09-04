# Print from N to 1

"""
READ
https://takeuforward.org/recursion/print-n-to-1-using-recursion/
"""


def f(i, n):
    if i < 1:
        return
    print(i)
    f(i - 1, n)


if __name__ == "__main__":
    n = int(input("-> "))
    f(n, n)
