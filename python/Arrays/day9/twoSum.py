n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

# target = 14
target = int(input("Enter the target sum: "))
found = False



# # Brute approach...
# for i in range(n):
#     for j in range(i+1 , n):
#         if (arr[i] + arr[j] == target):
#             print(f"Values: {arr[i]}, {arr[j]}")
#             print(f"Indices: {i}, {j}")
#             print("YES")
#             found = True
#             break

#     if found: break

# if not found:
#     print("-1, -1")
#     print("NO")



# # Better approach (using HashMap)...
# twoSum = {}

# for i in range(n):
#     a = arr[i]
#     b = target - a

#     if b in twoSum:
#         print(f"Values from hashmap: {a}, {b}")
#         print(f"Indices: {i}, {twoSum[b]}")
#         print("YES")
#         found = True
#         break

#     twoSum[a] = i


# if not found:
#     print("-1, -1")
#     print("NO")





# # Optimal approach (using 2 pointer)...
arr.sort()
left = 0
right = n - 1


while left < right:
    sum = arr[left] + arr[right]

    if sum == target:
        print("Values (optimal): ", arr[left], arr[right])
        print("Indices: ", left, right)
        print("YES")
        found = True
        break
    elif sum < target:
        left += 1
    else: 
        right -= 1

if not found:
    print("-1, -1")
    print("NO")