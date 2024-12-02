package org.example.Recursion.sortingAndSearching;

/**
 * The QuickSort class contains methods to perform the QuickSort algorithm on an array of integers.
 */
public class QuickSort {

    /**
     * The main method is the entry point of the program.
     * It initializes an array of integers, sorts it using the QuickSort algorithm, and prints the sorted array.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Sorts the given array using the QuickSort algorithm.
     * The algorithm selects a pivot element and partitions the array around the pivot, then recursively sorts the subarrays.
     *
     * @param arr The array to be sorted.
     * @param low The starting index of the array segment to be sorted.
     * @param high The ending index of the array segment to be sorted.
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    /**
     * Partitions the array around the pivot element.
     * Elements less than the pivot are moved to the left of the pivot, and elements greater than the pivot are moved to the right.
     *
     * @param arr The array to be partitioned.
     * @param low The starting index of the array segment to be partitioned.
     * @param high The ending index of the array segment to be partitioned.
     * @return The index of the pivot element after partitioning.
     */
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}