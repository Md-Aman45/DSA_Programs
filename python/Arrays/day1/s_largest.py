n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

largest = arr[0]
slargest = -1

for i in range(1, n):
    if (arr[i] > largest):
        slargest = largest
        largest = arr[i]
    elif (arr[i] < largest and arr[i] > slargest):
        arr[i] = slargest
    
print(f"Second largest Number is: {slargest}")