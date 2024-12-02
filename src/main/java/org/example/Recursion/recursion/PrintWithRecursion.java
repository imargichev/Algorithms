package org.example.Recursion.recursion;

/**
 * The PrintWithRecursion class contains a method to print patterns using recursion.
 */
public class PrintWithRecursion {

    /**
     * The main method is the entry point of the program.
     * It calls the print method to print patterns.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        print(5);
    }

    /**
     * Recursively prints patterns of asterisks and hashes.
     *
     * @param indx The current index to determine the number of characters to print.
     */
    static void print(int indx) {
        // Base case: if the index is 0, return
        if (indx == 0) return;

        // Print asterisks for the current index
        System.out.println("*".repeat(indx));
        // Recursive call to print the next pattern
        print(indx - 1);
        // Print hashes for the current index
        System.out.println("#".repeat(indx));
    }
}