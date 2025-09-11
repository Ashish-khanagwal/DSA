def freq_char(s, queries):
    char = {}

    for ch in s:
        char[ch] = char.get(ch, 0) + 1

    result = []
    for q in queries:
        result.append(char.get(q, 0))

    return result


if __name__ == "__main__":
    s = "abcdabehf"
    queries = ["a", "g", "h", "b", "c"]
    print(freq_char(s, queries))
