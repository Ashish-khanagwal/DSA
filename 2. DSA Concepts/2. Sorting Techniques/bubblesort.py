# Bubble sort
# Time Complexity = O(n^2)
# Space Complexity = O(1)

def bubbleSort(nums: list[int]) -> list[int]:
  n = len(nums)
  flag = True
  while flag:
    flag = False
    for i in range(1, n):
      # To do in ascending order
      if nums[i - 1] > nums[i]:
        flag = True
        nums[i-1], nums[i] = nums[i], nums[i-1]

      # To do in desceding order
      # if nums[i - 1] < nums[i]:
  return nums

print(bubbleSort([-5, 3, 2, 1, -3, -3, 7, 2, 2]))