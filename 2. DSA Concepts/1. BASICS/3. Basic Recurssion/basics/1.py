"""
count = 0


def fname(name: str, n: int):
    global count
    if count == n:
        return
    print(name)
    count += 1
    fname("Ashish", 5)


if __name__ == "__main__":
    fname("Ashish", 5)
"""


def name(i, n):
    if i > n:
        return
    print("Ashish")
    name(i + 1, n)


if __name__ == "__main__":
    n = int(input("-> "))
    name(1, n)
