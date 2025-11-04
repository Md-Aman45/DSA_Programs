n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

target = int(input("Enter target: "))



# -------- BRUTE APPROACH FOR 4 SUM --------
# st = set()

# for i in range(n):
#     for j in range(i + 1, n):
#         for k in range(j + 1, n):
#             for l in range(k + 1, n):
#                 sum_ = arr[i] + arr[j] + arr[k] + arr[l]

#                 if sum_ == target:
#                     temp = tuple(sorted([arr[i], arr[j], arr[k], arr[l]]))
#                     st.add(temp)





# -------- BETTER APPROACH --------
# st = set()

# for i in range(n):
#     for j in range(i + 1, n):
#         seen = set()
#         for k in range(j + 1, n):
#             sum_ = arr[i] + arr[j] + arr[k]

#             l = target - sum_

#             if l in seen:
#                 temp = tuple(sorted([arr[i], arr[j], arr[k], l]))
#                 st.add(temp)
            
#             seen.add(arr[k])






# -------- OPTIMAL APPROACH --------
arr.sort()
st = set()

for i in range(n - 3):
    if i > 0 and arr[i] == arr[i - 1]: continue

    for j in range(i + 1, n - 2):
        if j > i + 1 and arr[j] == arr[j - 1]: continue

        k = j + 1
        l = n - 1

        while k < l:
            sum_ = arr[i] + arr[j] + arr[k] + arr[l]

            if sum_ == target:
                st.add((arr[i], arr[j], arr[k], arr[l]))
                k += 1
                l -= 1

                while (k < l and arr[k] == arr[k - 1]): k += 1
                while (k < l and arr[l] == arr[l + 1]): l -= 1

            elif sum_ < target:
                k += 1
            else:
                l -= 1



# Print the result...
if not st:
    print(f"No 4 Sum found that sum to {target}:- {{}}")
else:
    print(f"4 Sum that sum to {target}:-")
    for ans in st:
        print(list(ans))