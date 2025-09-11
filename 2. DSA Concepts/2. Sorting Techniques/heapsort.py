# Heap sort
# Time Complexity - O(n log n)
# Space Complexity - O(1)

def heapify(arr, i , n):
  largest = i             # Initialize largest as root
  left = 2 * i + 1        # left child
  right = 2 * i + 2       # right child


# If left child exists and is greater than root
  if left < n and arr[left] > arr[largest]:
    largest = left

# If right child exists and is greater than current largest
  if right < n and arr[right] > arr[largest]:
    largest = right

# If largest is not root, swap and continue heapifying
  if largest != i:
    arr[i], arr[largest] = arr[largest], arr[i]
    heapify(arr, largest, n)
  

def heapSort(arr):
  n = len(arr)

  # Build a maxheap
  for i in range(n // 2 - 1, -1, -1):
    heapify(arr, i , n)

  # Extract elements one by one
  for i in range(n - 1, 0, -1):
    arr[0], arr[i] = arr[i], arr[0]
    heapify(arr, 0, i)

  return arr

print(heapSort([5,1,1,2,0,0]))
print(heapSort([5,2,3,1]))
print(heapSort([-4,0,7,4,9,-5,-1,0,-7,-1]))