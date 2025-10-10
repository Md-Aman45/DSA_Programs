n = int(input("Enter number of elements: "))

arr = list(map(int, input(f"Enter {n} elements (space separated): ").split()))

for i in range(n - 1):
    mini = i
    for j in range(i + 1, n):
        if arr[j] < arr[mini]:
            mini = j
    
    arr[i], arr[mini] = arr[mini], arr[i]

print("Sorted array", arr)