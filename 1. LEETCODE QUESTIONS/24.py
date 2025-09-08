"""
PROBLEM 1317 -> Convert Integer to the Sum of Two No-Zero Integers

PROBLEM LINK -> https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/

No-Zero integer is a positive integer that does not contain any 0 in its decimal
representation.

Given an integer n, return a list of two integers [a, b] where:

a and b are No-Zero integers.
a + b = n

The test cases are generated so that there is at least one valid solution.
If there are many valid solutions, you can return any of them.

Example 1:

Input: n = 2
Output: [1,1]
Explanation: Let a = 1 and b = 1.
Both a and b are no-zero integers, and a + b = 2 = n.
Example 2:

Input: n = 11
Output: [2,9]
Explanation: Let a = 2 and b = 9.
Both a and b are no-zero integers, and a + b = 11 = n.
Note that there are other valid answers as [8, 3] that can be accepted.
"""

"""
🔹 Time Complexity

The loop increments left and decrements right until it finds a valid pair.

In the worst case, left could go up to n → O(n) iterations.

Inside each iteration, you do "0" in str(num) check:

Converting num to string takes O(log n) time (since number has log10(n) digits).

Checking "0" in ... also takes O(log n).

So total time complexity: 𝑂(𝑛⋅log𝑛)

🔹 Space Complexity
You only store two integers in result.

The str() conversions create temporary strings of size O(log n).

So space complexity: O(logn)

def getNoZeroIntegers(n: int) -> list[int]:
    left = 1
    right = n - 1
    result = []
    while left < n:
        if "0" in str(left) or "0" in str(right):
            right -= 1
            left += 1
        elif left + right == n:
            result.append(left)
            result.append(right)
            return result
        else:
            left += 1
            right -= 1
"""


def getNoZeroIntegers(n: int) -> list[int]:
    for a in range(1, n):
        b = n - a
        if "0" not in str(a) and "0" not in str(b):
            return [a, b]


print(getNoZeroIntegers(1010))
print(getNoZeroIntegers(11))
