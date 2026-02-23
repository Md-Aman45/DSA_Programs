def isSafe(node, graph, color, col):
    for adj in graph[node]:
        if color[adj] == col:
            return False
    
    return True


def solve(node, graph, color, n, m):
    if node == n:
        return True
    
    for col in range(1, m + 1):
        if isSafe(node, graph, color, col):
            color[node] = col

            if solve(node + 1, graph, color, n, m):
                return True
            
            color[node] = 0
    
    return False




# ---------------- MAIN ----------------

n = int(input("Enter number of vertices: "))
e = int(input("Enter number of edges: "))

graph = [[] for _ in range(n)]

print("Enter edges (u v):")
for _ in range(e):
    u, v = map(int, input().split())

    u -= 1
    v -= 1

    graph[u].append(v)
    graph[v].append(u)

m = int(input("Enter number of colors: "))

color = [0] * n

if solve(0, graph, color, n, m):
    print("Coloring possible!")
    for i in range(n):
        print(f"Vertex {i+1} -> Color {color[i]}")
    
else:
    print("Coloring NOT possible!")