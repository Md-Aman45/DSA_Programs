def peak_element(arr, n):
    if n == 1:
        return 0
    
    if arr[0] > arr[1]:
        return 0
    
    if arr[n - 1] > arr[n - 2]:
        return n - 1
    
    low = 1
    high = n - 2

    while low <= high:
        mid = (low + high) // 2

        if arr[mid] > arr[mid - 1] and arr[mid] > arr[mid + 1]:
            return mid
        
        elif arr[mid] > arr[mid - 1]:
            low = mid + 1
        
        # Only for 1 peak element...
        elif arr[mid] > arr[mid + 1]:
            high = mid - 1
    
    return -1



# main part...
n = int(input("Enter the no. of elements: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))


ans = peak_element(arr, n)

if ans != -1:
    print(f"Peak Element found at index {ans} with value {arr[ans]}.")
else:
    print("No peak element found.")




# --------- Linear Search ----------
# for i in range(n):
#     if (i == 0 or arr[i - 1] < arr[i]) and (i == n - 1 or arr[i] > arr[i + 1]):
#         print(f"Peak Element found at index {i} with value {arr[i]}.")