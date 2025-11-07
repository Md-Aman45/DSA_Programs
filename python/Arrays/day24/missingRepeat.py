n = int(input("Enter number of elements: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))



# -------- BRUTE FORCE APPROACH ---------
# repeating = -1
# missing = -1

# for i in range(1, n + 1):
#     cnt = 0
#     for j in range(n):
#         if arr[j] == i:
#             cnt += 1
        
#         if cnt == 2:
#             repeating = i

#         elif cnt == 0:
#             missing = i




# -------- BETTER APPROACH ---------
# hash = [0] * (n + 1)
# for i in range(n):
#     hash[arr[i]] += 1

#     repeating = -1
#     missing = -1

#     for i in range(1, n + 1):
#         if hash[i] == 2:
#             repeating = i
#         elif hash[i] == 0:
#             missing = i






# -------- OPTIMAL APPROACH ---------
s, s2 = 0, 0
sn = (n * (n + 1)) // 2
s2n = (n * (n + 1) * (2 * n + 1)) // 6

for i in range(n):
    s += arr[i]
    s2 += arr[i] * arr[i]

val1 = s - sn
val2 = s2 - s2n

val2 = val2 // val1

x = (val1 + val2) // 2

y = x - val1




print("Repeating number:", x)
print("Missing number:", y)