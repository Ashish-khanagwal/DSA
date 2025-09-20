# Oueue -> First In First Out (FIFO)
# Python’s deque (double-ended queue) is designed for fast append and pop from both ends (O(1)).

from collections import deque

# deque -> Double ended queue (Can append in the fron or behind, pop from the front or behind)

q = deque()
print(q)

# Enqueue - Add element to the right - O(1)
q.append(5)
q.append(4)
q.append(3)
q.append(2)
print(q)

# Dequeue - (pop left) -> Remove element from the left - O(1)
q.popleft()
print(q)

# Peek from the left side - O(1)
print(q[0])

# Peek from the right side - O(1)
print(q[-1])