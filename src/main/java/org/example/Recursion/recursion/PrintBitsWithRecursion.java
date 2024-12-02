package org.example.Recursion.recursion;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * The PrintBitsWithRecursion class contains a method to generate and print all binary numbers of a given length using recursion.
 */
public class PrintBitsWithRecursion {

    /**
     * The main method is the entry point of the program.
     * It initializes an array of integers and calls the generate method to print all binary numbers.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = new int[8];

        // Generate and print all binary numbers of length 8
        generate(0, arr);
    }

    /**
     * Recursively generates and prints all binary numbers of a given length.
     *
     * @param index The current index in the array.
     * @param arr   The array to store the binary number.
     */
    public static void generate(int index, int[] arr) {
        // Base case: if the current index is equal to the length of the array, print the binary number
        if (index == arr.length) {
            String result = Arrays.stream(arr)
                    .mapToObj(String::valueOf)  // Convert each int to String
                    .collect(Collectors.joining(" "));  // Join with a space
            System.out.println(result);
        } else {
            // Recursive case: set the current index to 0 and 1, and generate the next binary number
            for (int i = 0; i <= 1; i++) {
                arr[index] = i;
                generate(index + 1, arr);
            }
        }
    }
}