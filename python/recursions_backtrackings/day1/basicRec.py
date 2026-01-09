# (1)print Name n times...
# def n_times(i, n):
#     if i > n:    
#         return

#     print("Aman")
#     n_times(i + 1, n)  


# n = int(input("Enter n = "))
# n_times(1, n)




# (2) Print Linearly from 1 to N...
# def linearly(i, n):
#     if i > n:
#         return

#     print(i)
#     linearly(i + 1, n)


# n = int(input("Enter n = "))
# linearly(1, n)






# (3) Print from N to 1
# def n_to_one(n):
#     if n < 1:
#         return

#     print(n)
#     n_to_one(n - 1)


# n = int(input("Enter n = "))
# n_to_one(n)





# (4)Print Linearly (1 to N) using Backtracking
def linearly_back(n):
    if n < 1:
        return

    linearly_back(n - 1)
    print(n)              


n = int(input("Enter n = "))
linearly_back(n)
