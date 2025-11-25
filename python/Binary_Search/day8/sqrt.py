n = int(input("No:- "))
ans = -1

# --------- Linear Search ----------
# for i in range(n):
#     if i * i <= n:
#         ans = i
#     else:
#         break

# print("Square root (integer part) =", ans)





# ---------- Binary Search -----------
low = 1
high = n

while low <= high:
    mid = (low + high) // 2

    if mid * mid <= n:
        ans = mid
        low = mid + 1
    else:
        high = mid - 1
    
print("Square root (integer part) =", high)