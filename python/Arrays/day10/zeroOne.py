n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))




# # better approach...
# cnt0 = 0
# cnt1 = 0
# cnt2 = 0

# for i in range(n):
#     if arr[i] == 0:
#         cnt0 += 1
#     elif arr[i] == 1:
#         cnt1 += 1
#     else:
#         cnt2 += 1
    
# for i in range(cnt0):
#     arr[i] = 0

# for i in range(cnt0, cnt0 + cnt1):
#     arr[i] = 1

# for i in range(cnt0 + cnt1, n):
#     arr[i] = 2


# print("Sorted Array: ", *arr)





# # Optimal approach :- 2 pointer (Dutch National Flag Algorithm)...
low = 0
mid = 0
high = n - 1

while mid <= high:
    if arr[mid] == 0:
        arr[low], arr[mid] = arr[mid], arr[low]
        low += 1
        mid += 1
    elif arr[mid] == 1:
        mid += 1
    else:
        arr[mid], arr[high] = arr[high], arr[mid]
        high -= 1
    
print("Sorted Array with 2-pointer: ", *arr)