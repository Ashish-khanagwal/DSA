'''
PROBLEM 206 -> Reverse Linked List

PROBELM LINK -> https://leetcode.com/problems/reverse-linked-list/

Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
Input: head = [1,2]
Output: [2,1]

Example 3:
Input: head = []
Output: []
'''
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def reverseList(head):
  curr = head
  prev = None

  while curr:
      temp = curr.next
      curr.next = prev
      prev = curr
      curr = temp
  return prev

def list_to_linked(lst):
    if not lst:
        return None
    head = ListNode(lst[0])
    curr = head
    for val in lst[1:]:
        curr.next = ListNode(val)
        curr = curr.next
    return head

def linked_to_list(head):
    result = []
    while head:
        result.append(head.val)
        head = head.next
    return result

head = list_to_linked([1,2,3,4,5])
reversed_head = reverseList(head)
print(linked_to_list(reversed_head))   # [5,4,3,2,1]

head = list_to_linked([1,2])
reversed_head = reverseList(head)
print(linked_to_list(reversed_head))   # [2,1]

head = list_to_linked([])
reversed_head = reverseList(head)
print(linked_to_list(reversed_head)) 