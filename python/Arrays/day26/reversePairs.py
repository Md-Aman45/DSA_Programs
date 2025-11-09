# -------- OPTIMAL APPROACH --------
def merge_sort(arr, low, high):
    cnt = 0
    if low >= high:
        return cnt
    
    mid = (low + high) // 2
    cnt += merge_sort(arr, low, mid)
    cnt += merge_sort(arr, mid + 1, high)
    cnt += count_pairs(arr, low, mid, high)
    merge(arr, low, mid, high)

    return cnt



def merge(arr, low, mid, high):
    temp = []
    left = low
    right = mid + 1

    while left <= mid and right <= high:
        if arr[left] <= arr[right]:
            temp.append(arr[left])
            left += 1
        
        else:
            temp.append(arr[right])
            right += 1
    
    while left <= mid:
        temp.append(arr[left])
        left += 1
    
    while right <= high:
        temp.append(arr[right])
        right += 1

    for i in range(low, high + 1):
        arr[i] = temp[i - low]




def count_pairs(arr, low, mid, high):
    right = mid + 1
    cnt = 0
    for i in range(low, mid + 1):
        while right <= high and arr[i] > 2 * arr[right]:
            right += 1
        
        cnt += (right - (mid + 1))
    
    return cnt






# -------- MAIN --------
n = int(input("Enter number of element: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))


# -------- OPTIMAL APPROACH --------
print("Reverse Pairs:", merge_sort(arr, 0, n - 1))



# -------- BRUTE FORCE APPROACH ---------
# cnt = 0
# for i in range(n - 1):
#     for j in range(i + 1, n):
#         if arr[i] > 2 * arr[j]:
#             cnt += 1
    
# print("Reverse Pairs:", cnt)