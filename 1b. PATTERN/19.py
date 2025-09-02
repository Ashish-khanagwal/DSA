"""
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
"""


def upDownStar(n):
    uspace = 0
    for i in range(n, 0, -1):
        # Stars
        for j in range(1, i + 1):
            print("*", end="")
        # Space
        for j in range(uspace):
            print(" ", end="")
        # Space
        for j in range(1, i + 1):
            print("*", end="")
        print()
        uspace += 2

    dspace = 2 * (n - 1)
    for i in range(1, n + 1):
        # Stars
        for j in range(1, i + 1):
            print("*", end="")
        # Space
        for j in range(dspace):
            print(" ", end="")
        # Stars
        for j in range(1, i + 1):
            print("*", end="")
        print()
        dspace -= 2


n = int(input("-> "))
upDownStar(n)
