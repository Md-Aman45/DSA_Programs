def single(arr):



    # brute force approach...
    # mpp = {}

    # for num in arr:
    #     mpp[num] = mpp.get(num, 0) + 1

    # ans = []

    # for key, value in mpp.items():
    #     if value == 1:
    #         ans.append(key)

    # return ans




    # optimal approach...
    xor = 0

    for num in arr:
        xor ^= num

    rightMost = xor & -xor

    x = 0
    y = 0

    for num in arr:
        if (num & rightMost) != 0:
            x ^= num
        else:
            y ^= num

    return [x, y]



# main
n = int(input("Enter the size of arr: "))
arr = list(map(int, input("Enter elements: ").split()))

res = single(arr)

print("Single numbers are:", res)