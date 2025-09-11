# Insertion Sort
# Time complexity = O(n^2)
# Space complexity = O(1)

def insertionSort(nums: list[int]) -> list[int]:
  n = len(nums)
  for i in range(1, n):
    for j in range(i, 0, -1):
      if nums[j-1] > nums[j]:
        nums[j-1], nums[j] = nums[j], nums[j-1]
      else:
        break
  return nums

print(insertionSort([-5, 3, 2, 1, -3, -3, 7, 2, 2]))