n = int(input("Enter the size of array: "))
arr = list(map(int, input(f"Enter {n} numbers: ").split()))


# # better approach (using hashMap)...
# freq = {}

# for num in arr:
#     freq[num] = freq.get(num, 0) + 1

# found = False
# for num, count in freq.items():
#     if count > n // 2:
#         print("Majority element:", num)
#         found = True
#         break

# if not found:
#     print("No majority element found.")




# # optimal approach...
cnt = 0
el = -1

for i in range(n):
    if cnt == 0:
        cnt = 1
        el = arr[i]
    elif arr[i] == el:
        cnt += 1
    else:
        cnt -= 1
    

cnt1 = 0
for i in range(n):
    if arr[i] == el:
        cnt1 += 1

if cnt1 > n // 2:
    print("Majority element with optimal:", el)
else:
    print("No majority element found")