n = int(input("Enter number of intervals: "))

arr = []
print("Enter intervals (start end):")
for _ in range(n):
    start, end = map(int, input().split())
    arr.append([start, end])

# -------- BRUTE FORCE APPROACH ---------
# # Step 1: Sort intervals by starting time
# arr.sort()

# # Step 2: Initialize answer list
# ans = []

# # Step 3: Merge overlapping intervals one by one
# for i in range(len(arr)):
#     start = arr[i][0]
#     end = arr[i][1]

#     # Skip intervals already covered by previous merged ones
#     if ans and end <= ans[-1][1]:
#         continue

#     # Merge overlapping intervals
#     for j in range(i + 1, len(arr)):
#         if arr[j][0] <= end:  # overlap
#             end = max(end, arr[j][1])
#         else:
#             break
#     ans.append([start, end])




# -------- OPTIMAL APPROACH ---------
arr.sort(key=lambda x: x[0])

# Step 2: Initialize merged list
ans = []

# Step 3: Process each interval
for interval in arr:
    # If empty OR no overlap → add new interval
    if not ans or ans[-1][1] < interval[0]:
        ans.append(interval)
    else:
        # Overlapping → merge by updating the end
        ans[-1][1] = max(ans[-1][1], interval[1])






# Step 4: Print merged intervals
print("\nMerged Intervals:")
for interval in ans:
    print(interval[0], interval[1])
