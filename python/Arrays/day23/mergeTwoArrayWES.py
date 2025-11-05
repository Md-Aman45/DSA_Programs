n = int(input("Enter the size of arr1: "))
m = int(input("Enter the size of arr2: "))

arr1 = list(map(int, input(f"Enter {n} numbers from arr1: ").split()))
arr2 = list(map(int, input(f"Enter {m} numbers from arr2: ").split()))



# -------- BRUTE FORCE APPROACH ---------
# arr3 = [0] * (n + m)
# left, right, index = 0, 0, 0

# while left < n and right < m:
#     if arr1[left] <= arr2[right]:
#         arr3[index] = arr1[left]
#         left += 1
#         index += 1
#     else:
#         arr3[index] = arr2[right]
#         right += 1
#         index += 1

# while left < n:
#     arr3[index] = arr1[left]
#     left += 1
#     index += 1

# while right < m:
#     arr3[index] = arr2[right]
#     right += 1
#     index += 1


# for i in range(0, n + m):
#     if i < n:
#         arr1[i] = arr3[i]
#     else:
#         arr2[i - n] = arr3[i]







# -------- FIRST OPTIMAL APPROACH ---------
# left = n - 1
# right = 0

# while left >= 0 and right < m:
#     if arr1[left] > arr2[right]:
#         arr1[left], arr2[right] = arr2[right], arr1[left]
#         left -= 1
#         right += 1
#     else:
#         break

# arr1.sort()
# arr2.sort()






# -------- SECOND OPTIMAL APPROACH ---------
len_ = (n + m)
gap = (len_ // 2) + (len_ % 2)

while gap > 0:
    left = 0
    right = left + gap

    while right < len_:
        # arr1 and arr2
        if left < n and right >= n:
            if arr1[left] > arr2[right - n]:
                arr1[left], arr2[right - n] = arr2[right - n], arr1[left]
        
        # arr2 and arr2
        elif left >= n:
            if arr2[left - n] > arr2[right - n]:
                arr2[left - n], arr2[right - n] = arr2[right - n], arr2[left - n]
        
        # arr1 and arr2
        else:
            if arr1[left] > arr1[right]:
                arr1[left], arr1[right] = arr1[right], arr1[left]
        
        left += 1
        right += 1

    if gap == 1:
        break

    gap = (gap // 2) + (gap % 2)









# Print results
print("Merged arr1:", arr1)
print("Merged arr2:", arr2)