# Selection Sort
# Time complexity = O(n^2)
# Space complexity = O(1)

def selectionSort(nums: list[int]) -> list[int]:
  n = len(nums)
  for i in range(n):
    min_index = i
    for j in range(i+1, n):
      if nums[j] < nums[min_index]:
        min_index = j
    nums[i], nums[min_index] = nums[min_index], nums[i]
  return nums

print(selectionSort([-5, 3, 2, 1, -3, -3, 7, 2, 2]))
print(selectionSort([0, 1, -2, 4, 3, -2, 5]))
print(selectionSort([0, 1, 2, 0, 1, 2]))