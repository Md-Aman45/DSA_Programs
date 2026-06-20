def find_nge(arr):
    n = len(arr)
    nge = [-1] * n
    st = []

    for i in range(n - 1, -1, -1):

        while st and st[-1] <= arr[i]:
            st.pop()

        if st:
            nge[i] = st[-1]

        st.append(arr[i])

    return nge


n = int(input("Enter the size of arr: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

ans = find_nge(arr)

print("Next Greater Elements:")
print(ans)