n = int(input("Enter the no. of elements: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

x = int(input("Enter x: "))



# --------- Linear Search ---------
# first = -1
# last = -1
# for i in range(n):
#     if arr[i] == x:
#         if first == -1:
#             first = i

#         last = i




# ---------- Lower Bound ----------
# low, high = 0, n - 1
# lb = n

# while low <= high:
#     mid = (low + high) // 2

#     if arr[mid] >= x:
#         lb = mid
#         high = mid - 1
    
#     else:
#         low = mid + 1
    



# # ---------- Upper Bound ----------
# low, high = 0, n - 1
# ub = n

# while low <= high:
#     mid = (low + high) // 2

#     if arr[mid] > x:
#         ub = mid
#         high = mid - 1
    
#     else:
#         low = mid + 1





# # ---------- First and Last Occurrence ----------
# if lb == n or arr[lb] != x:
#     first = -1
#     last = -1
# else:
#     first = lb
#     last = ub - 1




def firstOccurrence(arr, n , x):
    low = 0
    high = n - 1
    first = -1

    while low <= high:
        mid = (low + high) // 2

        if arr[mid] == x:
            first = mid
            high = mid - 1
        elif arr[mid] < x:
            low = mid + 1
        else:
            high = mid - 1
    
    return first



def lastOccurrence(arr, n , x):
    low = 0
    high = n - 1
    last = -1

    while low <= high:
        mid = (low + high) // 2

        if arr[mid] == x:
            last = mid
            low = mid + 1
        elif arr[mid] < x:
            low = mid + 1
        else:
            high = mid - 1
    
    return last




first = firstOccurrence(arr, n, x)
last = lastOccurrence(arr, n, x)




print("First Occurrence:", first)
print("Last Occurrence:", last)
