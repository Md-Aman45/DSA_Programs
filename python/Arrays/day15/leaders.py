n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))


# # brute approach for (Leaders in an array)...
# ans = []
# for i in range(n):
#     leader = True
#     for j in range(i + 1, n):
#         if arr[j] > arr[i]:
#             leader = False
#             break
    
#     if leader:
#         ans.append(arr[i])
    
# print("Leaders in the array:", ans)




# # optimal approach...
ans = []
maxi = float('-inf')

for i in range(n - 1, -1, -1):
    if arr[i] > maxi:
        ans.append(arr[i])

        maxi = max(maxi, arr[i])
    
# for original...
ans.reverse()
print("Leaders in the Array:", ans)