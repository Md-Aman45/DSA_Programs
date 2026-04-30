def single(arr):
    n = len(arr)

    # first approach...
    # mpp = {}

    # for num in arr:
    #     mpp[num] = mpp.get(num, 0) + 1

    # for key, value in mpp.items():
    #     if value == 1:
    #         return key
        
    # return -1





    # second approach...
    ans = 0

    for bitIndex in range(32):
        cnt = 0

        for i in range(n):
            if (arr[i] & (1 << bitIndex)) != 0:
                cnt += 1

        if cnt % 3 == 1:
            ans = ans | (1 << bitIndex)

    return ans



n = int(input("Enter size of array: "))
arr = list(map(int, input("Enter elements: ").split()))

res = single(arr)
print("Single number is:", res)