def solve_sudoko(board):
    def is_valid(row, col, c):
        for i in range(9):
            if board[row][i] == c:
                return False
            
        for i in range(9):
            if board[i][col] == c:
                return False
            
        start_row = 3 * (row // 3)
        start_col = 3 * (col // 3)

        for i in range(3):
            for j in range(3):
                if board[start_row + i][start_col + j] == c:
                    return False
        
        return True
    

    def solve():
        for i in range(9):
            for j in range(9):
                if board[i][j] == '.':

                    for c in "123456789":
                        if is_valid(i, j, c):
                            board[i][j] = c

                            if solve():
                                return True
                            else:
                                board[i][j] = '.'
                    
                    return False
        return True
    

    solve()



def print_board(board):
    print("\nSolved Sudoku:\n")

    for i in range(9):

        if i % 3 == 0:
            print("-------------------------")

        for j in range(9):

            if j % 3 == 0:
                print("| ", end="")

            print(board[i][j] + " ", end="")

        print("|")

    print("-------------------------")


print("Enter Sudoku (use . for empty cells):")

board = []
for _ in range(9):
    row = input()
    board.append(list(row))

solve_sudoko(board)
print_board(board)