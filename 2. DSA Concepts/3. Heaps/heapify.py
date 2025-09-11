# Build a min heap (Heapify)
# Time Complexity - O(n)
# Space Complexity - O(1)

A = [-4, 3, 1, 0, 2, 5, 10, 12, 9]

# Heapq always gonna work for min heap

import heapq

heapq.heapify(A)
print(A) # Not really sorted

# Heap Push (Insert an element)
# Time Complextiy - O(log n)

heapq.heappush(A, 4) # -> 4 will be pushed at the end of the array.
print(A)

# Heap Pop (Extract Min)
# Time Complexity - O(log n)

min = heapq.heappop(A) # -> Will extract the minimum element, in this case it's -4
print(A, min)

'''
HEAP SORT
Time Complexity - O(n log n )
Space Complexity - O(n)

NOTE :- O(1) is possibel via swapping, but this is complex
'''

def heapSort(arr):
  heapq.heapify(arr)
  n = len(arr)
  new_list = [0] * n

  for i in range(n):
    minn = heapq.heappop(arr)
    new_list[i] = minn

  return new_list

print(heapSort([1, 3, 5, 7, 9, 2, 4, 6, 8, 0]))


'''
FOR MAX HEAP
'''

B = [-4, 3, 1, 0, 2, 5, 10, 12, 9]
n = len(B)

for i in range(n):
  B[i] = -B[i]

heapq.heapify(B)
print(B)

largest = -heapq.heappop(B)
print(largest)

heapq.heappush(B, -7) # -> Insert 7 in to max heap
print(B)

# Build heap from scratch - Time: O(n log n)

C = [-5, 4, 2, 1, 7, 0, 3]
heap = []

for i in C:
  heapq.heappush(heap, i)
  print(heap)


'''
Putting tuples of items in the heap
'''

D = [5, 4, 3, 5, 4, 3, 5, 5, 4]
from collections import Counter

counter = Counter(D)
print(counter)

heap = []
for k, v in counter.items():
  heapq.heappush(heap, (v, k))

print(heap)