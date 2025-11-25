# ---------- Linear Search ----------
# # Function to calculate x^n (power)...
# def power(x, n):
#     ans = 1
#     for i in range(n):
#         ans *= x
    
#     return ans


# # main part...
# n = int(input("No of Nth Root:- "))
# m = int(input("Number:- "))

# ans = -1   # default (not found)...

# for i in range(1, m + 1):
#     val = power(i, n)
#     if val == m:
#         ans = i
#         break
#     elif val > m:
#         break

# print("Nth Root =", ans)








# ---------- Binary Search ----------
# return 1 if == m...
# return 0 if < m...
# return 2 if > m...
def powerExpo(mid, n, m):
    ans = 1
    for i in range(n):
        ans = ans * mid
        if ans > m:
            return 2
    
    if ans == m:
        return 1
    
    return 0





# main part...
n = int(input("No of Nth Root:- "))
m = int(input("Number:- "))

ans = -1   # default (not found)...

low = 1
high = m

while low <= high:
    mid = (low + high) // 2
    midN = powerExpo(mid, n, m)

    if midN == 1:
        ans = mid
        break

    elif midN == 0:
        low = mid + 1
    
    else:
        high = mid - 1

print("Nth Root =", ans)