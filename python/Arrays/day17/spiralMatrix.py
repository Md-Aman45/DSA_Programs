n = int(input("Enter number of rows: "))
m = int(input("Enter number of columns: "))

matrix = []

print("Enter matrix elements row by row: ")
for i in range(n):
    matrix.append(list(map(int, input().split())))



# ------- OPTIMAL APPROACH  for (Spiral Traversal of a matrix) --------
left = 0
right = m - 1
top = 0
bottom = n - 1

ans = []

# logic ------ (right -> bottom -> left -> top) ------

while top <= bottom and left <= right:
    # right...
    for i in range(left, right + 1):
        ans.append(matrix[top][i])
    top += 1

    # bottom...
    for i in range(top, bottom + 1):
        ans.append(matrix[i][right])
    right -= 1

    # left...
    if (top <= bottom):
        for i in range(right, left - 1, -1):
            ans.append(matrix[bottom][i])
        bottom -= 1
    
    # top...
    if (left <= right):
        for i in range(bottom, top - 1, -1):
            ans.append(matrix[i][left])
        left += 1


# -------- OUTPUT SECTION --------
print("Spiral order:")
print(*ans)