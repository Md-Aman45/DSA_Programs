def single(arr):
    mpp = {}

    for num in arr:
        mpp[num] = mpp.get(num, 0) + 1

    ans = []

    for key, value in mpp.items():
        if value == 1:
            ans.append(key)

    return ans


# main
n = int(input("Enter the size of arr: "))
arr = list(map(int, input("Enter elements: ").split()))

res = single(arr)

print("Single numbers are:", res)