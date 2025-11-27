from math import ceil

# ---------- Linear Search ----------
# def smallOfDiv(arr, threshold):
#     n = len(arr)
    # maxi = float('-inf')

    # for i in range(n):
    #     maxi = max(maxi, arr[i])

    
#     for d in range(1, maxi + 1):
#         sumD = 0

#         for i in arr:
#             sumD += ceil(i / d)

#         if sumD <= threshold:
#             return d
    
#     return -1






# ---------- Binary Search ----------
def sumByDiv(arr, div):
    n = len(arr)
    sumd = 0

    for i in arr:
        sumd += ceil(i / div)

    return sumd



def smallestDivisor(arr, threshold):
    n = len(arr)
    maxi = float('-inf')

    for i in range(n):
        maxi = max(maxi, arr[i])

    # ---------- Binary Search ----------
    low = 0
    high = maxi

    while low <= high:
        mid = (low + high) // 2

        if sumByDiv(arr, mid) <= threshold:
            high = mid - 1
        
        else:
            low = mid + 1
    
    return low




if __name__ == "__main__":
    n = int(input("Enter number of elements: "))
    
    print("Enter the numbers:", end=" ")
    arr = list(map(int, input().split()))

    threshold = int(input("Enter threshold: "))

    ans = smallestDivisor(arr, threshold)
    print("Smallest Divisor =", ans)