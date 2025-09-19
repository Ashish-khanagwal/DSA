'''
PROBLEM 705 -> Design HashSet

PROBLEM LINK -> https://leetcode.com/problems/design-hashset/

Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

void add(key) Inserts the value key into the HashSet.
bool contains(key) Returns whether the value key exists in the HashSet or not.
void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, 
do nothing.


Example 1:
Input
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
Output
[null, null, null, true, false, null, true, null, false]

Explanation
MyHashSet myHashSet = new MyHashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // return True
myHashSet.contains(3); // return False, (not found)
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(2); // return True
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // return False, (already removed)
'''

class HashSet:
  def __init__(self):
    self.size = 10
    self.table = [[] for _ in range(self.size)]

  def _hash(self, key):
    return key % self.size
  
  def add(self, key):
    index = self._hash(key)
    if key not in self.table[index]:
      self.table[index].append(key)

  def remove(self, key):
    index = self._hash(key)
    if key in self.table[index]:
      self.table[index].remove(key)

  def contains(self, key):
    index = self._hash(key)
    return key in self.table[index]
  
  def display(self):
    for i in self.table:
      print(i)

ht = HashSet()

ht.add(1)
ht.add(2)
ht.display()

print(ht.contains(1))
print(ht.contains(3))

ht.add(2)
ht.display()
print(ht.contains(2))

ht.remove(2)
ht.display()
print(ht.contains(2))