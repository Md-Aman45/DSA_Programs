# # main.py
# n = int(input())
# print(n * n)

# # Reverse Num + Palindrome + Armstrong...
# revNum = 0
# count = 0
# sum = 0

n = int(input())
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


# print All Divisions
import math
divisors = []
for i in range(1, int(math.sqrt(n)) + 1):
    if n%i == 0:
        divisors.append(i)
        if n // i != i:
            divisors.append(n//i)
divisors.sort()
print(f"Numbers Divided by {n} :- {divisors}")

