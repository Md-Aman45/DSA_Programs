# def search_matrix(arr, target):
#     for row in arr:
#         for val in row:
#             if val == target:
#                 return True
#     return False


def search_matrix(matrix, target):
    n = len(matrix)
    m = len(matrix[0])

    low, high = 0, n * m - 1

    while low <= high:
        mid = (low + high) // 2
        row = mid // m
        col = mid % m

        if matrix[row][col] == target:
            return True
        elif matrix[row][col] < target:
            low = mid + 1
        else:
            high = mid - 1

    return False







if __name__ == "__main__":
    n = int(input("Enter number of rows: "))
    m = int(input("Enter number of columns: "))

    arr = []
    print("Enter matrix elements row by row:")
    for _ in range(n):
        row = list(map(int, input().split()))
        arr.append(row)

    target = int(input("Enter target: "))

    ans = search_matrix(arr, target)
    print("Target found:", ans)