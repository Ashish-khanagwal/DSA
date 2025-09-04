# Print 1 to n using backtracking


def f(i, n):
    if i < 1:
        return
    f(i - 1, n)
    print(i)


if __name__ == "__main__":
    n = int(input("-> "))
    f(n, n)
