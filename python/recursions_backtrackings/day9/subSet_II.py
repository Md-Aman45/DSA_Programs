def findSubsets(ind, arr, ds, ansList):
    ansList.append(ds.copy())

    for i in range(ind, len(arr)):
        if i != ind and arr[i] == arr[i - 1]:
            continue

        ds.append(arr[i])
        findSubsets(i + 1, arr, ds, ansList)
        ds.pop()






# ---------- main ----------
n = int(input("Enter the size of arr: "))
arr = list(map(int, input(f"Enter {n} numbers: ").split()))

arr.sort()

ansList = []

findSubsets(0, arr, [], ansList)

print("Subset without duplicates: ")
for subset in ansList:
    print(subset, end=" ")


    

    
