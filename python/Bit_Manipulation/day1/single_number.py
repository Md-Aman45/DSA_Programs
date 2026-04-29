def single_number_I(arr):
    n = len(arr)
    xor = 0

    for i in range(n):
        xor ^= arr[i]
    
    return xor




# main...
n = int(input("Enter the size of arr: "))
arr = list(map(int, input(f"Enter {n} elements: ").split()))


res = single_number_I(arr)

print("single number:", res)