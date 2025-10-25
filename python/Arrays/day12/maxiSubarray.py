n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

# # optimal approach (using kadane's algorithm...)...
maxi = float('-inf')
sum = 0
start = 0
ansStart = -1
ansEnd = -1

for i in range(n):
    sum += arr[i]

    if sum > maxi:
        maxi = sum
        ansStart = start
        ansEnd = i
    
    if sum < 0:
        sum = 0
        start = i + 1

print("Maximum Subarray Sum:", maxi)

if ansStart != -1 and ansEnd != -1:
    print("Subarray:", end=" ")

    for i in range(ansStart, ansEnd + 1):
        print(arr[i], end=" ")
    print()