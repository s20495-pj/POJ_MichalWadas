package Zjazd5;

/**
 * Summary : Sudoku
 * author: Michał Wadas
 */
public class Sudoku {

    private final int[][] sudoku;
    private final int n = 9;
    //x = number we put into sudoku

    public Sudoku(int[][] sudoku) {
        this.sudoku = sudoku;
    }

    public void solve() {

        if (!backtrackSolving()) {
            System.out.println("This sudoku can't be solved.");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printNotSolved() {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean xFitsInCell(int i, int j, int x) {

        // check in row
        for (int jj = 0; jj < n; jj++) {
            if (sudoku[i][jj] == x) {
                return false;
            }
        }

        // check in column
        for (int ii = 0; ii < n; ii++) {
            if (sudoku[ii][j] == x) {
                return false;
            }
        }

        // check in box 3x3
        int boxRow = i - i % 3;
        int boxColumn = j - j % 3;

        for (int ii = 0; ii < 3; ii++) {
            for (int jj = 0; jj < 3; jj++) {
                if (sudoku[boxRow + ii][boxColumn + jj] == x) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean backtrackSolving() {
        int i = 0, j = 0;
        boolean emptyCell = false;

        for (int ii = 0; ii < n && !emptyCell; ii++) {
            for (int jj = 0; jj < n && !emptyCell; jj++) {
                if (sudoku[ii][jj] == 0) {
                    emptyCell = true;
                    i = ii;
                    j = jj;
                }
            }
        }

        if (!emptyCell) {
            return true;
        }

        for (int x = 1; x < 10; x++) {

            if (xFitsInCell(i, j, x)) {
                sudoku[i][j] = x;

                if (backtrackSolving()) {
                    return true;
                }
                sudoku[i][j] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        final int[][] sudokuToSolve = {
                {5, 0, 0, 0, 8, 0, 0, 4, 9},
                {0, 0, 0, 5, 0, 0, 0, 3, 0},
                {0, 6, 7, 3, 0, 0, 0, 0, 1},

                {1, 5, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 2, 0, 8, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 8},

                {7, 0, 0, 0, 0, 4, 1, 5, 0},
                {0, 3, 0, 0, 0, 2, 0, 0, 0},
                {4, 9, 0, 0, 0, 5, 0, 0, 3}
        };
        System.out.println("Sudoku to solve : ");

        Sudoku sudoku = new Sudoku(sudokuToSolve);
        sudoku.printNotSolved();

        System.out.println("Solved sudoku : ");
        sudoku.solve();
    }
}