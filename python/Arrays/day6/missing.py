n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

# # brute approach...
# for i in range(1, n + 1):
#     flag = 0
#     for j in range(n):
#         if (arr[j] == i):
#             flag = 1
#             break
    
#     if (flag == 0):
#         print("missing number: ", i)




# # better approach...
# hash = [0] * (n + 2)

# for i in range(n):
#     if arr[i] <= n + 1:
#         hash[arr[i]] = 1
    
# for i in range(1, n + 2):
#     if hash[i] == 0:
#         print("Missing number: ", i)
#         break




# # optimal approach 1 (using sum)...
# total = (n + 1) * (n + 2) // 2
# s = sum(arr)

# missing = total - s
# print("Missing number: ", missing)


# # optimal approach 2 (using xor)...
XOR1 = 0
for i in range(1, n + 2):
    XOR1 ^= i

XOR2 = 0
for num in arr:
    XOR2 ^= num

missing = XOR1 ^ XOR2
print("Missing number: ", missing)