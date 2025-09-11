"""
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
"""

# def pattern(n):
#     for i in range(n):
#         for j in range(n):
#             if i == 0 or j == 0 or i == n - 1 or j == n - 1:
#                 print("4 ", end="")
#             else:
#                 if i == 1 or j == 1 or i == n - 2 or j == n - 2:
#                     print("3 ", end="")
#                 else:
#                     if i == 2 or j == 2 or i == n - 3 or j == n - 3:
#                         print("2 ", end="")
#                     else:
#                         print("1 ", end="")
#         print()


def pattern(n):
    for i in range(2 * n - 1):
        for j in range(2 * n - 1):
            top = i
            left = j
            right = 2 * n - 2 - j
            bottom = 2 * n - 2 - i
            print(n - min(min(top, bottom), min(left, right)), " ", end="")
        print()


n = int(input("-> "))
pattern(n)
