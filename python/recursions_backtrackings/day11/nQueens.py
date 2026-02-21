def solve_n_queens(n):
    def solve(col):
        if col == n:
            ans.append(board.copy())
            return

        for row in range(n):
            if left_row[row] == 0 and \
               lower_diag[row + col] == 0 and \
               upper_diag[n - 1 + col - row] == 0:

                board[row] = board[row][:col] + "Q" + board[row][col+1:]

                left_row[row] = 1
                lower_diag[row + col] = 1
                upper_diag[n - 1 + col - row] = 1

                solve(col + 1)

                board[row] = board[row][:col] + "." + board[row][col+1:]

                left_row[row] = 0
                lower_diag[row + col] = 0
                upper_diag[n - 1 + col - row] = 0

    board = ["." * n for _ in range(n)]
    ans = []

    left_row = [0] * n
    lower_diag = [0] * (2 * n - 1)
    upper_diag = [0] * (2 * n - 1)

    solve(0)
    return ans


def print_chess_board(solution):
    n = len(solution)

    print("    ", end="")
    for i in range(n):
        print(f"  {chr(65+i)} ", end="")
    print()

    for i in range(n):
        print("    " + "+----" * n + "+")

        print(f"{i+1}   ", end="")
        for j in range(n):
            if solution[i][j] == 'Q':
                print("| ♛  ", end="")
            else:
                print("|    ", end="")
        print("|")

    print("    " + "+----" * n + "+")
    print("\n" + "=" * 50 + "\n")


# -------- Main --------
n = int(input("Enter board size (n): "))

solutions = solve_n_queens(n)

print(f"\nTotal Solutions: {len(solutions)}\n")

for sol in solutions:
    print_chess_board(sol)