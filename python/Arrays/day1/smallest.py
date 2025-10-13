n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

smallest = arr[0]
# for i in range(1, n - 1):
#     if (arr[i] < smallest):
#         smallest = arr[i]
    
# print(f"Smallest number is: {smallest}")

ssmallest = float('inf')

for i in range(1, n):
    if (arr[i] < smallest):
        ssmallest = smallest
        smallest = arr[i]
    elif (arr[i] != smallest and arr[i] < ssmallest):
        ssmallest = arr[i]

if ssmallest == float('inf'):
    print("There is no second smallest number.")
else:
    print(f"Second Smallest is: {ssmallest}")