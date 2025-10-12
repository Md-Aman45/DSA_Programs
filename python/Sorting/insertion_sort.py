n = int(input("Enter number of elements: "))

arr = list(map(int, input(f"Enter {n} elements (space separated): ").split()))

for i in range(1, n):
    j = i
    while (j > 0 and arr[j - 1] > arr[j]):
        arr[j - 1], arr[j] = arr[j], arr[j - 1]
        j -= 1
    
print("Sorted array in insertion_sort", arr)