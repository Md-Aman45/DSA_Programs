def recurPermute(nums, ds, ans, freq):
    if len(ds) == len(nums):
        ans.append(ds.copy())
        return
    
    for i in range(len(nums)):
        if not freq[i]:
            freq[i] = True
            ds.append(nums[i])

            recurPermute(nums, ds, ans, freq)

            ds.pop()
            freq[i] = False




# -------- main --------
n = int(input("Enter the size of nums: "))
nums = list(map(int, input(f"Enter {n} elements: ").split()))

ans = []
ds = []
freq = [False] * n

recurPermute(nums, ds, ans, freq)


# print("Permutations:")
# for perm in ans:
#     print(perm)

print("result", ans)
