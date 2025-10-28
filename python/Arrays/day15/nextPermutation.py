n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))


# # optimal approach for next permutation...
index = -1


# # Step 1: Find the first index from the end where arr[i] < arr[i+1]...
for i in range(n - 2 , -1, -1):
    if arr[i] < arr[i + 1]:
        index = i
        break


# # Step 2: If no such index exists, reverse the entire array...
if index == -1:
    arr.reverse()
else:
    # # Step 3: Find the next greater element to the right of index...
    for i in range(n - 1, index, -1):
        if arr[i] > arr[index]:
            arr[i], arr[index] = arr[index], arr[i]
            break

    
    # # Step 4: Reverse the subarray to the right of index...
    arr[index + 1:] = reversed(arr[index + 1:])


print("Next permutation:", *arr)