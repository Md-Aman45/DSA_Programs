def findCombinations(ind, arr, tar, ans, ds):
    if tar == 0:
        ans.append(ds.copy())
        print(ds)
        return
    
    for i in range(ind, len(arr)):
        if i > ind and arr[i] == arr[i - 1]:
            continue

        if arr[i] > tar:
            break

        ds.append(arr[i])
        findCombinations(i + 1, arr, tar - arr[i], ans, ds)
        ds.pop()


    

n = int(input("Enter the size of array: "))
arr = list(map(int, input(f"Enter {n} elements: ").split()))

arr.sort()

tar = int(input("Enter target: "))
ans = []
ds = []

findCombinations(0, arr, tar, ans, ds)
