package org.example.Recursion.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllPathInALabyrinth {
    static char[][] labyrinth;
    static List<Character> path = new ArrayList<>();

    static boolean outSideOfLabyrinth(int row, int col) {
        return row < 0 || row >= labyrinth.length || col < 0 || col >= labyrinth[0].length;
    }

    static boolean isPassable(int row, int col) {
        return labyrinth[row][col] != 'x' && labyrinth[row][col] != '*';
    }

    static boolean isExit(int row, int col) {
        return labyrinth[row][col] == 'e';
    }

    static void solve(int row, int col, char direction) {
        if (outSideOfLabyrinth(row, col)) {
            return;
        }
        if (isExit(row, col)) {
            printSolution();
        } else if (isPassable(row, col)) {
            labyrinth[row][col] = 'x';
            path.add(direction);

            solve(row + 1, col, 'D');
            solve(row - 1, col, 'U');
            solve(row, col - 1, 'L');
            solve(row, col + 1, 'R');

            labyrinth[row][col] = '_';
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        int cols = Integer.parseInt(sc.nextLine());

        labyrinth = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            labyrinth[i] = sc.nextLine().toCharArray();
        }

        solve(0, 0, 'S');
    }

    static void printSolution() {
        for (char step : path) {
            System.out.print(step);
        }
        System.out.println();
    }
}