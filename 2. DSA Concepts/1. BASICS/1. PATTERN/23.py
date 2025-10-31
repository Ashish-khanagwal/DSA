def solve(n):
    result = []
    # Top pyramid
    for i in range(1, n+1):
        row = ' ' * (n - i)
        for j in range(1, i+1):
            row += str(j)
        for j in range(i-1, 0, -1):
            row += str(j)
        result.append(row)
    # Bottom reversed pyramid, omitting the center
    for i in range(n-1, 0, -1):
        row = ' ' * (n - i)
        for j in range(1, i+1):
            row += str(j)
        for j in range(i-1, 0, -1):
            row += str(j)
        result.append(row)
    return result


print(solve(1))
print(solve(2))
print(solve(3))