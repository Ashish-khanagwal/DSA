"""
Basic Hashing:
"""


def frequence_count(arr, queries):
    freq = {i: 0 for i in range(13)}

    for i in arr:
        freq[i] = freq.get(i, 0) + 1

    result = []
    for q in queries:
        result.append(freq.get(q, 0))
    return result


if __name__ == "__main__":
    arr = [1, 3, 2, 1, 3]
    queries = [1, 4, 2, 3, 12]
    print(frequence_count(arr, queries))
