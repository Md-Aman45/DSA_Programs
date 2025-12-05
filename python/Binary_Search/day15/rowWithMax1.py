# def rowWithMax1s(arr, n, m):
#     max_count = 0
#     index = -1

#     for i in range(n):
#         cnt = sum(arr[i])
#         if cnt > max_count:
#             max_count = cnt
#             index = i

#     return index




# ---------- Binary Search ----------
# import bisect

# def rowWithMax1s(arr, n, m):
#     max_ones = 0
#     index = -1

#     for i in range(n):
#         pos = bisect.bisect_left(arr[i], 1)
#         ones = m - pos

#         if ones > max_ones:
#             max_ones = ones
#             index = i

#     return index





def rowWithMax1s(arr, n, m):
    row = -1
    j = m - 1

    for i in range(n):
        while j >= 0 and arr[i][j] == 1:
            j -= 1
            row = i

    return row






if __name__ == "__main__":
    n = int(input("Enter number of rows: "))
    m = int(input("Enter number of columns: "))

    arr = []
    print("Enter matrix elements (0s and 1s):")
    for _ in range(n):
        row = list(map(int, input().split()))
        arr.append(row)

    ans = rowWithMax1s(arr, n, m)
    print(f"Brute Force: Row with maximum number of 1s = {ans}th index")