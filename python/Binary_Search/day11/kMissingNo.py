def findKthMissing(arr, k):
    n = len(arr)
    
    low = 0
    high = n - 1

    while low <= high:
        mid = (low + high) // 2

        missing = arr[mid] - (mid + 1)

        if missing < k:
            low = mid + 1
        else:
            high = mid - 1
    
    return (low + k)



if __name__ == "__main__":
    n = int(input("Enter the no. of elements: "))

    arr = list(map(int, input(f"Enter {n} numbers: ").split()))

    k = int(input("Enter k: "))

    ans = findKthMissing(arr, k)

    print("Output", ans)