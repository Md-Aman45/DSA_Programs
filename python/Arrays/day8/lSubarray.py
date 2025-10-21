n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

# # # brute approach...
# len = 0
# k = 3
# for i in range(n):
#     s = 0
#     for j in range(i, n):
#         s += arr[j]
    
#         if s == k:
#             len = max(len, j - i + 1)
    
# print("Ans: ", len)



# # better approach (using hashMap)...
preSumMap = {}

sum = 0
maxLen = 0
k = 3

for i in range(n):
    sum += arr[i]
    if sum == k:
        maxLen = i + 1
    
    rem = sum - k

    if rem in preSumMap:
        len = i - preSumMap[rem]
        maxLen = max(maxLen, len)
    
    if sum not in preSumMap:
        preSumMap[sum] = i

print("Longest subarray length (using HashMap) = ", maxLen)
