n = int(input("Enter the no. of elements: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

x = int(input("Enter x: "))





#  ---------- Floor ----------
#  floor -> largest no. in array <= x....
# low, high = 0, n - 1
# floor = -1

# while low <= high:
#     mid = (low + high) // 2

#     if arr[mid] <= x:
#         floor = arr[mid]
#         low = mid + 1
    
#     else:
#         high = mid - 1
    
# print("floor =", floor)






#  ---------- Ceil ----------
#  ceil -> smallest no. in array >= x...
low, high = 0, n - 1
ceil = -1

while low <= high:
    mid = (low + high) // 2

    if arr[mid] >= x:
        ceil = arr[mid]
        high = mid - 1
    
    else:
        low = mid + 1
    

print("Ceil =", ceil)