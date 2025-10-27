n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))


# # Best Time to buy & sell stock...
# mini = arr[0]
# profit = 0

# for i in range(1, n):
#     cost = arr[i] - mini
#     profit = max(profit, cost)

#     mini = min(mini, arr[i])

# print("The maximum profit you can achieve is:", profit)



# # next version...
mini = arr[0]
profit = 0
buyPrice = arr[0]
sellPrice = arr[0]

for i in range(1, n):
    cost = arr[i] - mini
    
    if cost > profit:
        profit = cost
        buyPrice = mini
        sellPrice = arr[i]

    mini = min(mini, arr[i])


print("Buy at:", buyPrice)
print("Sell at:", sellPrice)
print("The maximum profit you can achieve is:", profit)