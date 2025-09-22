# # main.py
# n = int(input())
# print(n * n)

# # Reverse Num + Palindrome...
revNum = 0
count = 0

n = int(input())
dup = n
while(n>0):
    lastDigit = n % 10
    count = count + 1
    n = n // 10
    revNum = revNum * 10 + lastDigit
if(dup == revNum):
    print("Is no. is palindrome:- Yes")
else:
    print("Is no. is palindrome:- No")

print("No.", count)
print("RevN", revNum)


# # Logs...
# import math

# n = int(input("Enter a number: "))
# revr = 0

# if n == 0:
#     count = 1
# else:
#     count = int(math.log10(n)) + 1

# print("No. of digits:", count)
