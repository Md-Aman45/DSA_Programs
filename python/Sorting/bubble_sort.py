n = int(input("Enter number of elements: "))

arr = list(map(int, input(f"Enter {n} elements (space separated): ").split()))

for i in range(n - 1):
    for j in range(0, n - i - 1):
        if arr[j] > arr[j + 1]:
            arr[j], arr[j + 1] = arr[j + 1], arr[j]

print("Sorted array in bubble_sort", arr)