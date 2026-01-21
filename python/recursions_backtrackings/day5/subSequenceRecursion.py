def subsequence(index, arr, ds):
    if index >= len(arr):
        print(ds)
        return
    
    # pick the element...
    ds.append(arr[index])
    subsequence(index + 1, arr, ds)

    # not pick (backtrack)...
    ds.pop()
    subsequence(index + 1, arr, ds)




# -------- main --------
n = int(input("Enter size of array: "))
arr = list(map(int, input("Enter array elements: ").split()))

ds = []

subsequence(0, arr, ds)
