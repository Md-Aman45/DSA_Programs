# import heapq

# class Solution:
#     def minmaxGasDist(self, stations, k):
#         n = len(stations)

#         pq = []

#         for i in range(n - 1):
#             baseLen = stations[i + 1] - stations[i]
#             heapq.heappush(pq, (-baseLen, baseLen, 0))


#         for _ in range(k):
#             negLen, baseLen, cnt = heapq.heappop(pq)
#             cnt += 1
#             newLen = baseLen / (cnt + 1)
#             heapq.heappush(pq, (-newLen, baseLen, cnt))
        
#         return -pq[0][0]
    

import math

class Solution:
    def minmaxGasDist(self, stations, k):
        n = len(stations)

        def requiredStations(maxDist):
            count = 0
            for i in range(n - 1):
                diff = stations[i + 1] - stations[i]
                count += math.ceil(diff / maxDist) - 1
            
            return count
        


        low = 0
        high = stations[-1] - stations[0]

        while high - low > 1e-6:
            mid = (low + high) / 2

            if requiredStations(mid) > k:
                low =  mid
            else:
                high = mid
        

        return high







if __name__ == "__main__":
    n = int(input("Enter the no. of gas stations: "))

    arr = list(map(int, input(f"Enter {n} gas positions: ").split()))

    k = int(input("Enter k (new stations to add): "))

    sol = Solution()
    ans = sol.minmaxGasDist(arr, k)


    print("Minimum possible maximum distance =", ans)