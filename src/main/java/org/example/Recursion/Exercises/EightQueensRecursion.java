package org.example.Recursion.Exercises;

import java.util.HashSet;

/**
 * The EightQueensRecursion class contains methods to solve the Eight Queens problem using recursion.
 */
public class EightQueensRecursion {

    private static final int SIZE = 8;
    private static int[][] board = new int[SIZE][SIZE];
    private static HashSet<Integer> attackedRows = new HashSet<>();
    private static HashSet<Integer> attackedCols = new HashSet<>();
    private static HashSet<Integer> attackedDiagonals1 = new HashSet<>(); // For \ diagonals
    private static HashSet<Integer> attackedDiagonals2 = new HashSet<>(); // For / diagonals

    /**
     * Solves the Eight Queens problem by placing queens on the board row by row.
     *
     * @param row The current row to place a queen.
     */
    public static void solve(int row) {
        if (row == SIZE) {
            printSolution();
            return;
        }
        for (int col = 0; col < SIZE; col++) {
            if (canPlaceQueen(row, col)) {
                markAttackedFields(row, col);
                solve(row + 1);
                unmarkAttackedFields(row, col);
            }
        }
    }

    /**
     * Checks if a queen can be placed at the given position on the board.
     *
     * @param row The row index.
     * @param col The column index.
     * @return True if the queen can be placed, otherwise false.
     */
    private static boolean canPlaceQueen(int row, int col) {
        int diag1 = row - col; // \ diagonal
        int diag2 = row + col; // / diagonal
        return !attackedRows.contains(row) &&
                !attackedCols.contains(col) &&
                !attackedDiagonals1.contains(diag1) &&
                !attackedDiagonals2.contains(diag2);
    }

    /**
     * Prints the current solution of the board.
     */
    private static void printSolution() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] == 1 ? "* " : "- ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Unmarks the fields attacked by a queen placed at the given position.
     *
     * @param row The row index.
     * @param col The column index.
     */
    private static void unmarkAttackedFields(int row, int col) {
        board[row][col] = 0;
        attackedRows.remove(row);
        attackedCols.remove(col);
        attackedDiagonals1.remove(row - col); // \ diagonal
        attackedDiagonals2.remove(row + col); // / diagonal
    }

    /**
     * Marks the fields attacked by a queen placed at the given position.
     *
     * @param row The row index.
     * @param col The column index.
     */
    private static void markAttackedFields(int row, int col) {
        board[row][col] = 1;
        attackedRows.add(row);
        attackedCols.add(col);
        attackedDiagonals1.add(row - col); // \ diagonal
        attackedDiagonals2.add(row + col); // / diagonal
    }

    /**
     * The main method is the entry point of the program.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        solve(0);
    }
}