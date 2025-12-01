def countPainters(arr, max_units):
    painters = 1
    current_units = 0

    for num in arr:
        if current_units + num <= max_units:
            current_units += num
        else:
            painters += 1
            current_units = num

    return painters



def findUnits(arr, n, k):
    if k > n:
        return -1
    
    low = max(arr)
    high = sum(arr)


    # ---------- Linear Search ----------
    # for max_units in range(low, high + 1):
    #     requirePainters = countPainters(arr, max_units)

    #     if requirePainters <= k:
    #         return max_units

    # return -1





    # ---------- Binary Search ----------
    while low <= high:
        mid = (low + high) // 2

        requirePainters = countPainters(arr, mid)

        if requirePainters > k:
            low = mid + 1
        else:
            high = mid - 1
        
    return low







if __name__ == "__main__":
    n = int(input("Enter number of boards: "))
    arr = list(map(int, input("Enter units of each board: ").split()))
    k = int(input("Enter number of painters: "))

    ans = findUnits(arr, n, k)
    print("Minimum time required =", ans)