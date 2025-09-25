'''
PROBLEM 771 -> Jewels and Stones

PROBLEM LINK -> https://leetcode.com/problems/jewels-and-stones/

You're given strings jewels representing the types of stones that are jewels, and stones 
representing the stones you have. Each character in stones is a type of stone you have. 
You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Example 2:
Input: jewels = "z", stones = "ZZ"
Output: 0
'''

def numJewelsInStones(jewels: str, stones: str) -> int:
  jewels = set(jewels)
  num_of_jewels = 0

  for s in stones:
    if s in jewels:
      num_of_jewels += 1
  return num_of_jewels

print(numJewelsInStones("aA", "aAAbbbb"))
print(numJewelsInStones("z", "ZZ"))