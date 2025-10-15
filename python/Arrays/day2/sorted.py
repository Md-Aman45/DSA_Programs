# n = int(input("Enter the size of array: "))

# arr = list(map(int, input(f"Enter {n} numbers: ").split()))

# is_sorted = True

# for i in range(1, n):
#     if(arr[i] < arr[i - 1]):
#         is_sorted = False
#         break

# if is_sorted:
#     print("The Array is sorted in ascending order.")
# else:
#     print("The Array is not sorted")
    
# print("Array: ", arr)




# # Optimal Approach...
# Remove duplicates in-place from sorted array
n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

if n == 0:
    print("Array is empty!")
    exit()

i = 0
for j in range(1, n):
    if(arr[j] != arr[i]):
        arr[i + 1] = arr[j]
        i += 1

print(f"Number of unique elements: {(i + 1)}")

print("Unique elements are: ", end="")
for k in range(i + 1):
    print(arr[k], end=" ")