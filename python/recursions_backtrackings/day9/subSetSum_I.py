def sumSubSet(ind, sum, arr, n, subSet):
    if ind == n:
        subSet.append(sum)
        return
    
    # pick...
    sumSubSet(ind + 1, sum + arr[ind], arr, n , subSet)

    # not pick...
    sumSubSet(ind + 1, sum, arr, n, subSet)


n = int(input("Enter n: "))
arr = list(map(int, input(f"Enter {n} elements: ").split()))
sumSub = []

sumSubSet(0, 0, arr, n, sumSub)
sumSub.sort()
print("Subset Sums: ")
for val in sumSub:
    print(val, end=" ")

    
