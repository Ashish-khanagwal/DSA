# HashSet -> Sets
s = set()

s.add(1)
s.add(3)
s.add(5)
print(s)

# Lookup if item in set - O(1)
if 1 in s:
  print(True)

# Remove item from the set - O(1)
s.remove(3)
print(s)

String = "asbasbasbasbasbasbcccccc"
sett = set(String) # -> Set construction - O(S) S is the length of the string
print(sett)

# Loop over items in set - O(n)
for x in s:
  print(x)

# HashMaps -> Dictionaries
d = {"Ashish": 123, "Greg": 456}
print(d)

# Add key,value in dictionary - O(1)
d["Hogg"] = 789
print(d)

# Check for presence of key in dictionary - O(1)
if 'Ashish' not in d:
  print(True)
else:
  print(False)

# Check the value corresponding to a key - O(1)
print(d['Ashish'])

# Loop over the key value pairs in dictionary - O(n)
for key, value in d.items():
  print(F"key: {key}, value: {value}")

from collections import defaultdict

a = defaultdict(int)
print(a[2])
print(a)

from collections import Counter

counter = Counter(String)
print(counter)