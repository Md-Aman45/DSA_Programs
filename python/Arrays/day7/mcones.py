n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

cnt = 0
maxi = 0

for i in range(n - 1):
    if arr[i] == 1:
        cnt += 1
        maxi = max(maxi, cnt)
    else:
        cnt = 0

print("Consecutive Ones is: ", maxi)