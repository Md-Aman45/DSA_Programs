def canWePlace(arr, distance, cows):
    cntCows = 1
    lastPos = arr[0]
    n = len(arr)

    for i in range(1, n):
        if arr[i] - lastPos >= distance:
            cntCows += 1
            lastPos = arr[i]

        if cntCows >= cows:
            return True
    
    return False



def aggressiveCowss(arr, cows):
    # # ---------- Linear Search ----------
    # arr.sort()
    # n = len(arr)
    # n1 = arr[n - 1] - arr[0]

    # for i in range(1, n1):
    #     if canWePlace(arr, i, cows) == True: continue

    #     else:
    #         return (i - 1)
    
    # return -1



    # ---------- Binary Search ----------
    arr.sort()
    n = len(arr)

    low = 1
    high = arr[n - 1] - arr[0]

    while low <= high:
        mid = (low + high) // 2

        if canWePlace(arr, mid, cows) == True:
            low = mid + 1
        
        else:
            high = mid - 1
        
    return high



if __name__ == "__main__":
    n = int(input("Enter the number of stalls: "))

    arr = list(map(int, input("Enter the stall positions: ").split()))

    cows = int(input("Enter number of cows: "))

    ans = aggressiveCowss(arr, cows)

    print("The largest minimum distance is:", ans)