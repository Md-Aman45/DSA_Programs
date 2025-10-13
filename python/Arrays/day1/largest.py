n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

largest = arr[0]
for i in range(1, n - 1):
    if arr[i] > largest:
        largest = arr[i]

print(f"Largest Number is: {largest}")