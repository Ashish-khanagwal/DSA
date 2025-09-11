"""
A
AB
ABC
ABCD
ABCDE
"""

# # print(ord("A"))
# # print(ord("B"))
# # print(ord("C"))
# # print(ord("D"))
# # print(ord("E"))
#
# for i in range(1, 6):
#     print(chr(a))
#     a += 1


def pattern(n):
    a: int = 65
    for i in range(1, n + 1):
        for j in range(a, a + i):
            print(chr(j), end="")
        print()


n = int(input("-> "))
pattern(n)
