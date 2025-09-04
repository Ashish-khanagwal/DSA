# Print from n to 1 using backtracking


def f(i, n):
    if i > n:
        return
    f(i + 1, n)
    print(i)


if __name__ == "__main__":
    n = int(input("-> "))
    f(1, n)
