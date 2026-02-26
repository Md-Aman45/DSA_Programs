def findPath(m, n):
    ans = []

    if m[0][0] == 0:
        return ans

    visited = [[0]*n for _ in range(n)]

    di = [1, 0, 0, -1]
    dj = [0, -1, 1, 0]
    directions = "DLRU"

    def solve(i, j, path):
        if i == n-1 and j == n-1:
            ans.append(path)
            return

        for ind in range(4):
            nexti = i + di[ind]
            nextj = j + dj[ind]

            if (0 <= nexti < n and
                0 <= nextj < n and
                visited[nexti][nextj] == 0 and
                m[nexti][nextj] == 1):

                visited[nexti][nextj] = 1
                solve(nexti, nextj, path + directions[ind])
                visited[nexti][nextj] = 0

    visited[0][0] = 1
    solve(0, 0, "")

    ans.sort()
    return ans


# -------- MAIN --------
n = int(input("Enter n: "))

print("Enter matrix:")
m = []
for _ in range(n):
    row = list(map(int, input().split()))
    m.append(row)

result = findPath(m, n)

print("Paths:")
for path in result:
    print(path)