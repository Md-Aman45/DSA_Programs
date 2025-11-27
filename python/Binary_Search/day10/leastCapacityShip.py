def shippingOfDays(weight, cap):
    n = len(weight)
    days = 1
    load = 0

    for i in range(n):
        if load + weight[i] > cap:
            days = days + 1
            load = weight[i]
        
        else:
            load += weight[i]
        
    return days



def sumOfTotal(weight):
    total = 0

    for num in weight:
        total += num
    
    return total



def leastCapacityDays(weight, days):
    n = len(weight)
    maxi = float('-inf')

    for i in range(n):
        maxi = max(maxi, weight[i])
    

    low = maxi
    high = sumOfTotal(weight)

    while low <= high:
        mid = (low + high) // 2

        noOfDays = shippingOfDays(weight, mid)

        if noOfDays <= days:
            high = mid - 1
        
        else:
            low = mid + 1
    
    return low



if __name__ == "__main__":
    n = int(input("Enter number of elements: "))

    print("Enter the weights:", end=" ")
    weight = list(map(int, input().split()))

    days = int(input("Enter days: "))

    ans = leastCapacityDays(weight, days)
    print(f"Minimum ship capcity needed = {ans}")