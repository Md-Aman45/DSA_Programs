# -> This is only for brute force approach...
# def makeRow(matrix, i, m):
#     for j in range(m):
#         if matrix[i][j] != 0:
#             matrix[i][j] = -1


# def makeCol(matrix, j, n):
#     for i in range(n):
#         if matrix[i][j] != 0:
#             matrix[i][j] = -1




def set_matrix_zeroes(matrix):

    # -> brute approach...
    # n = len(matrix)
    # m = len(matrix[0])

    # for i in range(n):
    #     for j in range(m):
    #         if matrix[i][j] == 0:
    #             makeRow(matrix, i, m)
    #             makeCol(matrix, j, n)

    # for i in range(n):
    #     for j in range(m):
    #         if matrix[i][j] == -1:
    #             matrix[i][j] = 0



    # -> better approach...
    # row = [0] * n
    # col = [0] * m

    # for i in range(n):
    #     for j in range(m):
    #         if matrix[i][j] == 0:
    #             row[i] = 1
    #             col[j] = 1
    
    # for i in range(n):
    #     for j in range(m):
    #         if row[i] == 1 or col[j] == 1:
    #             matrix[i][j] = 0





    # -------- OPTIMAL APPROACH --------
    col0 = 1

    # Step 1: Mark the first row and first column
    for i in range(n):
        if matrix[i][0] == 0:
            col0 = 0
        for j in range(1, m):
            if matrix[i][j] == 0:
                matrix[i][0] = 0
                matrix[0][j] = 0

    # Step 2: Set zeros based on marks (skip first row/col)
    for i in range(1, n):
        for j in range(1, m):
            if matrix[i][0] == 0 or matrix[0][j] == 0:
                matrix[i][j] = 0

    # Step 3: Handle first row
    if matrix[0][0] == 0:
        for j in range(m):
            matrix[0][j] = 0

    # Step 4: Handle first column
    if col0 == 0:
        for i in range(n):
            matrix[i][0] = 0



# -------- INPUT SECTION --------
n = int(input("Enter number of rows: "))
m = int(input("Enter number of columns: "))

matrix = []
print("Enter matrix elements row by row: ")
for i in range(n):
    matrix.append(list(map(int, input().split())))



# -------- FUNCTION CALL --------
set_matrix_zeroes(matrix)


# -------- OUTPUT SECTION --------
print("\nModified Matrix:")
for row in matrix:
    print(*row)