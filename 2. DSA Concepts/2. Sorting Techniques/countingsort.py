# Counting sort
# Time Complexity = O(n + k), where k is the range of data
'''
NOTE -> This can be written with the negative arrays but we will stick to positive arrays,
So, k is the max of the array
'''
# Space Complexity = O(k)

def countingSort(arr):
  n = len(arr)
  maxx = max(arr)
  counts = [0]* (maxx + 1) 

  for x in arr:
    counts[x] += 1

  i = 0
  for c in range(maxx + 1):
    while counts[c] > 0:
      arr[i] = c
      i += 1
      counts[c] -= 1
  return arr

print(countingSort([5, 3, 2, 1, 3, 4, 7, 8, 2, 6]))