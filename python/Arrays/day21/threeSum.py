n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))



# -------- BRUTE APPROACH FOR 3 SUM --------
# st = set()
# for i in range(n):
#     for j in range(i + 1, n):
#         for k in range(j + 1, n):
#             if arr[i] + arr[j] + arr[k] == 0:
#                 temp = [arr[i], arr[j], arr[k]]
#                 temp.sort()
#                 st.add(tuple(temp))


# if not st:
#     print("No 3 Sum found that sum to 0:- {}")
# else:
#     print("3 Sum that sum to 0:-")
#     for res in st:
#         print(list(res))





# -------- BETTER APPROACH --------
# st = set()

# for i in range(n):
#     hash = set()
#     for j in range(i + 1, n):
#         k = - (arr[i] + arr[j])

#         if k in hash:
#             temp = [arr[i], arr[j], k]
#             temp.sort()
#             st.add(tuple(temp))
#         else:
#             hash.add(arr[j])


# if not st:
#     print("No 3 Sum found that sum to 0:- {}")
# else:
#     print("3 Sum that sum to 0:-")
#     for res in st:
#         print(list(res))






# -------- OPTIMAL APPROACH --------
arr.sort()
ans = []

for i in range(n):
    if i > 0 and arr[i] == arr[i - 1]:
        continue
    
    j = i + 1
    k = n - 1

    while (j < k):
        sum_ = arr[i] + arr[j] + arr[k]

        if sum_ < 0:
            j += 1
        elif sum_ > 0:
            k -= 1
        else:
            temp = [arr[i], arr[j], arr[k]]
            ans.append(temp)
            j += 1
            k -= 1

            while ( j < k and arr[j] == arr[j - 1]): j += 1
            while ( j < k and arr[k] == arr[k + 1]): k -= 1



if not ans:
    print("No 3 Sum found that sum to 0:- {}")
else:
    print("3 Sum that sum to 0:-")
    for res in ans:
        print(list(res))