package org.example.Recursion.sortingAndSearching;

/**
 * The InsertionSort class contains methods to perform the InsertionSort algorithm on an array of integers.
 */
public class InsertionSort {

    /**
     * The main method is the entry point of the program.
     * It initializes an array of integers, sorts it using the InsertionSort algorithm, and prints the sorted array.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Sorts the given array using the InsertionSort algorithm.
     * The algorithm builds the sorted array one item at a time by comparing each new item to the already sorted items and inserting it in the correct position.
     *
     * @param arr The array to be sorted.
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}