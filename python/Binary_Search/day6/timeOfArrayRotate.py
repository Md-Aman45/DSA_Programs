def timesOfArrayRotate(arr, n):
    low = 0
    high = n - 1
    ans = float('inf')
    index = -1

    while low <= high:
        mid = (low + high) // 2

        if arr[low] <=  arr[high]:
            if arr[low] < ans:
                ans = arr[low]
                index = low
            break


        if arr[low] <= arr[mid]:
            if arr[low] < ans:
                ans = arr[low]
                index = low

            low = mid + 1
        
        
        else:
            if arr[mid] < ans:
                ans = arr[mid]
                index = mid

            high = mid - 1
        


    return index



# main part...
n = int(input("Enter the no. of elements: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))


rotations = timesOfArrayRotate(arr, n)
print("Array rotated:", rotations, "times")