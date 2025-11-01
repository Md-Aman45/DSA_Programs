# ------------------- PASCAL TRIANGLE ------------------- 


# ------- Q1) Given row and column, find the element at that place...    (ex :- r = 5, c = 3, ans = 6 ) --------
# def nCr(n, r):
#     res = 1
#     for i in range(r):
#         res = res * (n - i)
#         res = res // (i + 1)

#     return res
    

# n = int(input("Enter row number (rows): "))
# r = int(input("Enter column number (cols): "))

# # In Pascal’s Triangle, element = nCr(n-1, r-1)
# ans = nCr(n - 1, r - 1)
# print(f"Element at row {n}, column {r} is: {ans}")




# --------- Q2) Print any num of row of pascal triangle.  (ex:- n = 5, ans = 1 4 6 4 1) ----------


# -------- BRUTE APPROACH ----------
# def nCr(n, r):
#     res = 1
#     for i in range(r):
#         res = res * (n - i)
#         res = res // (i + 1)

#     return res


# n = int(input("Enter row number (rows): "))
# for c in range(1, n + 1):
#     print(nCr(n - 1, c - 1), end=" ")

# print()


# -------- OPTIMAL APPROACH ---------
# n = int(input("Enter row number (rows): "))
# ans = 1
# print(ans, end=" ")

# for i in range(1, n):
#     ans = ans * (n - i)
#     ans = ans // i
#     print(ans, end=" ")

# print()








# ---------- Q3) Given n, print the entire pascal triangle --------------

# -------- OPTIMAL APPROACH --------
def generate_Row(n):
    ans = 1
    ansRow = [1]

    for col in range(1, n):
        ans = ans * (n - col)
        ans = ans // col
        ansRow.append(ans)

    return ansRow


n = int(input("Enter row number (rows): "))
triangle = []

for i in range(1, n + 1):
    triangle.append(generate_Row(i))

for row in triangle:
    print(*row)