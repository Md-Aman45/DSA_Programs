# # Left rotate the array by one place...

# arr = [1, 2, 3, 4, 5]

# temp = arr[0]

# for i in range(1, len(arr)):
#     arr[i - 1] = arr[i]

# arr[-1] = temp

# print("Rotated array:", arr)



# # Left Rotate the array by d palces...

# arr = [1, 2, 3, 4, 5, 6, 7]

# d = 3
# d = d % len(arr)

# temp = arr[:d]

# for i in range(d, len(arr)):
#     arr[i - d] = arr[i]

# for i in range(d):
#     arr[len(arr) - d + i] = temp[i]


# print("Array after left rotation by", d, "positions:")
# print(arr)




# # Optimal Approach

def reverse(arr, start, end):
    while start < end:
        arr[start], arr[end] = arr[end], arr[start]
        start += 1
        end -= 1

arr = [1, 2, 3, 4, 5, 6, 7]

d = 24
n = len(arr)
d = d % n

reverse(arr, 0, d - 1)
reverse(arr, d, n - 1)
reverse(arr, 0, n - 1)


print("Array after left rotation by", d, "positions:", arr)