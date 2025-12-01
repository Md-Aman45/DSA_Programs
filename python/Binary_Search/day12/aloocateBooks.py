def countStudents(arr, pages):
    students = 1
    pagesStudent = 0

    for num in arr:
        if pagesStudent + num <= pages:
            pagesStudent += num
        else:
            students += 1
            pagesStudent = num
    
    return students


# def totalSum(arr):
#     total = 0
#     for num in arr:
#         total += num
    
#     return total


def findPages(arr, n, m):
    if m > n:
        return -1
    
    low = max(arr)
    # high = totalSum(arr)
    high = sum(arr)



    # ---------- Linear Search ----------
    # for pages in range(low, high + 1):
    #     cntStu = countStudents(arr, pages)

    #     if cntStu <= m:
    #         return pages
    
    # return -1





    # ---------- Binary Search ----------
    while low <= high:
        mid = (low + high) // 2

        cntStu = countStudents(arr, mid)

        if cntStu > m:
            low = mid + 1
        else:
            high = mid - 1
    
    return low





if __name__ == "__main__":
    n = int(input("Enter number of books: "))
    arr = list(map(int, input("Enter pages: ").split()))
    m = int(input("Enter number of students: "))

    ans = findPages(arr, n, m)

    print("Minimum pages =", ans)