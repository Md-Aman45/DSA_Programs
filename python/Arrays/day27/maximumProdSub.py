n = int(input("Enter number of element: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))



# -------- BRUTE FORCE APPROACH ---------
# maxi = float('-inf')

# for i in range(n):
#     for j in range(i, n):
#         prod = 1
#         for k in range(i, j + 1):
#             prod = prod * arr[k]
            
#         maxi = max(maxi, prod)





# -------- BETTER APPROACH ---------
# maxi = float('-inf')

# for i in range(n):
#     prod = 1
#     for j in range(i, n):
#         prod = prod * arr[j]
#         maxi = max(maxi, prod)





# -------- OPTIMAL APPROACH ---------
maxi = float('-inf')
prefix, suffix = 1, 1

for i in range(n):
    if prefix == 0:
        prefix = 1
    if suffix == 0:
        suffix = 1
    
    prefix *= arr[i]
    suffix *= arr[n - i - 1]

    maxi = max(maxi, max(prefix, suffix))





print("Maximum Product Subarray =", maxi)