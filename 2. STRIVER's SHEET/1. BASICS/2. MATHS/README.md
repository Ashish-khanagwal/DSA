# List of Problems

| PROBLEM NO. | PROBLEM                  |
| ----------- | ------------------------ |
| 1.          | Count digit of a numnber |
| 2.          | Reverse a number         |
| 3.          | GCD of two numbers       |
| 4.          | Armstrong number         |

### Concepts 👇

- [Problem-3: GCD of two numbers](#problem-3-gcd-of-two-numbers)
- [Problem-4: Armstrong numbers](#problem-4-armstrong-numbers)

# Concepts To Remember

## Problem-3 (GCD of two numbers)

### Optimal approach -> Euclidean algorithm

- The Euclidean Algorithm is a method for finding the greatest common divisor of two numbers. It operates on the principle that the GCD of two numbers remains the same even if the smaller number is subtracted from the larger number.
- To find the GCD of n1 and n2 where n1 > n2:

Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
Once one of them becomes 0, the other number is the GCD of the original numbers.
Eg, n1 = 20, n2 = 15:

- gcd(20, 15) = gcd(20-15, 15) = gcd(5, 15)
- gcd(5, 15) = gcd(15-5, 5) = gcd(10, 5)
- gcd(10, 5) = gcd(10-5, 5) = gcd(5, 5)
- gcd(5, 5) = gcd(5-5, 5) = gcd(0, 5)

Hence, return 5 as the gcd.

## Problem-4 (Armstrong numbers)

### Store digits of a integer in a list

```
n = 153
digits = []
while n > 0:
    digits.append(n % 10)   # get last digit
    n //= 10                # remove last digit
digits.reverse()            # reverse because we got digits in reverse order
print(digits)   # [1, 5, 3]
```

### Difference between /, //, % in Python

#### / (division) → always returns a float (decimal), even if divisible.

```
print(5 / 2)   # 2.5
print(4 / 2)   # 2.0
```

#### // (floor division) → gives only the integer part of the division (truncates decimals).

```
print(5 // 2)  # 2
print(4 // 2)  # 2
```

#### % (modulus / remainder) → gives the remainder after division.

```
print(5 % 2)   # 1
print(4 % 2)   # 0
```

### n = n // 10

#### In below code, `n` keeps getting divided by 10, so its value changes until it becomes 0.

```
c = 0
n = 153
temp = n     # make a copy
l = []

while temp > 0:
    l.append(temp % 10)
    temp = temp // 10   # reduce temp, not n
    c += 1

print("Digits list:", l)
print("Count:", c)
print("Original n:", n)
```

- To get the length of a integer we did `temp = temp // 10` and then used that `count` to keep track of count of digits.

Output:

```
Digits list: [3, 5, 1]
Count: 3 -> Length
Original n: 153
```
