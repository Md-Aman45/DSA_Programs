n = int(input("Enter the no. of elements: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

x = int(input("Enter x: "))



# ---------- Lower Bound ----------
# low, high = 0, n - 1
# ans = n

# while low <= high:
#     mid = (low + high) // 2

#     if arr[mid] >= x:
#         ans = mid
#         high = mid - 1
    
#     else:
#         low = mid + 1
    
# print("Lower bound index: ", ans)




# ---------- Upper Bound ----------
# low, high = 0, n - 1
# ans = n

# while low <= high:
#     mid = (low + high) // 2

#     if arr[mid] > x:
#         ans = mid
#         high = mid - 1
    
#     else:
#         low = mid + 1
    
# print("Upper bound index: ", ans)






# ---------- Search Insert Position ----------
low, high = 0, n - 1
ans = n

while low <= high:
    mid = (low + high) // 2

    if arr[mid] >= x:
        ans = mid
        high = mid - 1
    
    else:
        low = mid + 1
    

print("Search Insert Position =", ans)