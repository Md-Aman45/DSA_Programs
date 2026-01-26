def findCombination(ind, arr, tar, ans, ds):
    if ind == len(arr):
        if tar == 0:
            ans.append(ds.copy())
            print(ds)
        return
    
    if arr[ind] <= tar:
        ds.append(arr[ind])
        findCombination(ind, arr, tar - arr[ind], ans, ds)

        ds.pop()
        
    findCombination(ind + 1, arr, tar, ans, ds)



# ----------- main -------------
n = int(input("Enter the size of arr: "))
arr = list(map(int, input(f"Enter {n} elements: ").split()))

tar = int(input("Enter target: "))

ans = []
ds = []

findCombination(0, arr, tar, ans, ds)







