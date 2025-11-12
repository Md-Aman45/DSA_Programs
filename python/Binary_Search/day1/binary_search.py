def binary_search_recursive(arr, low, high, target):
    if low > high:
        return -1
    
    mid = low + (high - low) // 2

    if arr[mid] == target:
        return mid
    
    elif target > arr[mid]:
        return binary_search_recursive(arr, mid + 1, high, target)
    
    else:
        return binary_search_recursive(arr, low, mid - 1, target)



# ---------- Main Code ----------
n = int(input("Enter the no. of elements: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

arr.sort()
print("Sorted array:", arr)

target = int(input("Enter target: "))


# ---------- Binary Search ----------

# # Iterative Code...
# low, high = 0, n - 1
# found = False

# while low <= high:
#     mid = (low + high) // 2

#     if arr[mid] == target:
#         print("Target found at index:", mid)
#         found = True
#         break

#     elif target > arr[mid]:
#         low = mid + 1
    
#     else:
#         high = mid - 1

# if not found:
#     print("Target not found in array.")





# ---------- Call Recursive function ----------
result = binary_search_recursive(arr, 0, n - 1, target)

if result != -1:
    print("Target found at index:", result)
else:
    print("Target not found in array.")