n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

k = int(input("Enter the value of k: "))



# -------- BRUTE APPROACH --------
# cnt = 0
# for i in range(n):
#     for j in range(i, n):
#         xor_ = 0
#         for t in range(i, j + 1):
#             xor_ = xor_ ^ arr[t]
        
#         if xor_ == k:
#             cnt += 1





# -------- BETTER APPROACH --------
# cnt = 0
# for i in range(n):
#     xor_ = 0
#     for j in range(i, n):
#         xor_ = xor_ ^ arr[j]

#         if xor_ == k:
#             cnt += 1






# -------- OPTIMAL APPROACH --------
mpp = {0: 1}
xr = 0
cnt = 0

for i in range(n):
    xr = xr ^ arr[i]

    x = xr ^ k

    cnt += mpp.get(x, 0)

    mpp[xr] = mpp.get(xr, 0) + 1









# output section...
print(f"Total number of subarrays with XOR {k} is: {cnt}")