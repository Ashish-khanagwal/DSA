"""
REVERSE an array/List

LINK - https://takeuforward.org/plus/dsa/problems/reverse-an-array


Given an array arr of n elements. The task is to reverse the given array.
The reversal of array should be inplace.


Examples:

Input: n=5, arr = [1,2,3,4,5]
Output: [5,4,3,2,1]

Explanation: The reverse of the array [1,2,3,4,5] is [5,4,3,2,1]


Input: n=6, arr = [1,2,1,1,5,1]
Output: [1,5,1,1,2,1]

Explanation: The reverse of the array [1,2,1,1,5,1] is [1,5,1,1,2,1].
"""

"""
Using While loop and Two Pointer

def reverse_array(arr):
    left, right = 0, len(arr) - 1
    while left < right:
        arr[left], arr[right] = arr[right], arr[left]

        left += 1
        right -= 1
    return arr


if __name__ == "__main__":
    print(reverse_array([1, 2, 3, 4, 5]))
"""

"""
Here using two parameters to swap l and r but using recurssion

def reverse_array(l, r, arr):
    if l >= r:
        return
    arr[l], arr[r] = arr[r], arr[l]
    reverse_array(l + 1, r - 1, arr)
    return arr


if __name__ == "__main__":
    arr = [1, 2, 1, 1, 5, 1]
    n = len(arr)
    print(reverse_array(0, n - 1, arr))
"""

"""
Using only 1 parameter
"""


def f(i, n, arr):
    if i >= n / 2:
        return
    arr[i], arr[n - i - 1] = arr[n - i - 1], arr[i]
    f(i + 1, n, arr)
    return arr


if __name__ == "__main__":
    arr = [1, 2, 1, 1, 5, 1]
    n = len(arr)
    print(f(0, n, arr))
