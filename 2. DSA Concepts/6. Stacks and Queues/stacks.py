# Stack -> Last In First Out (LIFO)

stk = []
print(stk)


# Append to the top of the stack - O(1)
stk.append(6)
stk.append(5)
stk.append(4)
stk.append(3)
stk.append(2)
stk.append(1)
print(stk)

# Pop from the stack - O(1)
x = stk.pop()
print(x)
print(stk)

# Peek (top element without removing) - O(1)
print(stk[-1])

# Check empty
if stk:
  print(True)   # True -> Not Empty

print(len(stk) == 0)  # False -> Not Empty