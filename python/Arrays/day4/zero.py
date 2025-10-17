n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

# 2 pointer...
j = -1
for i in range(n):
    if arr[i] == 0:
        j = i
        break

for i in range(j+1, n):
    if arr[i] != 0:
        arr[i], arr[j] = arr[j], arr[i]
        j += 1

print("Array after moving zeros to the end: ", arr)