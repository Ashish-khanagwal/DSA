'''
PROBLEM 374 -> Guess Number Higher or Lower

PROBLEM LINK -> https://leetcode.com/problems/guess-number-higher-or-lower/

We are playing the Guess Game. The game is as follows:
I pick a number from 1 to n. You have to guess which number I picked 
(the number I picked stays the same throughout the game).

Every time you guess wrong, I will tell you whether the number I picked is higher or 
lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.

Example 1:
Input: n = 10, pick = 6
Output: 6

Example 2:
Input: n = 1, pick = 1
Output: 1

Example 3:
Input: n = 2, pick = 1
Output: 1
'''

pick = 6  # hidden number

def guess(num: int) -> int:
    if num > pick:
        return -1
    elif num < pick:
        return 1
    else:
        return 0



def guessNumber(n: int) -> int:
    low, high = 1, n
    while low <= high:
        mid = (low + high) // 2
        res = guess(mid)
        if res == 0:
            return mid  # found the number
        elif res == -1:
            high = mid - 1  # guess too high
        else:
            low = mid + 1   # guess too low

print(guessNumber(10))