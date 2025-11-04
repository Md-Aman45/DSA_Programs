n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))


k = int(input("Enter the value of k (target sum): "))

# -------- BRUTE APPROACH for number of subarray --------
# cnt = 0
# for i in range(n):
#     for j in range(i, n):
#         currSum = 0
#         for t in range(i, j + 1):
#             currSum = currSum + arr[t]
#         if currSum == k:
#             cnt += 1



# -------- BETTER APPROACH --------
# cnt = 0
# for i in range(n):
#     currSum = 0
#     for j in range(i, n):
#         currSum += arr[j]

#         if currSum == k:
#             cnt += 1




# -------- OPTIMAL APPROACH --------
mpp = {0: 1}
preSum, cnt = 0, 0

for i in range(n):
    preSum += arr[i]
    remove = preSum - k

    # if (preSum - k) exists in map, add its count
    cnt += mpp.get(remove, 0)

    # store/update the prefix sum frequency
    mpp[preSum] = mpp.get(preSum, 0) + 1



print(f"Number of subarrays with sum {k} is: {cnt}")
        