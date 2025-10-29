import java.util.*;

public class SetMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements row by row: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }




        // -> brute force approach for (set matrix zeros)...
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         if (matrix[i][j] == 0) {
        //             markRow(matrix, i, cols);
        //             markCol(matrix, j, rows);
        //         }
        //     }
        // }

        // // -> Replace -1 with 0...
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         if (matrix[i][j] == -1) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }





        // -> better approach (using row[] and col[])...
        // int[] row = new int[rows];
        // int[] col = new int[cols];

        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         if (matrix[i][j] == 0) {
        //             row[i] = 1;
        //             col[j] = 1;
        //         }
        //     }
        // }

        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         if (row[i] == 1 || col[j] == 1) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }






        // -> optimal approach...
        int col0 = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    // mark the ith row...
                    matrix[i][0] = 0;

                    // marks the jth col...
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }


        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] != 0) {
                    // check for row & col...
                    if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        if (col0 == 0) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }



        // -> Print final matrix...
        System.out.println("Modify Matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }


    // -> This is only for brute approach...
    // // -> mark all elements in this row as -1 (except zeros)...
    // public static void markRow(int[][] matrix, int n, int cols) {
    //     for (int j = 0; j < cols; j++) {
    //         if (matrix[n][j] != 0) {
    //             matrix[n][j] = -1;
    //         }
    //     }
    // }

    // // -> mark all elements in this column as -1 (except zeros)...
    // public static void markCol(int[][] matrix, int m, int rows) {
    //     for (int i = 0; i < rows; i++) {
    //         if (matrix[i][m] != 0) {
    //             matrix[i][m] = -1;
    //         }
    //     }
    // }
}
