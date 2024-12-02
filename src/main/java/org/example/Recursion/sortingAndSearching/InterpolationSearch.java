package org.example.Recursion.sortingAndSearching;

/**
 * The InterpolationSearch class contains methods to perform the Interpolation Search algorithm on an array of integers.
 */
public class InterpolationSearch {

    /**
     * The main method is the entry point of the program.
     * It initializes an array of integers, searches for a target value using the Interpolation Search algorithm, and prints the index of the target value.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;
        int index = interpolationSearch(arr, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    /**
     * Searches for the target value in the given sorted array using the Interpolation Search algorithm.
     * The algorithm estimates the position of the target value based on the values at the ends of the current search interval.
     *
     * @param arr The sorted array to be searched.
     * @param key The value to be searched for.
     * @return The index of the target value if found, otherwise -1.
     */
    public static int interpolationSearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && key >= arr[low] && key <= arr[high]) {
            if (low == high) {
                if (arr[low] == key) {
                    return low;
                }
                return -1;
            }

            int pos = low + ((key - arr[low]) * (high - low) / (arr[high] - arr[low]));

            if (arr[pos] == key) {
                return pos;
            }

            if (arr[pos] < key) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }

        return -1;
    }
}