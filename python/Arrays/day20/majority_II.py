n = int(input("Enter the size of array: "))
arr = list(map(int, input(f"Enter {n} numbers: ").split()))



# -------- BRUTE APPROACH --------
# ls = []
# for i in range(n):
#     if arr[i] not in ls:
#         cnt = 0
#         for j in range(n):
#             if arr[j] == arr[i]:
#                 cnt += 1

#         if cnt > n // 3:
#                 ls.append(arr[i])

#     if len(ls) == 2: 
#         break

# print("Elements occurring more than n/3 times:", ls)






# -------- BETTER APPROACH --------
# using hashmap
# ls = []
# mpp = {}
# mini = (n // 3) + 1

# for i in range(n):
#     mpp[arr[i]] = mpp.get(arr[i], 0) + 1

# for key, val in mpp.items():
#     if val >= mini:
#         ls.append(key)

# print("Elements occurring more than n/3 times:", ls)






# -------- OPTIMAL APPROACH --------
cnt1, cnt2 = 0, 0
el1, el2 = -1, -1

for i in range(n):
    if cnt1 == 0 and arr[i] != el2:
        cnt1, el1 = 1, arr[i]
    elif cnt2 == 0 and arr[i] != el1:
        cnt2, el2 = 1, arr[i]
    elif el1 == arr[i]:
        cnt1 += 1
    elif el2 == arr[i]:
        cnt2 += 1
    else:
        cnt1 -= 1
        cnt2 -= 1
    

cnt1, cnt2 = 0, 0
for i in range(n):
    if el1 == arr[i]:
        cnt1 += 1
    elif el2 == arr[i]:
        cnt2 += 1
    
res = []
if cnt1 > (n // 3):
    res.append(el1)
if cnt2 > (n // 3):
    res.append(el2)


print("Elements occurring more than n/3 times:", res)