def frequency_sort(s):
    freq = {}
    for ch in s:
        freq[ch] = freq.get(ch, 0) + 1

    buckets = [[] for _ in range(len(s) + 1)]

    for ch, f in freq.items():
        buckets[f].append(ch)

    
    ans = []

    for f in range(len(s), 0, -1):
        for ch in buckets[f]:
            ans.append(ch * f)
    
    return "".join(ans)






# -------- main --------
if __name__ == "__main__":
    s = input("Enter string: ")
    ans = frequency_sort(s)
    print("Sorted by frequency:", ans)