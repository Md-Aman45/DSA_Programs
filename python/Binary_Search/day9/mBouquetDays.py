def possible(arr, day, m, k, n):
    cnt = 0
    bouquets = 0

    for i in range(n):
        if arr[i] <= day:
            cnt += 1
        else:
            bouquets += (cnt // k)
            cnt = 0
        
    bouquets += (cnt // k)

    return bouquets >= m


def roseGarden(arr, m, k, n):
    val = m * k

    if val > n:
        return -1
    
    mini = float('inf')
    maxi = float('-inf')

    for i in range(n):
        mini = min(mini, arr[i])
        maxi = max(maxi, arr[i])

    low = mini
    high = maxi

    while low <= high:
        mid = (low + high) // 2

        if possible(arr, mid, m, k, n):
            high = mid - 1
        else:
            low = mid + 1
        
    return low



if __name__ == "__main__":
    print("Enter number of flowers (n): ", end="")
    n = int(input())

    print("Enter bloom days: ", end="")
    arr = list(map(int, input().split()))

    print("Enter number of bouquets (m): ", end="")
    m = int(input())

    print("Enter flowers needed per bouquet (k): ", end="")
    k = int(input())

    ans = roseGarden(arr, m, k, n)
    
    if ans == -1:
        print("There is no possible days.")
    else:
        print("Minimum days required:", ans)