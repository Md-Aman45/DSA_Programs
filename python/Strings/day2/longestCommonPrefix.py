def longest_common_prefix(strs):
    strs.sort()

    first = strs[0]
    last = strs[-1]

    ans = []

    for i in range(min(len(first), len(last))):
        if first[i] != last[i]:
            break
        ans.append(first[i])

    return "".join(ans)



if __name__ == "__main__":
    n = int(input("Enter number of strings: "))

    arr = []
    print("Enter the strings one by one:")
    for _ in range(n):
        arr.append(input())

    ans = longest_common_prefix(arr)

    if ans == "":
        print('Longest Common Prefix: ""')
    else:
        print("Longest Common Prefix:", ans)