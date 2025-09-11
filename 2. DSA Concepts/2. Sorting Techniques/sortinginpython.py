# Tim Sort
# Time Complexity - O(n log n)

# In place (Constant space) (Sorting elements directly in the memory)
G = [-5, 3, 2, 1, -3, -3, 7, 2, 2]

G.sort()
print(G)

# Get new sorted array, space complexity - O(n)
H = [-5, 3, 2, 1, -3, -3, 7, 2, 2]
sorted_H = sorted(H)
print(H, sorted_H)

# Sorted arrays of tuples
I = [(-5, 3), (2, 1), (-3, -3), (7, 2), (2, 2)] # Any Interval problem

sorted_I = sorted(I, key = lambda t : t[0]) # for first value in tuple
print(sorted_I)

sorted_I = sorted(I, key = lambda t : t[1]) # for second value in tuple
print(sorted_I)

sorted_I = sorted(I, key = lambda t : -t[0]) # descending order
print(sorted_I)