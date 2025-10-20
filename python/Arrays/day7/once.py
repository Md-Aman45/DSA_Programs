n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

# # brute approach...
# for i in range (n):
#     num = arr[i]
#     cnt = 0

#     for j in range(n):
#         if arr[j] == num:
#             cnt += 1
    
#     if cnt == 1:
#         print("Once by brute is: ", num)



# # better approach (using hashing)...
# maxi = arr[0]

# for i in range(n):
#     maxi = max(maxi, arr[i])

# hash_arr = [0] * (maxi + 1)

# for i in range(n):
#     hash_arr[arr[i]] += 1

# for i in range(n):
#     if hash_arr[arr[i]] == 1:
#         print("Once by better with hash: ", arr[i])




# # better approach (using map)...
# freq_map = {}

# for num in arr:
#     if num in freq_map:
#         freq_map[num] += 1
#     else:
#         freq_map[num] = 1

# for num in arr:
#     if freq_map[num] == 1:
#         print("Once by better with map: ", num)




# # optimal approach (xor -> only for one unique no.)...
XOR = 0
for i in range(n):
    XOR = XOR ^ arr[i]

print("Once by optimal: ", XOR)