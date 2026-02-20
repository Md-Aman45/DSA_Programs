def recurePermute_(ind, arr, ans):
    if ind == len(arr):
        ans.append(arr.copy())
        return
    
    for i in range(ind, len(arr)):
        swap(i, ind, arr)
        recurePermute_(ind + 1, arr, ans)
        swap(i, ind, arr)


def swap(i, j, arr):
    arr[i], arr[j] = arr[j], arr[i]



# -------- main --------
n = int(input("Enter the size of arr: "))
arr = list(map(int, input(f"Enter {n} elements: ").split()))

ans = []
recurePermute_(0, arr, ans)

print("Permutations:")
for perm in ans:
    print(perm)