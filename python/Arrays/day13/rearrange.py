n = int(input("Enter the size of Array: "))
arr = list(map(int, input(f"Enter {n} numbers: ").split()))

# # Brute-force approach
# pos = []
# neg = []

# for num in arr:
#     if num >= 0:
#         pos.append(num)
#     else:
#         neg.append(num)

# i = 0
# for p, nval in zip(pos, neg):
#     arr[2 * i] = p
#     arr[2 * i + 1] = nval
#     i += 1

# print("Rearranged Array:", arr)





# # optimal approach...
ans = [0] * n
pos = 0
neg = 1

for num in arr:
    if num < 0:
        if neg < n:
            ans[neg] = num
            neg += 2
    else:
        if pos < n:
            ans[pos] = num
            pos += 2

print("Rearranged Array with optimal:", ans)
