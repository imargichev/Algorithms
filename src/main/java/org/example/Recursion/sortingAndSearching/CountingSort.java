package org.example.Recursion.sortingAndSearching;

/**
 * The CountingSort class contains methods to perform the CountingSort algorithm on an array of integers.
 */
public class CountingSort {

    /**
     * The main method is the entry point of the program.
     * It initializes an array of integers, sorts it using the CountingSort algorithm, and prints the sorted array.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 5, 2, 3};
        countingSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Sorts the given array using the CountingSort algorithm.
     * The algorithm counts the occurrences of each value and then reconstructs the sorted array.
     *
     * @param arr The array to be sorted.
     */
    public static void countingSort(int[] arr) {
        // Find the maximum value in the array
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        // Create a count array to store the count of each unique value
        int[] count = new int[max + 1];
        for (int i : arr) {
            count[i]++;
        }

        // Reconstruct the sorted array from the count array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[index] = i;
                index++;
            }
        }
    }
}