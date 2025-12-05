def kthelement(arr1, arr2, n1, n2, k):
    if n1 > n2:
        return kthelement(arr2, arr1, n2, n1, k)

    low = max(0, k - n2)
    high = min(k, n1)

    while low <= high:
        mid1 = (low + high) // 2
        mid2 = k - mid1

        l1 = float('-inf') if mid1 == 0 else arr1[mid1 - 1]
        l2 = float('-inf') if mid2 == 0 else arr2[mid2 - 1]
        r1 = float('inf') if mid1 == n1 else arr1[mid1]
        r2 = float('inf') if mid2 == n2 else arr2[mid2]

        if l1 <= r2 and l2 <= r1:
            return max(l1, l2)
        elif l1 > r2:
            high = mid1 - 1
        else:
            low = mid1 + 1

    return -1



if __name__ == "__main__":
    print("Enter size of first array: ", end="")
    n1 = int(input())
    print(f"Enter {n1} sorted elements: ", end="")
    arr1 = list(map(int, input().split()))

    print("Enter size of second array: ", end="")
    n2 = int(input())
    print(f"Enter {n2} sorted elements: ", end="")
    arr2 = list(map(int, input().split()))

    print("Enter k (1-based index): ", end="")
    k = int(input())

    ans = kthelement(arr1, arr2, n1, n2, k)

    print(f"The {k}-th smallest element is = {ans}")