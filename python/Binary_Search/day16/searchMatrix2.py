# def bs(row, target):
#     low, high = 0, len(row) - 1

#     while low <= high:
#         mid = (low + high) // 2

#         if row[mid] == target:
#             return mid
#         elif row[mid] < target:
#             low = mid + 1
#         else:
#             high = mid - 1

#     return -1


# def search_matrix(mat, target):
#     n = len(mat)
#     m = len(mat[0])

#     for i in range(n):
#         index = bs(mat[i], target)
#         if index != -1:
#             return [i, index]

#     return [-1, -1]





def search_matrix(mat, target):
    n = len(mat)
    m = len(mat[0])

    row = 0
    col = m - 1

    while row < n and col >= 0:
        if mat[row][col] == target:
            return [row, col]
        
        elif mat[row][col] < target:
            row += 1
        
        else:
            col -= 1
        
    return [-1, -1]





if __name__ == "__main__":
    n = int(input("Enter number of rows: "))
    m = int(input("Enter number of columns: "))

    mat = []
    print("Enter matrix elements:")
    for _ in range(n):
        mat.append(list(map(int, input().split())))

    target = int(input("Enter target: "))

    ans = search_matrix(mat, target)

    print("Result:", "{" + str(ans[0]) + ", " + str(ans[1]) + "}")
