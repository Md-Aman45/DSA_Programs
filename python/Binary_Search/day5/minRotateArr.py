def findMinInRotatedArray(arr, n):
    low = 0
    high = n - 1
    ans = float('inf')

    while low <= high:
        mid = (low + high) // 2


        #  If array from low to high is already sorted...
        if arr[low] <= arr[high]:
            ans = min(ans, arr[low])
            break

        
        #  Left half is sorted...
        if arr[low] <= arr[mid]:
            ans = min(ans, arr[low])
            low = mid + 1
        
        #  Right half is sorted...
        else:
            ans = min(ans, arr[mid])
            high = mid - 1
        
    return ans




# main part...
n = int(input("Enter the no. of elements: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))


value = findMinInRotatedArray(arr, n)
print("Minimum element:", value)
        