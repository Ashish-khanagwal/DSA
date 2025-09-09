# Quick Sort
# Time Complexity = O(n log n) (Average case, technically worst case is O(n^2))
# Space Conmplexity = O(n)

def quickSort(arr):
  if len(arr) <= 1:
    return arr
  
  p = arr[0]
  L = [x for x in arr[1:] if x <= p]
  R = [x for x in arr[1:] if x > p]

  L = quickSort(L)
  R = quickSort(R)

  return L + [p] + R


print(quickSort([4, 6, 2, 5, 7, 9, 1, 3]))