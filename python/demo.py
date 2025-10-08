# # main.py
# n = int(input())
# print(n * n)

# # Reverse Num + Palindrome + Armstrong...
# revNum = 0
# count = 0
# sum = 0

# n = int(input())
# dup = n
# while(n>0):
#     lastDigit = n % 10
#     count = count + 1
#     n = n // 10
#     revNum = revNum * 10 + lastDigit
#     sum = sum + (lastDigit * lastDigit * lastDigit)
# if(dup == revNum):
#     print("Is no. is palindrome:- Yes")
# else:
#     print("Is no. is palindrome:- No")

# if(dup == sum):
#     print("Is no. is armstrong:- Yes")
# else:
#     print("Is no. is armstrong:- No")

# print("No.", count)
# print("RevN", revNum)


# # print All Divisions
# import math
# divisors = []
# for i in range(1, int(math.sqrt(n)) + 1):
#     if n%i == 0:
#         divisors.append(i)
#         if n // i != i:
#             divisors.append(n//i)
# divisors.sort()
# print(f"Numbers Divided by {n} :- {divisors}")


# # Prime no...
# count = 0
# for i in range(1, n+1):
#     if n%i == 0:
#         count+=1
# if(count == 2):
#     print("No. is prime:-", n)
# else:
#     print("No. is not prime:-", n)


# # Prime factor of a Number...
# n = int(input())
# dup = n
# import math

# prime_factors = []

# for i in range(2, int(math.sqrt(n)) + 1):
#     if n % i == 0:
#         prime_factors.append(i)
#         while n % i == 0:
#             n = n // i

# if(n != 1):
#     prime_factors.append(n)
# print(f"Prime Factors of {dup} :- {prime_factors}")

# # # gcd...
# a = 100
# b = 80

# while a != 0 and b != 0:
#     if a > b:
#         a = a % b
#     else:
#         b = b % a
# if a == 0:
#     print(b)
# else:
#     print(a)



# # # Power Exponentiation...
# x = -3
# n = 9
# m = n

# ans = 1
# while (n > 0):
#         if (n % 2 == 1):
#             ans = ans * x
#             n = n - 1
        
#         else:
#             n = n // 2
#             x = x * x
# if m < 0:
#      ans = 1 // ans

# print(ans)



# # Sieve of Eratosthenes...
import math


def get_sieve(n):
    prime = [1 for _ in range(n + 1)]
    prime[0] = prime[1] = 0

    for i in range(2, int(math.sqrt(n) + 1)):
        if prime[i] == 1:
            for j in range(i * i, n + 1, i):
                prime[j] = 0
    return prime


def func(queries):
    right = max(r for _, r in queries)

    prime = get_sieve(right)

    for i in range (2, right + 1):
        prime[i] += prime[i - 1]
    
    for l , r in queries:
        ans = prime[r] - prime[l - 1]
        print(ans)


if __name__ == "__main__":
    q = int(input())
    queries = []

    for _ in range(q):
        l, r = map(int, input().split())
        queries.append([l, r])
    
    func(queries)