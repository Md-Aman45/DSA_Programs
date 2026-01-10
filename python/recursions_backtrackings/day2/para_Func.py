# ---------- Parameterised ------------
# sum of n numbers...
# def sumOfN(i, sumi):
#     if i < 1:
#         print("result = ", sumi)
#         return
#     sumOfN(i - 1, sumi + i)


# n = int(input("Enter n = "))
# sumOfN(n, 0)





# ---------- Functional ------------
# sum of n numbers...
# def sumOfN(n):
#     if n == 0:
#         return 0
#     return n + sumOfN(n - 1)



# n = int(input("Enter n = "))
# result = sumOfN(n)
# print("result = ", result)






# ---------- Parameterised ------------
# factorial of n numbers...
# def factOfN(i, fact):
#     if i < 1:
#         print("result = ", fact)
#         return
#     factOfN(i - 1, fact * i)



# n = int(input("Enter n = "))
# factOfN(n, 1)





# ---------- Functional ------------
# factorial of n numbers...
def factOfN(n):
    if n == 0:
        return 1
    return n * factOfN(n - 1)


n = int(input("Enter n = "))
result = factOfN(n)
print("result = ", result)