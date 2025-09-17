# singly linked list

class SinglyNode:
  def __init__(self, val):
    self.val = val
    self.next = None

  def __str__(self):
    return str(self.val)
  
Head = SinglyNode(1)
A = SinglyNode(3)
B = SinglyNode(5)
C = SinglyNode(7)

Head.next = A
A.next = B
B.next = C

# Traversing the whole list O(n)
curr = Head
while curr:
  print(curr, end=" -> ")
  curr = curr.next
print(None)

# Display the list
def display(Head):
  curr = Head
  elements = []
  while curr:
    elements.append(str(curr.val))
    curr = curr.next
  print(" -> ".join(elements))
display(Head)

# Search for node value - O(n)
def search(Head, val):
  curr = Head
  while curr:
    if val == curr.val:
      return True
    curr = curr.next

  return False
print(search(Head, 2))