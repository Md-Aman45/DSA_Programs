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
    # ans = 0

    # for bitIndex in range(32):
    #     cnt = 0

    #     for i in range(n):
    #         if (arr[i] & (1 << bitIndex)) != 0:
    #             cnt += 1

    #     if cnt % 3 == 1:
    #         ans = ans | (1 << bitIndex)

    # return ans





    # third approach...
    # arr.sort()
    # n = len(arr)

    # for i in range(1, n, 3):
    #     if arr[i] != arr[i - 1]:
    #         return arr[i - 1]

    # return arr[n - 1]





    # fourth approach...
    ones = 0
    twos = 0

    for num in arr:
        ones = (ones ^ num) & ~twos
        twos = (twos ^ num) & ~ones

    return ones



n = int(input("Enter size of array: "))
arr = list(map(int, input("Enter elements: ").split()))

res = single(arr)
print("Single number is:", res)