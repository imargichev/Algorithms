package org.example.Recursion.sortingAndSearching;

/**
 * The BubbleSort class contains methods to perform the BubbleSort algorithm on an array of integers.
 */
public class BubbleSort {

    /**
     * The main method is the entry point of the program.
     * It initializes an array of integers, sorts it using the BubbleSort algorithm, and prints the sorted array.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Sorts the given array using the BubbleSort algorithm.
     * The algorithm repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
     *
     * @param arr The array to be sorted.
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }
}