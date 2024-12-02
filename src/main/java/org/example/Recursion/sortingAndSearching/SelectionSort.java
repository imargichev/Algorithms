package org.example.Recursion.sortingAndSearching;

/**
 * The SelectionSort class contains methods to perform the SelectionSort algorithm on an array of integers.
 */
public class SelectionSort {

    /**
     * The main method is the entry point of the program.
     * It initializes an array of integers, sorts it using the SelectionSort algorithm, and prints the sorted array.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Sorts the given array using the SelectionSort algorithm.
     * The algorithm repeatedly finds the minimum element from the unsorted part and puts it at the beginning.
     *
     * @param arr The array to be sorted.
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}