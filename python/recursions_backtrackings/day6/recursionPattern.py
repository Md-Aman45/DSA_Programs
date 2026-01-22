def printSubsequence(i, arr, ds, s, sum):
    if i == len(arr):
        if s == sum:
            print(ds)
        return
    
    # pick the element...
    ds.append(arr[i])
    s += arr[i]
    printSubsequence(i + 1, arr, ds, s, sum)

    # not pick the element...
    ds.pop()
    s -= arr[i]
    printSubsequence(i + 1, arr, ds, s, sum)



# ---------- main -----------
n = int(input("Enter the size of arr: "))
arr = list(map(int, input(f"Enter {n} elements: ").split()))
k = int(input("Enter target sum K: "))

ds = []

printSubsequence(0, arr, ds, 0, k)
