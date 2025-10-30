n = int(input("Enter number of rows: "))
m = int(input("Enter number of columns: "))

if n != m:
    print("Rotation is only valid for square matrices!")
    exit()

matrix = []
print("Enter matrix elements row by row: ")
for i in range(n):
    matrix.append(list(map(int, input().split())))





# -------- BRUTE APPROACH --------
# ans = [[0] * n for _ in range(n)]

# for i in range(n):
#     for j in range(n):
#         ans[j][n - 1 - i] = matrix[i][j]





# -------- OPTIMAL APPROACH --------
for i in range(n):
    for j in range(i + 1, n):
        matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

for i in range(n):
    left = 0
    right = n - 1

    while left < right:
        matrix[i][left], matrix[i][right] = matrix[i][right], matrix[i][left]
        left += 1
        right -= 1




# -------- OUTPUT SECTION --------
print("\nModified Matrix:")
for row in matrix:
    print(*row)