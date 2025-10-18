n1 = int(input("Enter the size of n1 array: "))
a = list(map(int, input(f"Enter {n1} numbers for n1 array: ").split()))

n2 = int(input("Enter the size of n2 array: "))
b = list(map(int, input(f"Enter {n2} numbers for n2 array: ").split()))

a.sort()
b.sort()

# # 2 pointer...
def union_of_sorted_arrays(a, b):
    i = j = 0
    n1, n2 = len(a), len(b)
    union_arr = []

    while i < n1 and j < n2:
        if a[i] <= b[j]:
            if not union_arr or union_arr[-1] != a[i]:
                union_arr.append(a[i])
            i += 1
        else:
            if not union_arr or union_arr[-1] != b[j]:
                union_arr.append(b[j])
            j += 1

    while i < n1:
        if not union_arr or union_arr[-1] != a[i]:
            union_arr.append(a[i])
        i += 1
    
    while j < n2:
        if not union_arr or union_arr[-1] != b[j]:
            union_arr.append(a[i])
        j += 1

    return union_arr

print("Union of the two arrays:", union_of_sorted_arrays(a, b))