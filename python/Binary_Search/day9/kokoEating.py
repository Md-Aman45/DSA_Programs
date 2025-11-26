# Function to find max element in array...
def findMax(arr, n):
    maxi = float('-inf')

    for i in range(n):
        maxi = max(maxi, arr[i])
    
    return maxi


# Function to calculate total hours needed at speed k...
def calculateHrs(piles, k):
    hours = 0

    for pile in piles:
        # same as ceil(pile / k)...
        hours += (pile + k - 1) // k

    return hours



# Main function to find minimum eating speed...
def minEatingSpeed(piles, h, n):
    low = 1
    high = findMax(piles, n)

    while low <= high:
        mid = (low + high) // 2

        totalhrs = calculateHrs(piles, mid)

        if totalhrs <= h:
            high = mid - 1
        
        else:
            low = mid + 1
    
    return low




# main part...
if __name__ == "__main__":
    n = int(input("Enter number of piles: "))
    piles = list(map(int, input("Enter pile sizes: ").split()))
    h = int(input("Enter total hours H: "))

    result = minEatingSpeed(piles, h, n)
    print(f"Minimum eating speed: {result} bananas/hour")