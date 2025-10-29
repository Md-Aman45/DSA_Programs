# # This function is only for brute approach...
# def ls(arr, num):
#     for val in arr:
#         if val == num:
#             return True
#     return False



n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))


# # brute appraoch for (Longest Consecutive Sequence in an array)...
# longest = 1
# for i in range(n):
#     x = arr[i]
#     cnt = 1

#     while ls(arr, x + 1) == True:
#         x = x + 1
#         cnt += 1
    
#     longest = max(longest, cnt)

# print("Longest Consecutive Sequence length (brute force) =", longest)





# -> better approach...
# arr.sort()
# longest = 1
# currCnt = 0
# lastSmallest = float('-inf')

# for i in range(n):
#     if arr[i] - 1 == lastSmallest:
#         currCnt += 1
#         lastSmallest = arr[i]
#     elif arr[i] != lastSmallest:
#         currCnt = 1
#         lastSmallest = arr[i]
    
#     longest = max(longest, currCnt)

# print("Longest Consecutive Sequence length (better appraoch) =", longest)





# -> optimal appraoch...
nums = set(arr)
longest = 0

for num in nums:
    if num - 1 not in nums:
        x = num
        cnt = 1

        while x + 1 in nums:
            x += 1
            cnt += 1
        
        longest = max(longest, cnt)
    
print("Longest Consecutive Sequence length (optimal approach) =", longest)